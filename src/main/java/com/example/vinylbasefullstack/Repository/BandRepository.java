package com.example.vinylbasefullstack.Repository;

import com.example.vinylbasefullstack.model.Artist;
import com.example.vinylbasefullstack.model.Band;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BandRepository {
    private Logger log =  LoggerFactory.getLogger(BandRepository.class);
    private JdbcTemplate db;
    public boolean checkIfmemberIsInDB (Band band){
        String sql =  "Select * from Artist Where ArtistName = ?";
        db.update(sql, band.getGuitarist());
        db.update(sql, band.getBass());
        db.update(sql,band.getDrums());
        db.update(sql, band.getOther());
        db.update(sql, band.getVocals());
        //error if the member is not in db
        if (db.getMaxRows() == 0) return false;
        else return true;
    }

}
