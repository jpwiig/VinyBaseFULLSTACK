package com.example.vinylbasefullstack.model;

public class Band{
    private Artist vocals;
    private Artist drums;
    private Artist guitarist;
    private Artist bass;
    private Artist other;

    public Band(Artist vocals, Artist drums, Artist guitarist, Artist bass, Artist other) {
        this.vocals = vocals;
        this.drums = drums;
        this.guitarist = guitarist;
        this.bass = bass;
        this.other = other;
    }

    public Artist getVocals() {
        return vocals;
    }

    public void setVocals(Artist vocals) {
        this.vocals = vocals;
    }

    public Artist getDrums() {
        return drums;
    }

    public void setDrums(Artist drums) {
        this.drums = drums;
    }

    public Artist getGuitarist() {
        return guitarist;
    }

    public void setGuitarist(Artist guitarist) {
        this.guitarist = guitarist;
    }

    public Artist getBass() {
        return bass;
    }

    public void setBass(Artist bass) {
        this.bass = bass;
    }

    public Artist getOther() {
        return other;
    }

    public void setOther(Artist other) {
        this.other = other;
    }
}
