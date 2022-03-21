package com.example.vinylbasefullstack.controller;

import com.example.vinylbasefullstack.Repository.ArtistRepository;
import com.example.vinylbasefullstack.Repository.VinylRepository;
import com.example.vinylbasefullstack.model.Artist;
import com.example.vinylbasefullstack.model.Vinyl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController


public class VinylBaseController {
    @Autowired
    VinylRepository repo;
    ArtistRepository repository;
@PostMapping("api/getvinyl")
    public List<Vinyl> returnVinyl(){
    return repo.returnVinyl();
}
    @PostMapping("api/getartists")
    public List<Artist>SelectArtists(){
        return repository.findArtistlist();
    }
}


