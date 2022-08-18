package com.ngocdat.mp3.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {

    public Database(Context context) {
        super(context, "MUSIC_MP3.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Tạo bảng để check tk, mk
        String sql = "CREATE TABLE baiHat(" +
                "id text PRIMARY KEY, " +
                "tenbaihat text," +
                "theloai text," +
                "casi text," +
                "img text," +
                "link text," +
                "album text)";
        db.execSQL(sql);

        sql = "CREATE TABLE lichsu(" +
                "id text PRIMARY KEY, " +
                "tenbaihat text," +
                "theloai text," +
                "casi text," +
                "img text," +
                "link text," +
                "album text)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
