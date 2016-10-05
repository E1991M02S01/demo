package com.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String getHello() {
        return "Hello";
    }

}
