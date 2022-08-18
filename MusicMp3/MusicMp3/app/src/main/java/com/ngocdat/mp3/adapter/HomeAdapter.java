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
import com.ngocdat.mp3.model.BaiHat;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private Context context;
    private ArrayList<BaiHat> list;
    ArrayList<BaiHat> listSort;
    Filter filter;
    private static BaiHatAdapter.ClickListener clickListener;
    public HomeAdapter() {
    }

    public HomeAdapter(Context context, ArrayList<BaiHat> list) {
        this.context = context;
        this.list = list;
        this.listSort = list;
    }
    public void setOnItemClickListener(BaiHatAdapter.ClickListener clickListener) {
        this.clickListener = clickListener;
    }
    @NonNull
    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Set layout cho adapter để hiển thị lên list
        View view = LayoutInflater.from(context).inflate(R.layout.one_mini_baihat, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder holder, int position) {
        //Trả về 1 item tại vị trí position(vị trí hiện tại theo list)
        BaiHat baiHat = list.get(position);
        //Set tiêu đề
        holder.title.setText(baiHat.getTenbaihat());
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
        ImageView imageView;
        TextView title;
        View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //Khai báo id theo itemView
            imageView = itemView.findViewById(R.id.iv_anh);
            title = itemView.findViewById(R.id.tv_baihat);
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
            if (results.count == 0){
//                notifyDataSetInvalidated();
            }
            else {
                list = (ArrayList<BaiHat>) results.values;
                notifyDataSetChanged();
            }
        }
    }

    interface OnClickItem {
        void onClick(BaiHat baiHat);
    }
}
