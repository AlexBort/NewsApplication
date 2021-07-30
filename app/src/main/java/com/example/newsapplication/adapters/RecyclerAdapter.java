package com.example.newsapplication.adapters;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.newsapplication.R;
import com.example.newsapplication.model.Results;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    private List<Results> data;

    public void setData(List data) {
        this.data.addAll(data);
        notifyDataSetChanged();
    }

    public RecyclerAdapter() {
        data = new ArrayList();
    }

    public List<Results> getData() {
        return data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        Results results = data.get(i);
        holder.textName.setText(results.getName());

        // TODO: 18.06.2019 handle case when url is empty or null
        Picasso.get().load(results.getImage().getUrl()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private TextView textName;
        private ImageView image;
//        private TextView


        public ViewHolder(View itemView) {
            super(itemView);
            textName = itemView.findViewById(R.id.name_text);
            image = itemView.findViewById(R.id.image);
        }
    }

}
