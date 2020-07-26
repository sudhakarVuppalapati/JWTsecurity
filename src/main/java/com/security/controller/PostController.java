package com.security.controller;


import com.security.model.JwtRequest;
import com.security.model.JwtResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PostController {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {

        System.out.println("createAuthenticationToken    test  ");
        return ResponseEntity.ok(new JwtResponse("Tests the post JSON Object"));

    }
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public ResponseEntity<?> createAuthenticationToken() throws Exception {

        System.out.println("createAuthenticationToken    test1  ");
        return ResponseEntity.ok(new JwtResponse("Tests the post JSON Object"));

    }

    }
