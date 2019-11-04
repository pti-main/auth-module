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

    @GetMapping("/")
    public User auth(@RequestParam String code){
        return manager.findUserByCode(code);
    }
}
