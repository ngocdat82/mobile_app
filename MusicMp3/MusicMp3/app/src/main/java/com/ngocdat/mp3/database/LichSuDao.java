package com.ngocdat.mp3.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.ngocdat.mp3.model.BaiHat;

import java.util.ArrayList;

public class LichSuDao {
    Database dtb;
    SQLiteDatabase db;

    public LichSuDao(Context context) {
        dtb = new Database(context);
        db = dtb.getWritableDatabase();
    }

    //Lấy toàn bộ list bài hát lịch sử
    public ArrayList<BaiHat> getAll() {
        ArrayList<BaiHat> list = new ArrayList<>();
        Cursor cs = db.rawQuery("SELECT * FROM lichsu", null);
        cs.moveToFirst();
        while (!cs.isAfterLast()) {
            String id = cs.getString(0);
            String tenbaihat = cs.getString(1);
            String theloai = cs.getString(2);
            String casi = cs.getString(3);
            String img = cs.getString(4);
            String link = cs.getString(5);
            String album = cs.getString(6);
            BaiHat baiHat = new BaiHat(id, tenbaihat, theloai, casi, img, link, album);
            list.add(baiHat);
            cs.moveToNext();
        }
        cs.close();
        return list;
    }

    //Thêm bài hát lịch sử
    public boolean them(BaiHat baiHat) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", baiHat.getId());
        contentValues.put("tenbaihat", baiHat.getTenbaihat());
        contentValues.put("theloai", baiHat.getTheloai());
        contentValues.put("casi", baiHat.getCasi());
        contentValues.put("img", baiHat.getImg());
        contentValues.put("link", baiHat.getLink());
        contentValues.put("album", baiHat.getAlbum());
        long r = db.insert("lichsu", null, contentValues);
        if (r <= 0) {
            return false;
        }
        return true;
    }


    //Xóa bai hát lịch sử
    public boolean xoa(BaiHat baiHat) {
        int r = db.delete("lichsu", "id=?", new String[]{baiHat.getId()});
        if (r <= 0) {
            return false;
        }
        return true;
    }

    //Kiểm tra bài hát có tồn tại không
    public boolean kiemtraTonTai(BaiHat baiHat) {
        Cursor cursor = null;
        String sql = "SELECT id FROM lichsu WHERE id='" + baiHat.getId() + "'";
        cursor = db.rawQuery(sql, null);
        if (cursor.getCount() > 0) {
            cursor.close();
            return true;
        } else {
            cursor.close();
            return false;
        }
    }
}
