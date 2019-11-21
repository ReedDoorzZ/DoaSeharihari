package com.blogmuhammadzein.doaseharihari;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AdapterDoa extends RecyclerView.Adapter<AdapterDoa.ViewHolder> {
    Context context;
    int[] gambarDoa;
    String[] namaDoa, arabDoa, judulDoa,artiDoa;

    public AdapterDoa(Context context, int[] gambarDoa, String[] namaDoa, String[] arabDoa, String[] judulDoa, String[] artiDoa) {
        this.context = context;
        this.gambarDoa = gambarDoa;
        this.namaDoa = namaDoa;
        this.arabDoa = arabDoa;
        this.judulDoa = judulDoa;
        this.artiDoa = artiDoa;
    }

    @NonNull
    @Override
    public AdapterDoa.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.txt.setText(namaDoa[i]);
        Glide.with(context).load(gambarDoa[i]).into(viewHolder.img);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent move = new Intent(context, DetailDoa.class);
                move.putExtra("gambardoa", gambarDoa[i]);
                move.putExtra("arabdoa", arabDoa[i]);
                move.putExtra("juduldoa", judulDoa[i]);
                move.putExtra("artidoa", artiDoa[i]);
                context.startActivity(move);
            }
        });
    }

    @Override
    public int getItemCount() {
        return gambarDoa.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt, judul, arti;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgDoa);
            txt = itemView.findViewById(R.id.txtDoa);
            judul = itemView.findViewById(R.id.txtJudul);
            arti = itemView.findViewById(R.id.txtArti);
        }
    }
}
