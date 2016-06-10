package com.creation.anindya.espressotestingbyanindya.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.creation.anindya.espressotestingbyanindya.R;


public class DisplayNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_name);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        String text = getIntent().getStringExtra(EnterNameActivity.NAME);
        TextView greetingTextView = (TextView) findViewById(R.id.greeting_message);
        greetingTextView.setText("Hello" + text + "!");

     /*   String text1 = getIntent().getStringExtra(EnterNameActivity.NAME);
        TextView greetingTextView1 = (TextView) findViewById(R.id.greeting_message1);
        greetingTextView1.setText("Hello " + text + "!");*/
    }
}
