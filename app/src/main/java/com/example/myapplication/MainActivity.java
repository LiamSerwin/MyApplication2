package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.media.AudioManager;
        import android.media.SoundPool;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button ButtonA;
    private Button ButtonBb;
    private Button ButtonB;
    private SoundPool soundPool;
    private boolean isSoundPoolLoaded;
    private int aNote;
    private int bbNote;
    private int bNote;
            

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        intializeSoundPool();
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        wireWidgets();
        setListners();


        // Load the sound

    }




    private void intializeSoundPool() {
        aNote = soundPool.load(this, R.raw.scalea, 1);
        bbNote = soundPool.load(this, R.raw.scalebb, 1);
        bNote = soundPool.load(this, R.raw.scaleb, 1);




    }

    private void wireWidgets() {
        ButtonA = findViewById(R.id.button_main_A);
        ButtonBb = findViewById(R.id.button_main_Bb);
        ButtonB = findViewById(R.id.button_main_B);
    }

    private void setListners() {
        ButtonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                float actualVolume = (float) audioManager
                        .getStreamVolume(AudioManager.STREAM_MUSIC);
                float maxVolume = (float) audioManager
                        .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                float volume = actualVolume / maxVolume;
                // Is the sound loaded already?
                if (isSoundPoolLoaded) {
                    soundPool.play(soundID, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }
            }

            }


        });

    }
}