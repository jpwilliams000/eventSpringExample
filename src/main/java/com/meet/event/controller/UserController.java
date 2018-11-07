package com.meet.event.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users", produces = "application/json")
public class UserController {

    @RequestMapping(path = "", method = RequestMethod.GET)
    public ResponseEntity<Integer> getUsers() {
        return new ResponseEntity<Integer>(5, HttpStatus.OK);
    }
}
