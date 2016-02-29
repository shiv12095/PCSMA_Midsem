package pcsma3.rest.data.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
 
    @RequestMapping("/sample")
    public String index() {
        return "Greetings from Spring Boot!";
    }
 
}