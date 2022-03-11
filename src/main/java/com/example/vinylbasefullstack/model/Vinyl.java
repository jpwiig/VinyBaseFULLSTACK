package com.example.vinylbasefullstack.model;

import java.time.Year;
import java.util.Date;

public class Vinyl {
    private String recordName;
    private String releasedate;
    private Artist artist;

    public Vinyl(String recordName, String releasedate, Artist artist) {
        this.recordName = recordName;
        this.releasedate = releasedate;
        this.artist = artist;
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
}
