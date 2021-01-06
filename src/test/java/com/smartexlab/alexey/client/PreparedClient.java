package com.smartexlab.alexey.client;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

@Client("/goods")
public interface PreparedClient {
    
    @Get(consumes = MediaType.TEXT_PLAIN)
    Single<String> hello();
    
    
}
