package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class FunRestController {

    //expose '/' that return "hello world"

    @GetMapping( "/")
    public String sayHello(){
        return "hello world";
    }

    //expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5K!";
    }

    //expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day. ";
    }
}
