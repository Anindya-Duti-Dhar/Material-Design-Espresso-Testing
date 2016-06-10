package com.creation.anindya.espressotestingbyanindya.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.creation.anindya.espressotestingbyanindya.R;


public class BookDetailsActivity extends AppCompatActivity {

    public static final String TITLE = "title";
    public static final String AUTHOR = "author";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView bookTitle = (TextView) findViewById(R.id.book_title);
        TextView bookAuthor = (TextView) findViewById(R.id.book_author);

        bookTitle.setText(getIntent().getStringExtra(TITLE));
        bookAuthor.setText(getIntent().getStringExtra(AUTHOR));
    }
}
