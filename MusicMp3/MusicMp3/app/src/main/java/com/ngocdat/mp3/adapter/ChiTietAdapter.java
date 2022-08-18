package com.ngocdat.mp3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ngocdat.mp3.R;
import com.ngocdat.mp3.database.BaiHatDao;
import com.ngocdat.mp3.model.BaiHat;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ChiTietAdapter extends RecyclerView.Adapter<ChiTietAdapter.ViewHolder> {
    private Context context;
    private ArrayList<BaiHat> list;
    ArrayList<BaiHat> listSort;
    Filter filter;
    private static ClickListener clickListener;
    BaiHatDao baiHatDao;

    public ChiTietAdapter() {

    }

    public ChiTietAdapter(Context context, ArrayList<BaiHat> list) {
        this.context = context;
        this.list = list;
        this.listSort = list;
        baiHatDao = new BaiHatDao(context);
    }
    public void setOnItemClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
    @NonNull
    @Override
    public ChiTietAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Set layout cho adapter để hiển th ị lên list
        View view = LayoutInflater.from(context).inflate(R.layout.one_chitiet, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChiTietAdapter.ViewHolder holder, int position) {
        //Trả về 1 item tại vị trí position(vị trí hiện tại theo list)
        BaiHat baiHat = list.get(position);
        //Set tiêu đề
        holder.baihat.setText(baiHat.getTenbaihat());
        holder.casi.setText(baiHat.getCasi());
        try {
            Picasso.get().load(baiHat.getImg()).placeholder(R.drawable.logo600).error(R.drawable.logo600).into(holder.imageView);
        } catch (Exception e) {

        }

        //Bắt sự kiện khi click vào một item
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onItemClick(list, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView, xoa;
        TextView baihat, casi;
        View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //Khai báo id theo itemView
            imageView = itemView.findViewById(R.id.iv_anh);
            xoa = itemView.findViewById(R.id.iv_xoa);
            baihat = itemView.findViewById(R.id.tv_baihat);
            casi = itemView.findViewById(R.id.tv_casi);
            view = itemView;
        }
    }

    public void resetData() {
        list = listSort;
    }

    public Filter getFilter() {
        if (filter == null)
            filter = new CustomFilter();
        return filter;
    }

    private class CustomFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            // We implement here the filter logic
            if (constraint == null || constraint.length() == 0) {
                results.values = listSort;
                results.count = listSort.size();
            } else {
                ArrayList<BaiHat> findItem = new ArrayList<>();
                for (BaiHat p : list) {
                    if (p.getTenbaihat().toUpperCase().contains(constraint.toString().toUpperCase()))
                        findItem.add(p);
                }
                results.values = findItem;
                results.count = findItem.size();
            }
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            if (results.count == 0) {
//                notifyDataSetInvalidated();
            } else {
                list = (ArrayList<BaiHat>) results.values;
                notifyDataSetChanged();
            }
        }
    }
    public interface ClickListener {
        void onItemClick(ArrayList<BaiHat> list, int position);
    }

}
