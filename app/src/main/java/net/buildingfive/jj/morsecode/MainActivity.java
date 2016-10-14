package net.buildingfive.jj.morsecode;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import net.buildingfive.jj.morsecode.MorseLetter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);
        final EditText et = (EditText) findViewById(R.id.text_to_encode);
        final Button buttonEncode = (Button) findViewById(R.id.encode_button);

        buttonEncode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char[] inbound = et.getText().toString().toCharArray();
                for (Character car : inbound) {
                    // one letter at a time
                    int i = 0;
                    MorseLetter encoded = new MorseLetter(car);
                    ArrayList<Double> dotsAndDashes = encoded;

                    // all the dots and dashes for the 'car' letter.
                    for (Double dotDash: dotsAndDashes) {
                        dot d = new dot(dotDash);
                        d.genTone();
                        d.playSound();

                        i = i + 1;
                        try {
                            Thread.sleep(600);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    // Pause between letters
                    try {
                        Thread.sleep(1100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                Snackbar.make(view, "Hope you enjoyed that.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
