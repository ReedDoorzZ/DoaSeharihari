package com.blogmuhammadzein.doaseharihari;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailDoa extends AppCompatActivity {
    ImageView imgDoa;
    TextView arabDoa,judulDoa, artiDoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_doa);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle(getIntent().getStringExtra("juduldoa"));

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgDoa = findViewById(R.id.imgDetail);
        arabDoa = findViewById(R.id.txtArab);
        judulDoa = findViewById(R.id.txtJudul);
        artiDoa = findViewById(R.id.txtArti);

        arabDoa.setText(getIntent().getStringExtra("arabdoa"));
        judulDoa.setText(getIntent().getStringExtra("juduldoa"));
        artiDoa.setText(getIntent().getStringExtra("artidoa"));
        Glide.with(this).load(getIntent().getIntExtra("gambardoa", 0)).into(imgDoa);
    }

}
