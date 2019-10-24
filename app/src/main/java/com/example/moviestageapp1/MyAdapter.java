package com.example.moviestageapp1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    String Data1[];
    String Data2[];
    int image[];
    Context ctx;

    public MyAdapter(Context c, String s1[], String s2[], int img[])
    {
        ctx=c;
        Data1=s1;
        Data2=s2;
        image=img;
    }
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater MyInflater=LayoutInflater.from(ctx);
        View view=MyInflater.inflate(R.layout.row_layout,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
     holder.t1.setText(Data1[position]);
     holder.t2.setText(Data2[position]);
     holder.imageView.setImageResource(image[position]);
    }

    @Override
    public int getItemCount() {
        return Data1.length;//because all of them have the same length
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView t1;
        TextView t2;
        ImageView imageView;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            t1=(TextView)itemView.findViewById(R.id.name_text);
            t2=(TextView)itemView.findViewById(R.id.des_text);
            imageView=(ImageView)itemView.findViewById(R.id.joker);

        }
    }
}
