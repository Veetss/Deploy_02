package co.develhope.deploy2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/basic")
public class BasicController {

    @GetMapping("/random-sum")
    public int randomSum(){
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        return a + b;
    }

}