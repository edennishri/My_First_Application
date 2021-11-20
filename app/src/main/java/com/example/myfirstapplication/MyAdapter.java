package com.example.myfirstapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String data[];
    int images[];
    Context context;

    public MyAdapter(Context ct, String str[], int img[]){
        context = ct;
        data = str;
        images = img;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    holder.title.setText(data[position]);
    holder.plantImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }
    //inner class
    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView plantImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.plantTitle);
            plantImage = itemView.findViewById(R.id.plantImage);
        }
    }
}
