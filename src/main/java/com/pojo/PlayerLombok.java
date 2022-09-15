package com.pojo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder(setterPrefix = "set", buildMethodName = "perform")
@ToString
public class PlayerLombok {
    private String name;
    private String sport;
    private String id;
    private Boolean likesCofee;
}
