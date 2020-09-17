package edu.zimahaba.feignclient;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class FeignClientApplication {

    public static void main(String[] args) {
        System.out.println("Client started");

        Client client = Feign.builder().decoder(new JacksonDecoder()).encoder(new JacksonEncoder())
                .target(Client.class, "http://localhost:8080");

        Entity entity = client.getEntity();
        System.out.println(entity.toString());

        Entity fullEntity = client.getFullEntity("description", "another", 432);
        System.out.println(fullEntity.toString());

        Entity postEntity = client.postEntity(fullEntity);
        System.out.println(postEntity.toString());
    }
}
