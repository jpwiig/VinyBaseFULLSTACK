package com.example.vinylbasefullstack.Repository;

import com.example.vinylbasefullstack.model.Artist;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArtistRepository {
    private List<Artist>artister= new ArrayList<>();

    public void addArtists(){
        Artist BobDylan= new Artist("Bob Dylan","1961" ,"2022");
        artister.add(BobDylan);

    }
}
