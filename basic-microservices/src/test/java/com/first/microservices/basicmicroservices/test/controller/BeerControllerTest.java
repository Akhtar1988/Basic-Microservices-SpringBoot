package com.first.microservices.basicmicroservices.test.controller;

import com.first.microservices.basicmicroservices.controller.BeerController;
import com.first.microservices.basicmicroservices.model.BeerDto;
import com.first.microservices.basicmicroservices.model.BeerStyleEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

@WebMvcTest(BeerController.class)
public class BeerControllerTest {
    @Autowired
    MockMvc mockMvc;

    void getBeerById() {

    }

    BeerDto getValidBeerDto() {
        return BeerDto.builder()
                .beerName("test")
                .beerStyle(BeerStyleEnum.ALE)
                .price(new BigDecimal("2.4"))
                .upc(121234567L)
                .build();
    }
}
