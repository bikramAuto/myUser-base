package com.userbase.user.services;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MongodbServices {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void create(String colletionName, Map<String, Object> document){
        MongoCollection<Document> collection = mongoTemplate.getCollection(colletionName);
        Document dbDocument = new Document(document);
        collection.insertOne(dbDocument);
        System.out.println("document insert successfully");
    }

}
