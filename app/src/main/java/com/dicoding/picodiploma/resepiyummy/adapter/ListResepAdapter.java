package com.dicoding.picodiploma.resepiyummy.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.picodiploma.resepiyummy.Detail;
import com.dicoding.picodiploma.resepiyummy.R;
import com.dicoding.picodiploma.resepiyummy.model.Resep;

import java.util.ArrayList;

public class ListResepAdapter extends RecyclerView.Adapter<ListResepAdapter.ListViewHolder> {
    private ArrayList<Resep> listResep = new ArrayList<>();

    public ListResepAdapter(ArrayList<Resep> list) {
        this.listResep = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_resep, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Resep resep = listResep.get(position);
        Glide.with(holder.itemView.getContext())
                .load(resep.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(resep.getName());
        holder.tvDetail.setText(resep.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), Detail.class);
                intent.putExtra(Detail.nama, resep.getName());
                intent.putExtra(Detail.detail, resep.getDetail());
                intent.putExtra(Detail.bahan, resep.getBahan());
                intent.putExtra(Detail.langkah, resep.getLangkah());
                intent.putExtra(Detail.gambar, resep.getPhoto());
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listResep.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);

        }
    }
}
