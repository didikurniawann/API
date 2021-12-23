package com.webframework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static com.webframework.MainActivity.EXTRA_DESKRIPSI;
import static com.webframework.MainActivity.EXTRA_FRAMEWORK;
import static com.webframework.MainActivity.EXTRA_LOGO;
import static com.webframework.MainActivity.EXTRA_WEBSITE;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setTitle("Detail");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String logo = intent.getStringExtra(EXTRA_LOGO);
        String framework = intent.getStringExtra(EXTRA_FRAMEWORK);
        String deskripsi = intent.getStringExtra(EXTRA_DESKRIPSI);
        String website= intent.getStringExtra(EXTRA_WEBSITE);

        ImageView imageView = findViewById(R.id.image_view_detail);
        TextView textViewFramework = findViewById(R.id.text_view_framework_detail);
        TextView textViewdeskripsi = findViewById(R.id.text_view_deskripsi_detail);
        TextView textViewWebsite = findViewById(R.id.text_view_website_detail);

        Picasso.get().load(logo).fit().centerCrop().into(imageView);
        textViewFramework.setText(framework);
        textViewdeskripsi.setText(deskripsi);
        textViewWebsite.setText(website);
    }
}