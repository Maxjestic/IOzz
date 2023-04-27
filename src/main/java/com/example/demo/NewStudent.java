package com.example.demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NewStudent {
    final String name;
    final String number;
    final String section;
@JsonCreator
    public NewStudent(
        @JsonProperty("name") String name,
        @JsonProperty("number") String number,
        @JsonProperty("section") String section) {
        this.name = name;
        this.number = number;
        this.section = section;
    }
}
