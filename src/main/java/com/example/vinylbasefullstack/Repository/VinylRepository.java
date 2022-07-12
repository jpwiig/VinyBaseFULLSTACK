package com.example.vinylbasefullstack.Repository;

import com.example.vinylbasefullstack.model.Artist;
import com.example.vinylbasefullstack.model.Vinyl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class VinylRepository {
Logger log = LoggerFactory.getLogger(VinylRepository.class);
    private final List<Vinyl>records= new ArrayList<>();
    private JdbcTemplate db;


    //check if artist is added, and avoid duplicates
    @Transactional
    public void addVinyl(Vinyl newVinyl) {

        String sql1 ="INSERT INTO vinyl (ArtistName, releaseyear, genre, country) VALUES (?,?,?,?)";
        String sql2="SELECT * FROM Artist;";
        String sql3="INSERT INTO Artist (ArtistName) VALUES ?";
        KeyHolder id = new GeneratedKeyHolder();
        try {
            db.update( con -> {
                PreparedStatement par = con.prepareStatement(sql1, new String[]{"kid"});
                par.setString(1, newVinyl.getArtist().getName());
                par.setString(2,  newVinyl.getReleasedate());
                par.setString(3, newVinyl.getGenre());
                par.setString(4, newVinyl.getCountry());
                return par;
            }, id);
            int kid = id.getKey().intValue();
            db.update(sql3, newVinyl.getArtist(), kid);
        } catch (Exception e) {
            log.error("feil i transaktsjonen");
        }


    }

    public List<Vinyl>returnVinyl(){
        return records;
    }
}
