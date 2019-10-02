package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.SoundPool.OnLoadCompleteListener;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonA;
    private Button buttonBb;
    private Button buttonB;
    private Button buttonC;
    private Button buttonCc;
    private Button buttonD;
    private Button buttonDd;
    private Button buttonE;
    private Button buttonF;
    private Button buttonFf;
    private Button buttonG;
    private Button buttonGg;
    private Button Scale;
    private Button Iits;
    private NumberPicker typeOfNote;
    private NumberPicker amountOfTimes;
    private Button playNp;
    private int[] notesArray;
    private Button congragulations;


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
        typeOfNote.setMaxValue(12);
        typeOfNote.setMinValue(1);
        typeOfNote.setDisplayedValues(new String[]{"A", "B", "B♭", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"});
        amountOfTimes.setMinValue(1);
        amountOfTimes.setMaxValue(8);
        amountOfTimes.setDisplayedValues(new String[]{"1", "2", "3", "4", "5", "6", "7", "8"});
        setListners();
        notesArray = new int[]{aNote, bNote, bbNote, cNote, ccNote, dNote, ddNote, eNote, fNote, ffNote, gNote, ggNote};
        soundPool.setOnLoadCompleteListener(new OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId,
                                       int status) {
                isSoundPoolLoaded = true;
            }
        });

        Chord chordEm = new Chord(new int[]{gNote, bNote, eNote}, 500);
        playChord(chordEm);


        // Load the sound

    }

    private void playChord(Chord chord) {
        // use the getter to make an array with the notes
        int[] notes = (chord.getNotes());


        // loop through the array and play each note
        for (int note : notes) {
            soundPool.play(note, 1, 1, 1, 0, 1f);
        }

        // delay the amount listed in the chord using that getter
        delay(chord.getDelay());
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
        buttonA = findViewById(R.id.button_main_A);
        buttonBb = findViewById(R.id.button_main_Bb);
        buttonB = findViewById(R.id.button_main_B);
        buttonC = findViewById(R.id.button_main_C);
        buttonCc = findViewById(R.id.button_main_Cc);
        buttonD = findViewById(R.id.button_main_D);
        buttonDd = findViewById(R.id.button_main_Dd);
        buttonE = findViewById(R.id.button_main_E);
        buttonF = findViewById(R.id.button_main_F);
        buttonFf = findViewById(R.id.button_main_Ff);
        buttonG = findViewById(R.id.button_main_G);
        buttonGg = findViewById(R.id.button_main_Gg);
        Scale = findViewById(R.id.button_main_scale);
        Iits = findViewById(R.id.button_main_iits);
        typeOfNote = findViewById(R.id.numberPicker_main_notes);
        amountOfTimes = findViewById(R.id.numberPicker_main_amountofTime);
        playNp = findViewById(R.id.button_main_playNumberPicker);
        congragulations = findViewById((R.id.button_main_congragulations));
    }

    private void setListners() {
        buttonA.setOnClickListener(new View.OnClickListener() {
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
        buttonB.setOnClickListener(new View.OnClickListener() {
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
        buttonBb.setOnClickListener(new View.OnClickListener() {
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
        buttonC.setOnClickListener(new View.OnClickListener() {
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
        buttonCc.setOnClickListener(new View.OnClickListener() {
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
        buttonD.setOnClickListener(new View.OnClickListener() {
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
        buttonDd.setOnClickListener(new View.OnClickListener() {
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
        buttonE.setOnClickListener(new View.OnClickListener() {
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
        buttonF.setOnClickListener(new View.OnClickListener() {
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
        buttonFf.setOnClickListener(new View.OnClickListener() {
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
        buttonG.setOnClickListener(new View.OnClickListener() {
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
        buttonGg.setOnClickListener(new View.OnClickListener() {
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


        Scale.setOnClickListener(this);
        Iits.setOnClickListener(this);
        playNp.setOnClickListener(this);
        congragulations.setOnClickListener(this);


    }

    private void delay(int millisDelay) {
        try {
            Thread.sleep(millisDelay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button_main_iits: {
                playTwinkleTwinkle();
                break;
            }
            case R.id.button_main_scale: {
                playScale();
                break;
            }
            case R.id.button_main_playNumberPicker: {
                if (isSoundPoolLoaded) {
                    int currentNote = notesArray[typeOfNote.getValue() - 1];
                    for (int i = 0; i < amountOfTimes.getValue(); i++) {
                        soundPool.play(currentNote, 1, 1, 1, 0, 1f);
                        delay(500);

                    }
                }
                break;

            }
            case R.id.button_main_congragulations:{
                playCongragulations();
            }
        }


    }

    private void playCongragulations() {
        Chord chordG = new Chord(new int[]{gNote, bNote, dNote}, 1000);
        playChord(chordG);
        Chord chordGf = new Chord(new int[]{ffNote,gNote,bNote,dNote},1000);
        playChord(chordGf);
        Chord chordEm = new Chord(new int[]{eNote, gNote, bNote}, 1000);
        playChord(chordEm);
        Chord chordEm7 = new Chord(new int[]{eNote,gNote, bNote, dNote}, 1000);
        playChord(chordEm7);
        Chord chordC = new Chord(new int[]{cNote, eNote, gNote}, 1000);
        playChord(chordC);
        Chord chordCb = new Chord(new int[]{bNote, cNote, eNote, gNote}, 1000);
        playChord(chordCb);
        Chord chordAm = new Chord(new int[]{aNote, cNote, eNote}, 1000);
        playChord(chordAm);
        Chord chordAsus2 = new Chord(new int[]{aNote, bNote, eNote}, 1000);
        playChord(chordAsus2);

    }

    private void playScale() {
        AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        float actualVolume = (float) audioManager
                .getStreamVolume(AudioManager.STREAM_MUSIC);
        float maxVolume = (float) audioManager
                .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        final float volume = actualVolume / maxVolume;
        if (isSoundPoolLoaded) {
            soundPool.play(aNote, volume, volume, 1, 0, 1f);
            delay(500);
            soundPool.play(bbNote, volume, volume, 1, 0, 1f);
            delay(500);
            soundPool.play(bNote, volume, volume, 1, 0, 1f);
            delay(500);
            soundPool.play(cNote, volume, volume, 1, 0, 1f);
            delay(500);
            soundPool.play(ccNote, volume, volume, 1, 0, 1f);
            delay(500);
            soundPool.play(dNote, volume, volume, 1, 0, 1f);
            delay(500);
            soundPool.play(ddNote, volume, volume, 1, 0, 1f);
            delay(500);
            soundPool.play(eNote, volume, volume, 1, 0, 1f);
            delay(500);
            soundPool.play(fNote, volume, volume, 1, 0, 1f);
            delay(500);
            soundPool.play(ffNote, volume, volume, 1, 0, 1f);
            delay(500);
            soundPool.play(gNote, volume, volume, 1, 0, 1f);
            delay(500);
            soundPool.play(ggNote, volume, volume, 1, 0, 1f);


        }
    }

    private void playTwinkleTwinkle() {
        AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        float actualVolume = (float) audioManager
                .getStreamVolume(AudioManager.STREAM_MUSIC);
        float maxVolume = (float) audioManager
                .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        final float volume = actualVolume / maxVolume;
        Chord chordEm = new Chord(new int[]{gNote, bNote, eNote}, 500);
        playChord(chordEm);
        playChord(chordEm);
        Chord chordAm = new Chord(new int[]{aNote, cNote, eNote}, 500);
        playChord(chordAm);
        playChord(chordAm);
        Chord chordD = new Chord(new int[]{dNote, ffNote, aNote}, 500);
        playChord(chordD);
        playChord(chordD);
        Chord chordG = new Chord(new int[]{gNote, bNote, dNote}, 500);
        playChord(chordG);
        playChord(chordG);


        delay(100);
    }
}
