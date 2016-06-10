package com.creation.anindya.espressotestingbyanindya.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.creation.anindya.espressotestingbyanindya.R;


public class MainActivity extends AppCompatActivity {

    Button type_text_button, spinner_selection_button, custom_list_adapter_button, dialogs_button, recycler_view_button, date_time_picker_button, search_view_button, view_pager_button, actionbar_button, all_settings_button, wifi_settings_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        type_text_button =(Button)findViewById(R.id.type_text_button);
        type_text_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EnterNameActivity.class));

            }
        });

        spinner_selection_button =(Button)findViewById(R.id.spinner_selection_button);
        spinner_selection_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SpinnerSelectionActivity.class));

            }
        });

        custom_list_adapter_button =(Button)findViewById(R.id.custom_list_adapter_button);
        custom_list_adapter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CustomListActivity.class));

            }
        });

        dialogs_button =(Button)findViewById(R.id.dialogs_button);
        dialogs_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DialogExampleActivity.class));

            }
        });

        recycler_view_button =(Button)findViewById(R.id.recycler_view_button);
        recycler_view_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class));

            }
        });



        view_pager_button =(Button)findViewById(R.id.viewpager_button);
        view_pager_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ViewPagerActivity.class));

            }
        });


        actionbar_button =(Button)findViewById(R.id.action_bar_button);
        actionbar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActionBarExampleActivity.class));

            }
        });


        search_view_button =(Button)findViewById(R.id.search_view_button);
        search_view_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SearchViewActivity.class));

            }
        });

        date_time_picker_button =(Button)findViewById(R.id.pickers_button);
        date_time_picker_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DateTimePickerActivity.class));

            }
        });

        wifi_settings_button =(Button)findViewById(R.id.wifi_settings_button);
        wifi_settings_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WiFiSettingsActivity.class));

            }
        });

        all_settings_button =(Button)findViewById(R.id.all_settings_button);
        all_settings_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SettingsActivity.class));

            }
        });

        /*setListener(R.id.type_text_button, EnterNameActivity.class);
        setListener(R.id.spinner_selection_button, SpinnerSelectionActivity.class);
        setListener(R.id.custom_list_adapter_button, CustomListActivity.class);
        setListener(R.id.dialogs_button, DialogExampleActivity.class);
        setListener(R.id.recycler_view_button, RecyclerViewActivity.class);*/

    }

  /*  private <T extends Activity> void setListener(int buttonResId, final Class<T> activity) {
        findViewById(buttonResId).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity));
            }
        });
    }*/
}
