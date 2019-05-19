package org.springmvcshoppingcart.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class Api {
    @RequestMapping("/re")
    public String aa(){
        HashMap<String,String> v = new HashMap<String, String>();
        v.put("sdsds","ssdds");
        v.put("sdsdssssd","ssdds");
        v.put("sdsdssdsdsd","ssdds");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = null;
        try {
            json = objectMapper.writeValueAsString(v);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

}
