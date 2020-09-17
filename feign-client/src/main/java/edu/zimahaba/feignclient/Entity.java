package edu.zimahaba.feignclient;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Entity {

    private String description;
    private String another;
    private Integer number;
}
