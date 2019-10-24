package com.example.moviestageapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView r1;
    String s1[],s2[];
    int imageRescores[]={R.drawable.images,R.drawable.inter,R.drawable.images,R.drawable.images};
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=(RecyclerView)findViewById(R.id.My_RecyclerView);
        s1=getResources().getStringArray(R.array.Movies);
        s2=getResources().getStringArray(R.array.rate);
        adapter=new MyAdapter(this,s1,s2,imageRescores);

        r1.setAdapter(adapter);
        r1.setLayoutManager(new LinearLayoutManager(this));

    }
}
