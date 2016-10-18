package net.buildingfive.jj.morsecode;

import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.IOException;
import java.io.RandomAccessFile;

public class UploadRecording extends AppCompatActivity {

    private SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_recording);

        // String strPath = "//sdcard/download/2016-09-18 12-08-51.mp3";
        // String strPath = "//sdcard/download/160106_05WPM.mp3";
        String strPath = "//sdcard/download/example.wav";


        RandomAccessFile f = null;
        try {
            f = new RandomAccessFile(strPath, "r");

            // Get and check length
            long longlength = f.length();
            int length = (int) longlength;

            if (length != longlength)
                throw new IOException("File size >= 2 GB");

            // Read file and return data
            byte[] data = new byte[length];
            f.readFully(data);
            f.close();

            // TODO function looks whole mp3 for tones -- maybe flattens the file with like a min or a max
            // TODO function removes empty frames

            // http://mpgedit.org/mpgedit/mpeg_format/MP3Format.html
            // Layer description
            // (data[1] >> 1) & 1
            // (data[1] >> 2) & 1
            // MPEG Audio Version ID
            // (data[1] >> 3) & 1
            // (data[1] >> 4) & 1
            // Bit rate
            // (data[2] >> 5) & 1
            // (data[2] >> 6) & 1
            // (data[2] >> 7) & 1
            // (data[2] >> 8) & 1


            int soundID = soundPool.load(strPath, 1);


        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
