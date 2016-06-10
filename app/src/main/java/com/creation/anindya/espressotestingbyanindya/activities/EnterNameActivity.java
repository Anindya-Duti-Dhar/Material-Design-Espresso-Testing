package com.creation.anindya.espressotestingbyanindya.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.creation.anindya.espressotestingbyanindya.R;


public class EnterNameActivity extends AppCompatActivity {

    public static final String NAME = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_name);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText nameEditText = (EditText) findViewById(R.id.name_edittext);
        final TextView errorTextView = (TextView) findViewById(R.id.error_text);
/*        final EditText nameEditText1 = (EditText) findViewById(R.id.name_edittext1);
        final TextView errorTextView1 = (TextView) findViewById(R.id.error_text1);*/

        findViewById(R.id.next_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString().trim();
                if (name.length() > 0) {
                    errorTextView.setVisibility(View.INVISIBLE);
                    Intent intent = new Intent(EnterNameActivity.this, DisplayNameActivity.class);
                    intent.putExtra(NAME, name);
                    startActivity(intent);
                } else {
                    errorTextView.setVisibility(View.VISIBLE);
                }
            }
        });

     /*   findViewById(R.id.next_button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText1.getText().toString().trim();
                if (name.length() > 0) {
                    errorTextView1.setVisibility(View.INVISIBLE);
                    Intent intent = new Intent(EnterNameActivity.this, DisplayNameActivity.class);
                    intent.putExtra(NAME, name);
                    startActivity(intent);
                } else {
                    errorTextView1.setVisibility(View.VISIBLE);
                }
            }
        });*/

    }

}
