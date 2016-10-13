package net.buildingfive.jj.morsecode;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.media.ToneGenerator;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* try {
                    // http://stackoverflow.com/questions/6462105/how-do-i-access-androids-default-beep-sound
                    final ToneGenerator tg = new ToneGenerator(AudioManager.STREAM_NOTIFICATION, 100);
                    tg.startTone(ToneGenerator.TONE_PROP_BEEP);
                    Thread.sleep(1000);
                    tg.startTone(ToneGenerator.TONE_CDMA_ABBR_ALERT);
                } catch (InterruptedException ex) {}*/

                /* Intent intent = new Intent(view.getContext(), dot.class);
                startActivity(intent);
                finish();*/
                MorseString encodeMessage = new MorseString();
                ArrayList<Double> actualBeeps = encodeMessage.code("copper mining with pier one imports");

                // dot dee = new dot(.5);
                // dee.onResume();
                // dee.genTone();
                // dee.playSound();

                int i = 0;
                for (Double dotDash: actualBeeps) {
                    try {
                        dot d = new dot(dotDash);
                        d.genTone();
                        d.playSound();

                        Thread.sleep(1200);
                        i = i + 1;
                    } catch (InterruptedException | IllegalStateException e) {
                        e.printStackTrace(); 
                    }
                }

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
}
