package com.example.climbachiya.exoplayerdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //String uri = "http://html5demos.com/assets/dizzy.mp4";
    String uri = "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
    //String uri = "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPlayVideo(View view){
        Intent mpdIntent = new Intent(this, PlayerActivity.class)
                .setData(Uri.parse(uri));
                //.putExtra(PlayerActivity.CONTENT_ID_EXTRA, sample.contentId)
                //.putExtra(PlayerActivity.CONTENT_TYPE_EXTRA, sample.type)
                //.putExtra(PlayerActivity.PROVIDER_EXTRA, sample.provider);
        startActivity(mpdIntent);
    }
}
