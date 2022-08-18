package com.ngocdat.mp3.fragment;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.ngocdat.mp3.MainActivity;
import com.ngocdat.mp3.R;
import com.ngocdat.mp3.adapter.BaiHatAdapter;
import com.ngocdat.mp3.adapter.HomeAdapter;
import com.ngocdat.mp3.database.LichSuDao;
import com.ngocdat.mp3.model.BaiHat;
import com.ngocdat.mp3.model.Item;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TrangChuFragment extends Fragment {
    View view;
    private RecyclerView rcv_random, rcv_ganday, rcv_moinhat;
    private ArrayList<BaiHat> listRandom = new ArrayList<>();
    private ArrayList<BaiHat> listMoiNhat = new ArrayList<>();
    static ArrayList<BaiHat> listGanDay = new ArrayList<>();
    private ArrayList<BaiHat> list = new ArrayList<>();
    private BaiHatAdapter homeBaiHatAdapter;
    static HomeAdapter ganDayAdapter;
    private HomeAdapter baiHatMoiAdapter;
    static TextView ganday, moinhat, random;
    private TextInputEditText search;
    private Button them;
    public static LichSuDao lichSuDao;

    DatabaseReference ref = FirebaseDatabase.getInstance().getReference("baihat");


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_trang_chu, container, false);
        init();
        //Set list ngang cho bài hát
        //Set cho luôn được ở giữa
        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(rcv_random);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        rcv_random.setLayoutManager(linearLayoutManager);
        homeBaiHatAdapter = new BaiHatAdapter(getContext(), listRandom);
        rcv_random.setAdapter(homeBaiHatAdapter);

        //List cho bài hát gần đây
        LinearLayoutManager lnmGanday = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        rcv_ganday.setLayoutManager(lnmGanday);
        ganDayAdapter = new HomeAdapter(getContext(), listGanDay);
        rcv_ganday.setAdapter(ganDayAdapter);

        //List cho bài hát mới nhất
        LinearLayoutManager lnmMoiNhat = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        rcv_moinhat.setLayoutManager(lnmMoiNhat);
        baiHatMoiAdapter = new HomeAdapter(getContext(), listMoiNhat);
        rcv_moinhat.setAdapter(baiHatMoiAdapter);

        //Click phát nhạc
        homeBaiHatAdapter.setOnItemClickListener(new BaiHatAdapter.ClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onItemClick(ArrayList<BaiHat> list, int position) {
                Log.d("test", "click");
                try {
                    MainActivity.phatnhac(list, position);
                    resetListGanDay();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
//
        ganDayAdapter.setOnItemClickListener(new BaiHatAdapter.ClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onItemClick(ArrayList<BaiHat> list, int position) {
                try {
                    MainActivity.phatnhac(list, position);
                    resetListGanDay();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
//
        baiHatMoiAdapter.setOnItemClickListener(new BaiHatAdapter.ClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onItemClick(ArrayList<BaiHat> list, int position) {
                try {
                    MainActivity.phatnhac(list, position);
                    resetListGanDay();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        //Bài hát gần đây mới nghe
        resetListGanDay();

        //Lấy dữ liệu bài hát
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                list.clear();
                for (DataSnapshot x : snapshot.getChildren()) {
                    BaiHat baiHat = x.getValue(BaiHat.class);
                    list.add(baiHat);
                }

                //Lọc mới được thêm
                listMoiNhat.clear();
                listMoiNhat.addAll(list);
                Collections.reverse(listMoiNhat);
                baiHatMoiAdapter.notifyDataSetChanged();
                LayoutAnimationController anim = AnimationUtils.loadLayoutAnimation(getContext(), R.anim.layout_animation);
                rcv_moinhat.setLayoutAnimation(anim);
                if (!listMoiNhat.isEmpty()) {
                    moinhat.setVisibility(View.GONE);
                }

                //Ngẫu nhiên bài hát top 10
                listRandom.clear();
                listRandom.addAll(list);
                homeBaiHatAdapter.notifyDataSetChanged();
                rcv_random.setLayoutAnimation(anim);
                if (!listRandom.isEmpty()) {
                    random.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });

        //Tìm kiếm bài hát
        caidatTimKiemHome();
        caidatTimKiemGanDay();
        caidatTimKiemMoiNhat();

        return view;
    }

    private void caidatTimKiemGanDay() {
        rcv_ganday.setFilterTouchesWhenObscured(true);
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int
                    count) {
                System.out.println("Text [" + s + "] - Start [" + start + "] - Before [" + before + "] - Count [" + count + "]");
                if (count < before) {
                    ganDayAdapter.resetData();
                }
                ganDayAdapter.getFilter().filter(s.toString());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    private void caidatTimKiemHome() {
        rcv_random.setFilterTouchesWhenObscured(true);
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int
                    count) {
                System.out.println("Text [" + s + "] - Start [" + start + "] - Before [" + before + "] - Count [" + count + "]");
                if (count < before) {
                    homeBaiHatAdapter.resetData();
                }
                homeBaiHatAdapter.getFilter().filter(s.toString());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    private void caidatTimKiemMoiNhat() {
        rcv_moinhat.setFilterTouchesWhenObscured(true);
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int
                    count) {
                System.out.println("Text [" + s + "] - Start [" + start + "] - Before [" + before + "] - Count [" + count + "]");
                if (count < before) {
                    baiHatMoiAdapter.resetData();
                }
                baiHatMoiAdapter.getFilter().filter(s.toString());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void init() {
        lichSuDao = new LichSuDao(getContext());
        rcv_ganday = view.findViewById(R.id.rcv_ganday);
        rcv_moinhat = view.findViewById(R.id.rcv_moinhat);
        rcv_random = view.findViewById(R.id.rcv_home);
        ganday = view.findViewById(R.id.tv_ganday);
        moinhat = view.findViewById(R.id.tv_moinhat);
        random = view.findViewById(R.id.tv_random);
        search = requireActivity().findViewById(R.id.search_view);
        search.setHint("Tìm tên bài hát");
        them = view.findViewById(R.id.btn_them);
        //Thêm bài hát
        them.setOnClickListener(v -> {
            themBaihat();
        });
    }

    String xcasi = "", xtheloai = "", xalbum = "";

    private void themBaihat() {
        Dialog dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.layout_them);
        dialog.setCancelable(true);
        Window window = dialog.getWindow();
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        if (dialog != null && dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;

        TextInputEditText baihat, img, link;
        Button them, dong;
        Spinner casi, theloai, album;
        ImageView tcasi, ttheloai, talbum;
        dong = dialog.findViewById(R.id.btndong);
        them = dialog.findViewById(R.id.btnthem);
        baihat = dialog.findViewById(R.id.edt_tenBaiHat);
        img = dialog.findViewById(R.id.edt_anh_bh);
        link = dialog.findViewById(R.id.edt_link_bh);
        casi = dialog.findViewById(R.id.sp_casi);
        theloai = dialog.findViewById(R.id.sp_theloai);
        album = dialog.findViewById(R.id.sp_albums);
        tcasi = dialog.findViewById(R.id.ivThemCasi);
        ttheloai = dialog.findViewById(R.id.ivThemTheLoai);
        talbum = dialog.findViewById(R.id.ivThemAlbums);

        ArrayList<String> listCasi = new ArrayList<>();
        ArrayList<String> listTheloai = new ArrayList<>();
        ArrayList<String> listAlbum = new ArrayList<>();

        //Thêm dialog
        tcasi.setOnClickListener(v -> them("casi"));
        ttheloai.setOnClickListener(v -> them("theloai"));
        talbum.setOnClickListener(v -> them("album"));

        //Setup spinner casi
        ArrayAdapter<String> adapterCasi = new ArrayAdapter(getContext(),
                android.R.layout.simple_dropdown_item_1line,
                listCasi);
        casi.setAdapter(adapterCasi);

        //Setup spinner thể loại
        ArrayAdapter<String> adapterTheloai = new ArrayAdapter(getContext(),
                android.R.layout.simple_dropdown_item_1line,
                listTheloai);
        theloai.setAdapter(adapterTheloai);

        //Setup spinner albums
        ArrayAdapter<String> adapterAlbum = new ArrayAdapter(getContext(),
                android.R.layout.simple_dropdown_item_1line,
                listAlbum);
        album.setAdapter(adapterAlbum);


        FirebaseDatabase.getInstance().getReference("casi").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                listCasi.clear();
                for (DataSnapshot x : snapshot.getChildren()) {
                    Item item = x.getValue(Item.class);
                    listCasi.add(item.getLoai());
                }
                adapterCasi.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });

        FirebaseDatabase.getInstance().getReference("theloai").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                listTheloai.clear();
                for (DataSnapshot x : snapshot.getChildren()) {
                    Item item = x.getValue(Item.class);
                    listTheloai.add(item.getLoai());
                }
                adapterTheloai.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });

        FirebaseDatabase.getInstance().getReference("album").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                listAlbum.clear();
                for (DataSnapshot x : snapshot.getChildren()) {
                    Item item = x.getValue(Item.class);
                    listAlbum.add(item.getLoai());
                }
                adapterAlbum.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });

        //Sự kiện khi click từng spinner
        casi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                xcasi = listCasi.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                xcasi = listCasi.get(0);
            }
        });

        casi.setSelection(0);
        theloai.setSelection(0);
        album.setSelection(0);

        theloai.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                xtheloai = listTheloai.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                xtheloai = listTheloai.get(0);
            }
        });

        album.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                xalbum = listAlbum.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                xalbum = listAlbum.get(0);
            }
        });


        dong.setOnClickListener(v -> dialog.dismiss());

        them.setOnClickListener(v -> {
            String xbaihat, ximg, xlink;
            xbaihat = baihat.getText().toString();
            ximg = img.getText().toString();
            xlink = link.getText().toString();

            if (!xbaihat.isEmpty() && !ximg.isEmpty() && !xlink.isEmpty() && !xcasi.isEmpty() && !xtheloai.isEmpty() && !xalbum.isEmpty()) {
                String id = FirebaseDatabase.getInstance().getReference().push().getKey();
                BaiHat baiHat = new BaiHat(id, xbaihat, xtheloai, xcasi, ximg, xlink, xalbum);
                FirebaseDatabase.getInstance().getReference("baihat").child(id).setValue(baiHat).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<Void> task) {
                        dialog.dismiss();
                        Toast.makeText(getContext(), "Thêm bài hát thành công", Toast.LENGTH_SHORT).show();
                    }
                });

            } else {
                Toast.makeText(getContext(), "Không được để trống", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
    }


    private void them(String loai) {
        Dialog dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.them_item);
        dialog.setCancelable(true);
        Window window = dialog.getWindow();
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        if (dialog != null && dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        TextInputEditText ten, link;
        Button them, dong;
        TextView title = dialog.findViewById(R.id.tv_tieude);
        ten = dialog.findViewById(R.id.edt_ten);
        link = dialog.findViewById(R.id.edt_link);
        them = dialog.findViewById(R.id.btnthem);
        dong = dialog.findViewById(R.id.btndong);

        String tieude = "", hintTen = "", hintLink = "";

        switch (loai) {
            case "casi":
                tieude = "Thêm ca sĩ";
                hintTen = "Nhập tên ca sĩ";
                hintLink = "Nhập link ảnh ca sĩ";
                break;
            case "theloai":
                tieude = "Thêm thể loại bài hát";
                hintTen = "Nhập tên thể loại";
                hintLink = "Nhập link ảnh thể loại";
                break;
            case "album":
                tieude = "Thêm albums";
                hintTen = "Nhập tên album";
                hintLink = "Nhập link ảnh albums";
                break;
        }

        title.setText(tieude);
        ten.setHint(hintTen);
        link.setHint(hintLink);

        String finalTieude = tieude;
        them.setOnClickListener(v -> {
            String tenx = ten.getText().toString();
            String linkx = link.getText().toString();
            if (!tenx.isEmpty() && !linkx.isEmpty()) {
                Item item = new Item(tenx, linkx);
                FirebaseDatabase.getInstance().getReference(loai).child(tenx).setValue(item).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull @org.jetbrains.annotations.NotNull Task<Void> task) {
                        dialog.dismiss();
                        Toast.makeText(getContext(), finalTieude + " thành công", Toast.LENGTH_SHORT).show();
                    }
                });
            } else {
                Toast.makeText(getContext(), "Không được để trống", Toast.LENGTH_SHORT).show();
            }
        });

        dong.setOnClickListener(v -> dialog.dismiss());
        dialog.show();
    }

    public static void resetListGanDay() {
        listGanDay.clear();
        listGanDay.addAll(lichSuDao.getAll());
        Collections.reverse(listGanDay);
        ganDayAdapter.notifyDataSetChanged();
        if (!listGanDay.isEmpty()) {
            ganday.setVisibility(View.GONE);
        }
    }

}