package pl.edu.wsi.technikum.auth;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class Manager {

    HashMap<String, User> users = new HashMap<String, User>();

    public Manager(){
        User testUser1 = new User("USER", "pupil");
        User testUser2 = new User("ADMIN", "root");
        users.put("code1", testUser1);
        users.put("code2", testUser2);
    }

    public User findUserByCode(String code){
        return users.get(code);
    }

    //jak znaleść kod do usera
    //jak sprawdzić czy istnieje dany user

    /*public String findCodeByUser(User user){
        return code;
    }*/
}
