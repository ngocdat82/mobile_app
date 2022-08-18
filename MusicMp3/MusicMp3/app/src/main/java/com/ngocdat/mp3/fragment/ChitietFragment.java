package com.ngocdat.mp3.fragment;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.ngocdat.mp3.MainActivity;
import com.ngocdat.mp3.R;
import com.ngocdat.mp3.adapter.ChiTietAdapter;
import com.ngocdat.mp3.database.BaiHatDao;
import com.ngocdat.mp3.model.BaiHat;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;

public class ChitietFragment extends Fragment {
    private View view;
    private RecyclerView rcv;
    private ArrayList<BaiHat> list = new ArrayList<>();
    private ChiTietAdapter adapter;
    private TextInputEditText search;
    private LinearLayout emty;
    DatabaseReference ref = FirebaseDatabase.getInstance().getReference("baihat");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_yeu_thich, container, false);
        init();
        Bundle bundle = getArguments();
        String loai = bundle.getString("loai");
        String ten = bundle.getString("ten");
        Log.d("testBH", loai+"//"+ten);

        list.clear();
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rcv.setLayoutManager(linearLayoutManager);
        adapter = new ChiTietAdapter(getContext(), list);
        rcv.setAdapter(adapter);
        //Tìm kiếm
        setSearch();

        adapter.setOnItemClickListener(new ChiTietAdapter.ClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onItemClick(ArrayList<BaiHat> list, int position) {
                try {
                    MainActivity.phatnhac(list, position);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
//kiểm tra trên db có  loại với tên trùng với item bên các fragment kia không
        ref.orderByChild(loai).equalTo(ten).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                list.clear();
                for (DataSnapshot x : snapshot.getChildren()) {
                    BaiHat baiHat = x.getValue(BaiHat.class);
                    list.add(baiHat);
                }
                Collections.reverse(list);
                adapter.notifyDataSetChanged();
                LayoutAnimationController anim = AnimationUtils.loadLayoutAnimation(getContext(), R.anim.layout_animation);
                rcv.setLayoutAnimation(anim);
// nếu k có dữ liệu thì hiện hình doremon
                if (!list.isEmpty()) {
                    emty.setVisibility(View.GONE);
                }
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });
        return view;
    }

    private void init() {
        emty = view.findViewById(R.id.emty);
        rcv = view.findViewById(R.id.rcv);
        search  = requireActivity().findViewById(R.id.search_view);
        search.setHint("Tìm tên bài hát");
    }
    private void setSearch() {
        rcv.setFilterTouchesWhenObscured(true);
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int
                    count) {
                System.out.println("Text [" + s + "] - Start [" + start + "] - Before [" + before + "] - Count [" + count + "]");
                if (count < before) {
                    adapter.resetData();
                }
                adapter.getFilter().filter(s.toString());
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

}