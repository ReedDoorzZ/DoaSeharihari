package com.blogmuhammadzein.doaseharihari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvdoa;
    String[] namadoa, arabdoa,juduldoa,artidoa;
    int[] gambardoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvdoa = findViewById(R.id.doaanak);

        rvdoa.setHasFixedSize(true);

        rvdoa.setLayoutManager(new LinearLayoutManager(this));
        juduldoa = getResources().getStringArray(R.array.juduldoa);
        namadoa = getResources().getStringArray(R.array.namadoa);
        arabdoa = getResources().getStringArray(R.array.arabdoa);
        artidoa = getResources().getStringArray(R.array.artidoa);
        gambardoa = new int[]{
                R.drawable.doamautidur,
                R.drawable.doabanguntidur,
                R.drawable.masukmasjid,
                R.drawable.keluarmasjid,
                R.drawable.berpakain,
                R.drawable.bercermin,
                R.drawable.sebelummakan,
                R.drawable.sesudahmakan,
                R.drawable.masukkamarmandi,
                R.drawable.keluarkamarmandi,
                R.drawable.keluarrumah,


        };

        AdapterDoa adapter = new AdapterDoa(MainActivity.this, gambardoa, namadoa, arabdoa,juduldoa,artidoa);
        rvdoa.setAdapter(adapter);
    }
}
