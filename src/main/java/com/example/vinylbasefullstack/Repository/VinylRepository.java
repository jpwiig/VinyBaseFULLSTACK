package com.example.vinylbasefullstack.Repository;

import com.example.vinylbasefullstack.model.Artist;
import com.example.vinylbasefullstack.model.Vinyl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class VinylRepository {
private JdbcTemplate db;
private Logger log = LoggerFactory.getLogger(VinylRepository.class);
    public void addVinyl(Vinyl newVinyl){

    }

    public List<Vinyl>returnVinyl(){
        String sql =  "SELECT * FROM vinyl";
try {
    return db.query(sql, new BeanPropertyRowMapper<>(Vinyl.class));
} catch (Exception e){
log.error("fakk shit");
return null;
}
    }
}
