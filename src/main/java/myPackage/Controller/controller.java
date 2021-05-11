package myPackage.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class controller {


    @GetMapping("/home")
    public String home() {
        return "hello!, working correctly";
    }
}

