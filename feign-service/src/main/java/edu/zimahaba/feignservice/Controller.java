package edu.zimahaba.feignservice;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("feign")
public class Controller {

    @GetMapping
    public Entity getEntity() {
        return Entity.builder().description("description").another("another").number(123).build();
    }

    @GetMapping("/{desc}/{anot}/{number}")
    public Entity getFullEntity(@PathVariable("desc") String description,
                                @PathVariable("anot") String another,
                                @PathVariable("number") Integer number) {
        return Entity.builder().description(description).another(another).number(number).build();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public Entity postEntity(@RequestBody Entity entity) {
        return entity;
    }
}
