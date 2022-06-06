package com.example.vinylbasefullstack.Repository;

import com.example.vinylbasefullstack.model.Artist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArtistRepository {
    private Logger logger = LoggerFactory.getLogger(ArtistRepository.class);
    private List<Artist>artister= new ArrayList<>();

    public ArtistRepository(List<Artist> artister) {
        this.artister = artister;
    }

    public void addExample(){
        Artist BobDylan= new Artist("Bob Dylan","1961" ,"2022");
        artister.add(BobDylan);

    }
    public void addArtist(Artist addArtist){
        artister.add(addArtist);
        for (Artist artist:artister){
            if (artist.getName().equals(addArtist.getName())){
                artister.remove(this);
            }

        }
    }

    public List<Artist>findArtistlist (){
        return artister;
    }

}
