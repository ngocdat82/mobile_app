package com.ngocdat.mp3.fragment;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.ngocdat.mp3.MainActivity;
import com.ngocdat.mp3.R;
import com.ngocdat.mp3.adapter.ItemAdapter;
import com.ngocdat.mp3.adapter.YeuThichAdapter;
import com.ngocdat.mp3.database.BaiHatDao;
import com.ngocdat.mp3.model.BaiHat;
import com.ngocdat.mp3.model.Item;

import java.util.ArrayList;
import java.util.Collections;

public class YeuThichFragment extends Fragment {
    private View view;
    private RecyclerView rcv;
    private ArrayList<BaiHat> list = new ArrayList<>();
    private YeuThichAdapter adapter;
    private TextInputEditText search;
    public static LinearLayout emty;
    BaiHatDao baiHatDao;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_yeu_thich, container, false);
        init();
        list.clear();
        list.addAll(baiHatDao.getAll());
        if (!list.isEmpty()) {
            emty.setVisibility(View.GONE);
        }
        Collections.reverse(list);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rcv.setLayoutManager(linearLayoutManager);
        adapter = new YeuThichAdapter(getContext(), list);
        rcv.setAdapter(adapter);
        //Tìm kiếm
        setSearch();

        adapter.setOnItemClickListener(new YeuThichAdapter.ClickListener() {
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
        return view;
    }

    private void init() {
        emty = view.findViewById(R.id.emty);
        baiHatDao = new BaiHatDao(getContext());
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