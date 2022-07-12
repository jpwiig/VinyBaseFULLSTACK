package com.example.vinylbasefullstack.Repository;

import com.example.vinylbasefullstack.model.User;
import org.mindrot.jbcrypt.BCrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class Userrepository {
@Autowired
    private JdbcTemplate db;

    private Logger logger = LoggerFactory.getLogger(Userrepository.class);
    public void adduser(User newuser, HttpServletResponse response) throws IOException {
      String sql= "insert into user(username, fname, email, passord) values (?,?,?,?)";
      //egen klasse for kryptering
        try {
            db.update(sql, newuser.getUsername(), newuser.getName(), newuser.getEmail(),kryptering(newuser) );
        } catch (Exception e){
            response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), "feil i lagring av kunder");
        }
    }

    public boolean checkuser(User user, HttpServletResponse response) throws IOException{
        try{

        } catch (Exception e){
            response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Feil i brukercheck");
            return false;
        }
        return false;
    }
    public boolean checkpw(String hash, String dbpassword){
        if (BCrypt.checkpw(hash, dbpassword)) return true;
        else return false;
    }
    private String kryptering (User user){
        return BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(20));
    }

}
