package edu.zimahaba.feignclient;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface Client {

    @RequestLine("GET /feign")
    Entity getEntity();

    @RequestLine("GET /feign/{desc}/{anot}/{number}")
    Entity getFullEntity(@Param("desc") String description,
                         @Param("anot") String another,
                         @Param("number") Integer number);

    @RequestLine("POST /feign")
    Entity postEntity(Entity entity);
}
