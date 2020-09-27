package com.example.wooksong_comp304_lab1_ex1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(String text) ;
    }
    private OnItemClickListener mListener = null ;

    // OnItemClickListener 리스너 객체 참조를 어댑터에 전달하는 메서드
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mListener = listener ;
    }

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
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.button.setText(items.get(position));
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mListener != null)
                    mListener.onItemClick(holder.button.getText().toString());
            }
        });
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
