package com.ngocdat.mp3.adapter;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

import com.ngocdat.mp3.MainActivity;
import com.ngocdat.mp3.database.LichSuDao;
import com.ngocdat.mp3.model.BaiHat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class PlayAudioManager {
    private MediaPlayer mediaPlayer;
    private Context context;
    private Boolean isPlay;
    private Boolean laplai = false;

    public PlayAudioManager() {
    }

    public Boolean getIsPlay() {
        return isPlay;
    }

    public PlayAudioManager(Context context) {
        this.context = context;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void playAudio(final String url) {
        try {
            if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(context, Uri.parse(url));
            } else {
                killMediaPlayer();
                mediaPlayer = MediaPlayer.create(context, Uri.parse(url));
            }
            mediaPlayer.setOnCompletionListener(mp -> killMediaPlayer());
            isPlay = true;
            mediaPlayer.start();
        } catch (Exception e) {

        }
    }

    public void killMediaPlayer() {
        if (mediaPlayer != null) {
            try {
                isPlay = false;
                mediaPlayer.reset();
                mediaPlayer.release();
                mediaPlayer = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int dung() {
        isPlay = false;
        mediaPlayer.pause();
        return mediaPlayer.getCurrentPosition();
    }

    public void phatnhac(int doannhac) {
        try {
            isPlay = true;
            mediaPlayer.seekTo(doannhac);
            mediaPlayer.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public Integer baihatketiep(ArrayList<BaiHat> baiHats, int posision) {
        isPlay = true;
        if (posision == baiHats.size() - 1) {
            posision = 0;
        } else {
            posision++;
        }
        try {
            mediaPlayer.reset();
            mediaPlayer.setDataSource(context, Uri.parse(baiHats.get(posision).getLink()));
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        } else {
            mediaPlayer.start();
        }
        mediaPlayer.start();
        return posision;
    }

    public Integer baihattruocdo(ArrayList<BaiHat> baiHats, int posision) {
        isPlay = true;
        if (posision == 0) {
            posision = baiHats.size() - 1;
        } else {
            posision--;
        }
        try {
            mediaPlayer.reset();
            mediaPlayer.setDataSource(context, Uri.parse(baiHats.get(posision).getLink()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        } else {
            mediaPlayer.start();
        }

        mediaPlayer.start();
        return posision;
    }

    @SuppressLint("DefaultLocale")
    public String getTime() {
        int totalSecs = mediaPlayer.getDuration();
        long minutes = (totalSecs / 1000) / 60;
        int seconds = (totalSecs / 1000) % 60;
//        int hour = (totalSecs / 1000) % 3600;
        long hour = 00;
        if (minutes > 60) {
            hour = minutes / 60;
            minutes = minutes % 60;
            return hour + ":" + minutes + ":" + seconds;
        } else {
            return "00:" + minutes + ":" + seconds;
        }
    }

    @SuppressLint("DefaultLocale")
    public String getThoigianPhat() {
        int totalSecs = mediaPlayer.getCurrentPosition();
        long minutes = (totalSecs / 1000) / 60;
        int seconds = (totalSecs / 1000) % 60;
        long hour = 00;
        if (minutes > 60) {
            hour = minutes / 60;
            minutes = minutes % 60;
            return hour + ":" + minutes + ":" + seconds;
        } else {
            return "00:" + minutes + ":" + seconds;
        }
    }

    public int getProgress() {
        Double percentage = (double) 0;

        long currentSeconds = (int) (mediaPlayer.getCurrentPosition() / 1000);
        long totalSeconds = (int) (mediaPlayer.getDuration() / 1000);

        // calculating percentage
        percentage = (((double) currentSeconds) / totalSeconds) * 100;
        // return percentage
        return percentage.intValue();
    }

    public void nhayNhac(int progress) {
        int totalSecs = mediaPlayer.getDuration();
        phatnhac((totalSecs / 100) * progress);
    }

    public void laplai(Boolean laplai) {
        this.laplai = laplai;
        mediaPlayer.setLooping(laplai);
    }

    public boolean isLaplai() {
        return laplai;
    }
}