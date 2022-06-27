package com.example.vinylbasefullstack.Repository;

import com.example.vinylbasefullstack.model.Artist;
import com.example.vinylbasefullstack.model.Vinyl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Repository
public class VinylRepository {
    private final List<Vinyl>records= new ArrayList<>();

    public void addVinyl(Vinyl newVinyl) {
@Transactional

    }

    public List<Vinyl>returnVinyl(){
        return records;
    }
}
