package com.first.microservices.basicmicroservices.test.controller;

import com.first.microservices.basicmicroservices.controller.BeerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(BeerController.class)
public class BeerControllerTest {
    @Autowired
    MockMvc mockMvc;

    void getBeerById(){

    }
}
