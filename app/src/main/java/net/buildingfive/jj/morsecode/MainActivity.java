package net.buildingfive.jj.morsecode;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.CharacterPickerDialog;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final double dotDuration = 0.1;
    int n = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextSwitcher mSwitcher = (TextSwitcher) findViewById(R.id.switcher);
        final EditText et = (EditText) findViewById(R.id.text_to_encode);
        final Button buttonEncode = (Button) findViewById(R.id.encode_button);
        final Button buttonDecode = (Button) findViewById(R.id.decode_button);
        final AudioTrack audioTrackDit = new AudioTrack(AudioManager.STREAM_MUSIC,
                8000, AudioFormat.CHANNEL_OUT_MONO,
                AudioFormat.ENCODING_PCM_16BIT, 1600,
                AudioTrack.MODE_STATIC);
        final AudioTrack audioTrackDah = new AudioTrack(AudioManager.STREAM_MUSIC,
                8000, AudioFormat.CHANNEL_OUT_MONO,
                AudioFormat.ENCODING_PCM_16BIT, 3 * 1600,
                AudioTrack.MODE_STATIC);

        mSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            public View makeView() {
                TextView myText = new TextView(MainActivity.this);
                myText.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL);
                myText.setTextSize(500);
                myText.setTextColor(Color.BLUE);
                return myText;
            }
        });

        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        mSwitcher.setInAnimation(in);
        mSwitcher.setOutAnimation(out);

        buttonEncode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final char[] inbound = et.getText().toString().toCharArray();
                char currentCharacter = inbound[n % inbound.length];
                mSwitcher.setText(Character.toString(currentCharacter));
                n = n + 1;

                // play the morse code
                MorseLetter encoded = new MorseLetter(currentCharacter);
                dot dit = new dot(dotDuration);
                dit.at = audioTrackDit;
                dit.genTone();

                // dash is typically three times longer than the dit
                dot dah = new dot(dotDuration * 3);
                dah.at = audioTrackDah;
                dah.genTone();

                ArrayList<Double> dotsAndDashes = encoded;

                // all the dots and dashes for the 'car' letter.
                for (Double dotDash: dotsAndDashes) {
                    if (dotDash == dotDuration) {
                        dit.playSound();
                    } else {
                        dah.playSound();
                    }

                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        buttonDecode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), UploadRecording.class);
                startActivity(intent);
            }
        });
    }
}
