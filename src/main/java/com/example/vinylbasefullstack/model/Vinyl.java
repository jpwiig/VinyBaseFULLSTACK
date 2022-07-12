package com.example.vinylbasefullstack.model;

import java.time.Year;
import java.util.Date;

public class Vinyl {
    private String recordName;
    private String releasedate;
    private Artist artist;

    private String genre;

    private String country;

    public Vinyl(String recordName, String releasedate, Artist artist, String genre, String country) {
        this.recordName = recordName;
        this.releasedate = releasedate;
        this.artist = artist;
        this.genre = genre;
        this.country = country;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
