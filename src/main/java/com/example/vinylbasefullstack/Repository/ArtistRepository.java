package com.example.vinylbasefullstack.Repository;

import com.example.vinylbasefullstack.model.Artist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArtistRepository {
    private Logger logger = LoggerFactory.getLogger(ArtistRepository.class);
    private JdbcTemplate db;



    public void addArtist(Artist addArtist){
        //transaktsjon
       String sql1=  "INSERT INTO Artist(ArtistName, startdate, enddate) VALUES (?,?,?)";
       db.update(sql1, addArtist.getName(), addArtist.getStartDate(), addArtist.getEndDate());
    }

    public List<Artist>findArtistlist (){
        String sql ="SELECT * FROM ARTIST";
        return db.query(sql, new BeanPropertyRowMapper<>(Artist.class));
    }

}
