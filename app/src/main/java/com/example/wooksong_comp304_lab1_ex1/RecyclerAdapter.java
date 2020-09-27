package com.example.wooksong_comp304_lab1_ex1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<String> items = null;

    public RecyclerAdapter(ArrayList<String> list) {
        items = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.button.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder {

        Button button;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            button = (Button)itemView.findViewById(R.id.button);
        }
    }
}
