package com.userbase.user.controller;

import com.userbase.user.services.MongodbServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class Endpoints {

    private final MongodbServices mongodbServices;
//
    @Autowired
    public Endpoints(MongodbServices mongodbServices) {
        this.mongodbServices = mongodbServices;
    }

    @PostMapping("/createDocument")
    public String createDocument(@RequestBody Map<String, Object> document) {
        try {
            mongodbServices.create("yourCollectionName", document);
            return "Document created successfully";
        } catch (Exception e) {
            return "Error creating document: " + e.getMessage();
        }
    }



}
