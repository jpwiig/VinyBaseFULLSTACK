package com.example.vinylbasefullstack.Repository;

import com.example.vinylbasefullstack.model.Artist;
import com.example.vinylbasefullstack.model.Vinyl;

import java.util.ArrayList;
import java.util.List;

public class VinylRepository {
    private final List<Vinyl>records= new ArrayList<>();

    public void addVinyl(Vinyl newVinyl){
        records.add(newVinyl);
        for (Vinyl vinyls:records){



        }
    }
}
