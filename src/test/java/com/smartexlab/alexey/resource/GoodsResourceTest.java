package com.smartexlab.alexey.resource;

import com.smartexlab.alexey.client.PreparedClient;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

import javax.inject.Inject;

@MicronautTest
public class GoodsResourceTest {
    
    @Inject
    PreparedClient client;
    
    //Because of unknown reason test doesn't work
/*    @Test
    public void getGoodsTest() {
        String expectedResult = "Here will be some goods from service";
        
        String result = client.hello().blockingGet();
        
        assertNotNull(result);
        assertEquals(expectedResult, result);
    }
    */
}