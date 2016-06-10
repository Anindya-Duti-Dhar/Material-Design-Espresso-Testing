package com.creation.anindya.espressotestingbyanindya.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.creation.anindya.espressotestingbyanindya.R;


public class ActionBarExampleActivity extends AppCompatActivity {

    private TextView statusTextView;
    private ActionMode actionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_example);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        statusTextView = (TextView) findViewById(R.id.status);

        Button toggleActionModeButton = (Button) findViewById(R.id.toggle_action_mode);
        toggleActionModeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActionMode();
            }
        });
    }

    private void startActionMode() {
        if (actionMode == null) {
            actionMode = startSupportActionMode(actionModeCallbacks);
        }
    }

    private ActionMode.Callback actionModeCallbacks = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            actionMode.getMenuInflater().inflate(R.menu.context_menu, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return true;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_one:
                    updateStatusText(R.string.action_mode_one);
                    return true;
            }
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {
            ActionBarExampleActivity.this.actionMode = null;
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_action_bar_example, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                updateStatusText(R.string.action_settings);
                break;
            case R.id.action_about:
                updateStatusText(R.string.action_about);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    private void updateStatusText(int statusResId) {
        statusTextView.setText(statusResId);
    }
}
