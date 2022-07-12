package com.example.vinylbasefullstack.controller;

import com.example.vinylbasefullstack.Repository.ArtistRepository;
import com.example.vinylbasefullstack.Repository.Userrepository;
import com.example.vinylbasefullstack.Repository.VinylRepository;
import com.example.vinylbasefullstack.model.Artist;
import com.example.vinylbasefullstack.model.User;
import com.example.vinylbasefullstack.model.Vinyl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@RestController


public class VinylBaseController {
    @Autowired
    VinylRepository repo;
    @Autowired
    ArtistRepository repository;
    @Autowired
    Userrepository Repo;

    private Logger log = LoggerFactory.getLogger(VinylBaseController.class);
@GetMapping("api/getvinyl")
    public List<Vinyl> returnVinyl(){
    return repo.returnVinyl();
}
    @PostMapping("api/getartists")
    public List<Artist>SelectArtists(){
        return repository.findArtistlist();
    }

    @PostMapping("api/addUser")
    public void adduser(User newUser, HttpServletResponse response) throws IOException {
    try {
        Repo.adduser(newUser,response);
    } catch (Exception e){
        log.error("lol get fucked");

    }

    }
    @PostMapping("api/registeruser")
    public void registeruser(User newuser, HttpServletResponse response) throws IOException{
    try {
        Repo.adduser(newuser,response);
    } catch (Exception e){
        response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), "feil i getmapping og lagring av bruker");

    }
    }

    @PostMapping("api/addvinyl")
    public void addvinyl (Vinyl newvinyl){
    repo.addVinyl(newvinyl);
    }

    @GetMapping("api/showvinyl")
    public List<Vinyl>showvinyl(){
       return repo.returnVinyl();
    }

}




