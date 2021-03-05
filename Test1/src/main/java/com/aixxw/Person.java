package com.aixxw;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Person {
    private Integer age;
    private String name;
    private String time;
}
