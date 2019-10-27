package pl.edu.wsi.technikum.auth;

import org.springframework.stereotype.Service;

import static pl.edu.wsi.technikum.auth.Rank.ADMIN;
import static pl.edu.wsi.technikum.auth.Rank.USER;

@Service
public class Manager {

    public Manager(){
        User testUser1 = new User(USER, "pupil");
        User testUser2 = new User(ADMIN, "root");
    }

    public User getUserInfo(User user){
        return user;
    }

    /*public User findUserByCode(String code){
        return user;
    }*/
}
