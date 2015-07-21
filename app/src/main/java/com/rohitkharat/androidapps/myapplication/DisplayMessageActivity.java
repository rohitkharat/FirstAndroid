package com.rohitkharat.androidapps.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by rohitkharat on 7/21/15.
 */
public class DisplayMessageActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_display_message);
        //get the message from intent
        Intent intent = getIntent();
        String string = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);

        //create text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(string);

        //set textview as the activity layout
        setContentView(textView);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
