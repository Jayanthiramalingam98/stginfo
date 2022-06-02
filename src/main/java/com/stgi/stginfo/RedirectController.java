package com.stgi.stginfo;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Map;

@RestController
public class RedirectController {
 
    @GetMapping(value = "/")
    public ResponseEntity<Object> redirect(@RequestParam Map<String,String> input){
 
        System.out.println(input);
 
      
   return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("https://www.stgit.com/")).build();
   // return "redirect:/redirect";
    }
}