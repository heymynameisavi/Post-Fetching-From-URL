package com.example.android.assignment_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<Data> dataArrayList;

    public DataAdapter(ArrayList<Data> dataArrayList, Context applicationContext) {
        this.dataArrayList = dataArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tv_id.setText(dataArrayList.get(position).getId());
        holder.tv_user_id.setText(dataArrayList.get(position).getUser_id());
        holder.tv_title.setText(dataArrayList.get(position).getTitle());
        holder.tv_body.setText(dataArrayList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return dataArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tv_id, tv_user_id,tv_title,tv_body;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_id = itemView.findViewById(R.id.tv_id);
            tv_user_id = itemView.findViewById(R.id.tv_user_id);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_body = itemView.findViewById(R.id.tv_body);
        }
    }
}
