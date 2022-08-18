package com.ngocdat.mp3;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.gms.common.util.JsonUtils;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ngocdat.mp3.adapter.PlayAudioManager;
import com.ngocdat.mp3.database.BaiHatDao;
import com.ngocdat.mp3.database.LichSuDao;
import com.ngocdat.mp3.model.BaiHat;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Random;

import static com.ngocdat.mp3.fragment.TrangChuFragment.resetListGanDay;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    static RelativeLayout layout_play;
    static ImageView truoc, phatnhac, tiep, dung, dong;
    static BottomNavigationView menu_bot;
    static TextView ten_baihat, ten_casi;
    static PlayAudioManager playAudioManager;
    static BaiHat baiHatx;
    static ArrayList<BaiHat> listBH = new ArrayList<>();
    static int positionBH;
    static int doannhac;
    static LinearLayout show_full;
    static String time = "";
    static Boolean laplai = false;
    static BaiHatDao baiHatDao;
    static Boolean isYeuThich = false;
    static LichSuDao lichSuDao;
    Runnable mUpdateTime;
    Handler mHandler = new Handler();
    RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setUpNavigation();
    }

    public void setUpNavigation() {
        bottomNavigationView = findViewById(R.id.bttm_nav);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragmentContainerView);
        NavigationUI.setupWithNavController(bottomNavigationView,
                navHostFragment.getNavController());
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public static void phatnhac(ArrayList<BaiHat> list, int position) {
        Log.d("testBH", "position: " + position + " size: " + list.size());
        listBH.clear();
        listBH.addAll(list);
        positionBH = position;
        baiHatx = list.get(position);
        Log.d("testBH", "position2: " + positionBH + " size2: " + listBH.size());
        Log.d("testBH", "link: " + baiHatx.getLink());
        ten_baihat.setText(baiHatx.getTenbaihat());
        ten_casi.setText(baiHatx.getCasi());
        layout_play.setVisibility(View.VISIBLE);
        phatnhac.setVisibility(View.GONE);
        dung.setVisibility(View.VISIBLE);
        Log.d("testBH", "link: " + baiHatx.getLink());
        //Mở trình phát nhạc
        playAudioManager.playAudio(baiHatx.getLink());
        if (lichSuDao.kiemtraTonTai(baiHatx)) {
            lichSuDao.xoa(baiHatx);
            lichSuDao.them(baiHatx);
        } else {
            lichSuDao.them(baiHatx);
        }
    }

    private void init() {
        lichSuDao = new LichSuDao(MainActivity.this);
        baiHatDao = new BaiHatDao(this);
        layout_play = findViewById(R.id.ln_play);
        truoc = findViewById(R.id.iv_truoc);
        phatnhac = findViewById(R.id.iv_play);
        dung = findViewById(R.id.iv_dung);
        tiep = findViewById(R.id.iv_tiep);
        ten_baihat = findViewById(R.id.tv_baihat);
        ten_casi = findViewById(R.id.tv_casi);
        dong = findViewById(R.id.iv_dong);
        menu_bot = findViewById(R.id.bttm_nav);
        show_full = findViewById(R.id.show_full);

        playAudioManager = new PlayAudioManager(MainActivity.this);

        //Điều khiển nhạc
        dong.setOnClickListener(v -> {
            menu_bot.setVisibility(View.VISIBLE);
            layout_play.setVisibility(View.GONE);
            playAudioManager.killMediaPlayer();
        });

        //Dừng và lưu lại thời gian đã dừg để có thể tiếp tục
        dung.setOnClickListener(v -> {
            phatnhac.setVisibility(View.VISIBLE);
            dung.setVisibility(View.GONE);
            doannhac = playAudioManager.dung();
        });

        //Phát nhạc
        phatnhac.setOnClickListener(v -> {
            baiHatx = listBH.get(positionBH);
            ten_baihat.setText(baiHatx.getTenbaihat());
            ten_casi.setText(baiHatx.getCasi());
            phatnhac.setVisibility(View.GONE);
            dung.setVisibility(View.VISIBLE);
            playAudioManager.phatnhac(doannhac);
        });

        //Bài hát trước đó
        truoc.setOnClickListener(v -> {
            phatnhac.setVisibility(View.GONE);
            dung.setVisibility(View.VISIBLE);
            positionBH = playAudioManager.baihattruocdo(listBH, positionBH);
            baiHatx = listBH.get(positionBH);
            ten_baihat.setText(baiHatx.getTenbaihat());
            ten_casi.setText(baiHatx.getCasi());
            if (lichSuDao.kiemtraTonTai(baiHatx)) {
                lichSuDao.xoa(baiHatx);
                lichSuDao.them(baiHatx);
            } else {
                lichSuDao.them(baiHatx);
            }
            resetListGanDay();
        });

        //Bài hát tiếp theo
        tiep.setOnClickListener(v -> {
            phatnhac.setVisibility(View.GONE);
            dung.setVisibility(View.VISIBLE);
            positionBH = playAudioManager.baihatketiep(listBH, positionBH);
            baiHatx = listBH.get(positionBH);
            ten_baihat.setText(baiHatx.getTenbaihat());
            ten_casi.setText(baiHatx.getCasi());
            if (lichSuDao.kiemtraTonTai(baiHatx)) {
                lichSuDao.xoa(baiHatx);
                lichSuDao.them(baiHatx);
            } else {
                lichSuDao.them(baiHatx);
            }
            resetListGanDay();
        });

        //Bấm vào thanh phát nhạc sẽ hiện trình phát nhạc lớn
        show_full.setOnClickListener(v -> showMP3Full());
    }

    public void showMP3Full() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.mp3_full);
        dialog.setCancelable(true);
        Window window = dialog.getWindow();
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        if (dialog != null && dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        ImageView closex, phatx, dungx, tiepx, truocx, laplaix, yeuthichx, anhx;
        TextView baihatx, casix, ketthuc, batdaux;
        AppCompatSeekBar seekBar;
        closex = dialog.findViewById(R.id.iv_close);
        phatx = dialog.findViewById(R.id.btn_phat);
        dungx = dialog.findViewById(R.id.btn_dung);
        tiepx = dialog.findViewById(R.id.btn_tiep);
        truocx = dialog.findViewById(R.id.btn_truoc);
        laplaix = dialog.findViewById(R.id.iv_laplai);
        yeuthichx = dialog.findViewById(R.id.iv_yeuthich);
        anhx = dialog.findViewById(R.id.iv_anh_daidien);
        baihatx = dialog.findViewById(R.id.tv_tenBaiHat);
        casix = dialog.findViewById(R.id.tv_casi);
        ketthuc = dialog.findViewById(R.id.tv_ketthuc);
        batdaux = dialog.findViewById(R.id.tv_batdau);
        seekBar = dialog.findViewById(R.id.seekbar);
        layout = dialog.findViewById(R.id.layout_phatnhac);

        randomLayout();

        //Set thời gian
        ketthuc.setText(playAudioManager.getTime());

        //Set tên bài hát
        baihatx.setText(baiHatx.getTenbaihat());
        casix.setText(baiHatx.getCasi());

        //Đóng
        closex.setOnClickListener(v -> dialog.dismiss());

        //Xoay ảnh
        RotateAnimation rotate = new RotateAnimation(360, 0, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(15000);
        rotate.setInterpolator(new LinearInterpolator());
        rotate.setRepeatCount(Animation.INFINITE);
        anhx.startAnimation(rotate);
        //Set Ảnh
        try {
            Picasso.get().load(baiHatx.getImg()).placeholder(R.drawable.phat_nhac_full).error(R.drawable.phat_nhac_full).into(anhx);
        } catch (Exception e) {

        }
        //Kiểm tra đang phát hay dừng
        if (!playAudioManager.getIsPlay()) {
            anhx.clearAnimation();
            phatx.setVisibility(View.VISIBLE);
            dungx.setVisibility(View.GONE);
            try {
                batdaux.setText(playAudioManager.getThoigianPhat());
                seekBar.setProgress(playAudioManager.getProgress());
                ketthuc.setText(playAudioManager.getTime());
            } catch (Exception e) {

            }
        } else {
            //kiểm tra seekbar
            mUpdateTime = new Runnable() {
                @Override
                public void run() {
                    try {
                        batdaux.setText(playAudioManager.getThoigianPhat());
                        seekBar.setProgress(playAudioManager.getProgress());
                        ketthuc.setText(playAudioManager.getTime());
                    } catch (Exception e) {

                    }

                    if (seekBar.getProgress() != 100) {
                        mHandler.postDelayed(this, 1000);
                    } else {
                        if (playAudioManager.isLaplai()) {
                            mHandler.postDelayed(this, 1000);
                        } else {
                            tiepx.performClick();
                            mHandler.postDelayed(this, 1000);
                        }
                    }
                }
            };
            mUpdateTime.run();
        }

        //Set nhảy nhạc
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int progress = seekBar.getProgress();
                Log.d("testBH", "quá trình: " + progress);
                seekBar.setProgress(progress);
                playAudioManager.nhayNhac(progress);
                batdaux.setText(playAudioManager.getThoigianPhat());
            }
        });
        //Điều khiển
        phatx.setOnClickListener(v -> {
            anhx.startAnimation(rotate);
            phatnhac.performClick();
            phatx.setVisibility(View.GONE);
            dungx.setVisibility(View.VISIBLE);
            try {
                batdaux.setText(playAudioManager.getThoigianPhat());
                batdaux.setText(playAudioManager.getThoigianPhat());
                seekBar.setProgress(playAudioManager.getProgress());
                ketthuc.setText(playAudioManager.getTime());
            } catch (Exception e) {

            }
        });
        dungx.setOnClickListener(v -> {
            anhx.clearAnimation();
            dung.performClick();
            phatx.setVisibility(View.VISIBLE);
            dungx.setVisibility(View.GONE);
            ketthuc.setText(playAudioManager.getTime());
        });
        truocx.setOnClickListener(v -> {
            randomLayout();
            anhx.startAnimation(rotate);
            truoc.performClick();
            //Set tên bài hát
            baihatx.setText(baiHatx.getTenbaihat());
            casix.setText(baiHatx.getCasi());
            phatx.setVisibility(View.GONE);
            dungx.setVisibility(View.VISIBLE);
            try {
                //Set Ảnh
                Picasso.get().load(baiHatx.getImg()).placeholder(R.drawable.phat_nhac_full).error(R.drawable.phat_nhac_full).into(anhx);

                batdaux.setText(playAudioManager.getThoigianPhat());
                seekBar.setProgress(playAudioManager.getProgress());
                ketthuc.setText(playAudioManager.getTime());
            } catch (Exception e) {

            }
        });
        tiepx.setOnClickListener(v -> {
            randomLayout();
            anhx.startAnimation(rotate);
            tiep.performClick();
            //Set tên bài hát
            baihatx.setText(baiHatx.getTenbaihat());
            casix.setText(baiHatx.getCasi());
            phatx.setVisibility(View.GONE);
            dungx.setVisibility(View.VISIBLE);
            try {
                //Set Ảnh
                Picasso.get().load(baiHatx.getImg()).placeholder(R.drawable.phat_nhac_full).error(R.drawable.phat_nhac_full).into(anhx);
                batdaux.setText(playAudioManager.getThoigianPhat());
                seekBar.setProgress(playAudioManager.getProgress());
                ketthuc.setText(playAudioManager.getTime());
            } catch (Exception e) {

            }
        });
        // lặp lại
        laplaix.setOnClickListener(v -> {
            laplai = !laplai;
            if (laplai) {
                playAudioManager.laplai(laplai);
                laplaix.setColorFilter(R.color.red, android.graphics.PorterDuff.Mode.MULTIPLY);
            } else {
                playAudioManager.laplai(laplai);
                laplaix.setColorFilter(getResources().getColor(R.color.green), android.graphics.PorterDuff.Mode.MULTIPLY);
            }
        });
        // yêu thích
        if (baiHatDao.kiemtraTonTai(baiHatx)) {
            yeuthichx.setColorFilter(getResources().getColor(android.R.color.holo_red_dark), android.graphics.PorterDuff.Mode.MULTIPLY);
        } else {
            yeuthichx.setColorFilter(getResources().getColor(R.color.green), android.graphics.PorterDuff.Mode.MULTIPLY);
        }
        yeuthichx.setOnClickListener(v -> {
            if (!baiHatDao.kiemtraTonTai(baiHatx)) {
                if (baiHatDao.them(baiHatx)) {
                    Toast.makeText(this, "Đã thêm vào yêu thích", Toast.LENGTH_SHORT).show();
                    yeuthichx.setColorFilter(getResources().getColor(android.R.color.holo_red_dark), android.graphics.PorterDuff.Mode.MULTIPLY);
                }
            } else {
                if (baiHatDao.xoa(baiHatx)) {
                    Toast.makeText(this, "Đã xoá bài hát yêu thích", Toast.LENGTH_SHORT).show();
                    yeuthichx.setColorFilter(getResources().getColor(R.color.green), android.graphics.PorterDuff.Mode.MULTIPLY);
                }
            }
        });

        dialog.show();

        dialog.show();
    }

    private void randomLayout(){
        //Random layout
        int random = (int)(Math.random() * 4 + 1);
        switch (random){
            case 1: layout.setBackgroundResource(R.drawable.bg2); break;
            case 2: layout.setBackgroundResource(R.drawable.bg2); break;
            case 3: layout.setBackgroundResource(R.drawable.bg2); break;
            case 4: layout.setBackgroundResource(R.drawable.bg2); break;
        }
    }
}