package com.nisum.dsegovia.controller;


import com.nisum.dsegovia.utils.JWTUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
public class TokenTestController {

    @GetMapping
    public ResponseEntity<?> getToken(){
        return new ResponseEntity<>(JWTUtil.getJWTToken(""), HttpStatus.OK);
    }
}
