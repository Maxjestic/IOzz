package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Score {
    public final int score;
    public final String comment;

    public Score(@JsonProperty("score") int score, @JsonProperty("comment") String comment) {
        this.score = score;
        this.comment = comment;
    }

}