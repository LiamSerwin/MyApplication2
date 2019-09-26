package com.example.myapplication;

public class Chord {
    private int[] notes;
    private int delay;

    public int[] getNotes() {
        return notes;
    }

    public int getDelay() {
        return delay;
    }

    public Chord(int[] notes, int delay) {
        this.notes = notes;
        this.delay = delay;
    }
}
