package com.example.vinylbasefullstack.Repository;

import com.example.vinylbasefullstack.model.Artist;
import com.example.vinylbasefullstack.model.Vinyl;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class VinylRepository {
    private final List<Vinyl>records= new ArrayList<>();

    public void addVinyl(Vinyl newVinyl){
        records.add(newVinyl);
        //validation and stops double storage of artists
        for (Vinyl vinyls:records){



        }
    }

    public List<Vinyl>returnVinyl(){
        return records;
    }
}
