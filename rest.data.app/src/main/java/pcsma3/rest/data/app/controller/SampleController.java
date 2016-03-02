package pcsma3.rest.data.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pcsma3.rest.data.app.main.Constants;

@RestController
public class SampleController {
 
    @RequestMapping("/")
    public String index() {
        return "Welcome to the home page\nThe APIS have been defined at /api";
    }
 
}