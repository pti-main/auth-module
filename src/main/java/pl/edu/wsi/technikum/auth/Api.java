package pl.edu.wsi.technikum.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/auth")
@RestController
public class Api {

    private Manager manager;

    @Autowired
    public Api(Manager manager){
        this.manager = manager;
    }

    @PostMapping("/")
    public User auth(@RequestBody User user){
        return manager.getUserInfo(user);
    }

    /*@PostMapping("/")
    public User auth(@RequestBody String code){
        return manager.findUserByCode(code);
    }*/
}
