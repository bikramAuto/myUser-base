package com.userbase.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class MongodbServices {

    @Autowired
    private MongoTemplate mongoTemplate;


}