package com.example.myapplication;

        import androidx.appcompat.app.AppCompatActivity;
        import android.media.SoundPool.OnLoadCompleteListener;
        import android.media.AudioManager;
        import android.media.SoundPool;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button ButtonA;
    private Button ButtonBb;
    private Button ButtonB;
    private Button ButtonC;
    private Button ButtonCc;
    private Button ButtonD;
    private Button ButtonDd;
    private Button ButtonE;
    private Button ButtonF;
    private Button ButtonFf;
    private Button ButtonG;
    private Button ButtonGg;
    private Button Scale;




    private SoundPool soundPool;
    private boolean isSoundPoolLoaded;
    private int aNote;
    private int bbNote;
    private int bNote;
    private int cNote;
    private int ccNote;
    private int dNote;
    private int ddNote;
    private int eNote;
    private int fNote;
    private int ffNote;
    private int gNote;
    private int ggNote;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        intializeSoundPool();
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        wireWidgets();
        setListners();
        soundPool.setOnLoadCompleteListener(new OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId,
                                       int status) {
                isSoundPoolLoaded = true;
            }
        });


        // Load the sound

    }


    private void intializeSoundPool() {
        aNote = soundPool.load(this, R.raw.scalea, 1);
        bbNote = soundPool.load(this, R.raw.scalebb, 1);
        bNote = soundPool.load(this, R.raw.scaleb, 1);
        cNote = soundPool.load(this, R.raw.scalec, 1);
        ccNote = soundPool.load(this, R.raw.scalecs, 1);
        dNote = soundPool.load(this, R.raw.scaled, 1);
        ddNote = soundPool.load(this, R.raw.scaleds, 1);
        eNote = soundPool.load(this, R.raw.scalee, 1);
        fNote = soundPool.load(this, R.raw.scalef, 1);
        ffNote = soundPool.load(this, R.raw.scalefs, 1);
        gNote = soundPool.load(this, R.raw.scaleg, 1);
        ggNote = soundPool.load(this, R.raw.scalegs, 1);


    }

    private void wireWidgets() {
        ButtonA = findViewById(R.id.button_main_A);
        ButtonBb = findViewById(R.id.button_main_Bb);
        ButtonB = findViewById(R.id.button_main_B);
        ButtonC = findViewById(R.id.button_main_C);
        ButtonCc = findViewById(R.id.button_main_Cc);
        ButtonD = findViewById(R.id.button_main_D);
        ButtonDd = findViewById(R.id.button_main_Dd);
        ButtonE = findViewById(R.id.button_main_E);
        ButtonF = findViewById(R.id.button_main_F);
        ButtonFf = findViewById(R.id.button_main_Ff);
        ButtonG = findViewById(R.id.button_main_G);
        ButtonGg = findViewById(R.id.button_main_Gg);
        Scale = findViewById(R.id.button_main_scale);
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
                    soundPool.play(aNote, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        ButtonB.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(bNote, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        ButtonBb.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(bbNote, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        ButtonC.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(cNote, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        ButtonCc.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(ccNote, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        ButtonD.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(dNote, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        ButtonDd.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(ddNote, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        ButtonE.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(eNote, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        ButtonF.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(fNote, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        ButtonFf.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(ffNote, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        ButtonG.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(gNote, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });
        ButtonGg.setOnClickListener(new View.OnClickListener() {
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
                    soundPool.play(ggNote, volume, volume, 1, 0, 1f);
                    Log.e("Test", "Played sound");
                }

            }

        });







    }

    @Override
    public void onClick(View view) {
    switch(view.getId()){

    }
    }
}


