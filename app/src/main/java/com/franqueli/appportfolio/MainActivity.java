package com.franqueli.appportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    // Button input handlers
    public void spotifyButtonClickHandler(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the spotify streamer", Toast.LENGTH_LONG).show();

    }

    public void scoresButtonClickHandler(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the score app", Toast.LENGTH_LONG).show();
    }

    public void libraryButtonClickHandler(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the library app", Toast.LENGTH_LONG).show();
    }

    public void buildBiggerButtonClickHandler(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the Build it Bigger app", Toast.LENGTH_LONG).show();
    }

    public void readerButtonClickHandler(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the XYZ reader app", Toast.LENGTH_LONG).show();
    }

    public void capstoneButtonClickHandler(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch my capstone app!", Toast.LENGTH_LONG).show();
    }


}
