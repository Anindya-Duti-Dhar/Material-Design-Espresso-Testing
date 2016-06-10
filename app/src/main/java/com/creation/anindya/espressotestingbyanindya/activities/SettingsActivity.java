package com.creation.anindya.espressotestingbyanindya.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.VisibleForTesting;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.creation.anindya.espressotestingbyanindya.R;

public class SettingsActivity extends AppCompatActivity {

    private Button button_take_photo;

    private ImageView mImageView;
    static final int CAMERA_PIC_REQUEST = 1;
    @VisibleForTesting
    protected static final String KEY_IMAGE_DATA = "data";
/*
    private static final int REQUEST_IMAGE_CAPTURE = 1;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seetings);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mImageView = (ImageView) findViewById(R.id.imageView);
        button_take_photo = (Button) findViewById(R.id.button_take_photo);

        findViewById(R.id.button_take_photo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*startActivity(new Intent(Settings.ACTION_SOUND_SETTINGS));*/
                Intent photo= new Intent("android.media.action.IMAGE_CAPTURE");
                startActivityForResult(photo, CAMERA_PIC_REQUEST);
                if (photo.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(photo, CAMERA_PIC_REQUEST);
                }
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // If an image is received, display it on the ImageView.
        if (requestCode == CAMERA_PIC_REQUEST && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            if (extras == null || !extras.containsKey(KEY_IMAGE_DATA)) {
                return;
            }
            Bitmap imageBitmap = (Bitmap) extras.get(KEY_IMAGE_DATA);
            mImageView.setImageBitmap(imageBitmap);
        }
    }

}
