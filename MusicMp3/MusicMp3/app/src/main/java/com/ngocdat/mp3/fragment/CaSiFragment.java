package com.ngocdat.mp3.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
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
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.ngocdat.mp3.R;
import com.ngocdat.mp3.adapter.ItemAdapter;
import com.ngocdat.mp3.model.Item;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CaSiFragment extends Fragment {
    private View view;
    private RecyclerView rcv;
    private final ArrayList<Item> list = new ArrayList<>();
    private TextInputEditText search;
    LinearLayout emty; ItemAdapter adapter;
    DatabaseReference ref = FirebaseDatabase.getInstance().getReference("casi");
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_ca_si, container, false);
        init();
       //List cho ca sĩ
        // Hiển thị lên RCV
        LinearLayoutManager linearLayoutManager= new GridLayoutManager(getContext(), 2);
        rcv.setLayoutManager(linearLayoutManager);
         adapter = new ItemAdapter(getContext(), list, "casi");
        rcv.setAdapter(adapter);
        setSearch();
        // Lấy dữ liệu từ máy chủ rồi đổ vào mảng
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                list.clear();
                for(DataSnapshot x : snapshot.getChildren()){
                    Item item = x.getValue(Item.class);
                    list.add(item);
                }
                // reset lại list khi đủ dữ liệu
                adapter.notifyDataSetChanged();

                if (!list.isEmpty()) {
                    emty.setVisibility(View.GONE);
                }  }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });
        return view;
    }

    private void init() {
    rcv = view.findViewById(R.id.rcv);
        emty = view.findViewById(R.id.emty);
        search = requireActivity().findViewById(R.id.search_view);
        search.setHint("Tìm ca sĩ");
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