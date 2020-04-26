package com.example.mraiapps.controller.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mraiapps.R;

public class rvAdapterBiasa extends RecyclerView.Adapter<rvAdapterBiasa.ViewHolder> {

    private Context context;

    String[] nama = {"cencwjnicwe","qwiodoqnwc","vewnvrne","vernvhrev","cwbciwe","cnwejnvir","cweinviurevb","cwenvriuu","vcdskjnviw"};

    public rvAdapterBiasa(Context context) {
        this.context = context;
    }

    @Override
    public rvAdapterBiasa.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.frame_event, null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(rvAdapterBiasa.ViewHolder holder, final int position) {
        holder.tvBiasa.setText(nama[position]);
        holder.cvEventBiasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Event Number : "+position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return nama.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView cvEventBiasa;
        TextView tvBiasa;

        public ViewHolder(View itemView) {
            super(itemView);
            cvEventBiasa = itemView.findViewById(R.id.cvEvent);
            tvBiasa = itemView.findViewById(R.id.tvRecycler);
        }
    }
}
