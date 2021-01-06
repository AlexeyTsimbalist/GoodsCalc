package com.smartexlab.alexey.resource;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class GoodsResource {
    
    @Get(value = "/goods", produces = MediaType.TEXT_PLAIN)
    public String GetGoods() {
        return "Here will be some goods from service";
    }
}