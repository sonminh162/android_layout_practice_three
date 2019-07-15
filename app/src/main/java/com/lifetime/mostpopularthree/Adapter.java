package com.lifetime.mostpopularthree;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<Info> infors;
    Context context;

    public Adapter(ArrayList<Info> infors, Context context){
        this.infors = infors;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_row_new,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.head.setText(infors.get(position).getHead());
        holder.category.setText(infors.get(position).getCategory());
        holder.time.setText(infors.get(position).getTime());
        holder.description.setText(infors.get(position).getDescription());
        holder.comment.setText(infors.get(position).getComment());
        holder.like.setText(infors.get(position).getLike());
        holder.img.setImageResource(infors.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return infors.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView head;
        TextView category;
        TextView time;
        TextView description;
        TextView comment;
        TextView like;
        ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            head = itemView.findViewById(R.id.head);
            category = itemView.findViewById(R.id.category);
            time = itemView.findViewById(R.id.time);
            description = itemView.findViewById(R.id.description);
            comment = itemView.findViewById(R.id.comment);
            like = itemView.findViewById(R.id.like);
            img = itemView.findViewById(R.id.img);
        }
    }
}
