package com.esmael.spring.security.jpa.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home()
    {
        return "<h2>Welcome</h2>";
    }
    @GetMapping("/user")
    public String user()
    {
        return "<h2>Welcome user</h2>";
    }
    @GetMapping("/admin")
    public String admin()
    {
        return "<h2>Welcome admin</h2>";
    }
}
