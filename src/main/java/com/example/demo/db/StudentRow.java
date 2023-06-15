package com.example.demo.db;

import com.example.demo.Student;

import javax.persistence.*;
import java.util.Set;

@Entity
public class StudentRow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String number;
    private String section;

    @OneToMany(mappedBy = "student")
    private Set<ScoreRow> scores;
    protected StudentRow(){}
    public StudentRow(String name, String number, String section) {
        this.name = name;
        this.number = number;
        this.section = section;
    }
    public Student toStudent() {
        return new Student(
                this.getId(),
                this.getName(),
                this.getNumber(),
                this.getSection()
        );
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Set<ScoreRow> getScores() {
        return scores;
    }

    public void setScores(Set<ScoreRow> scores) {
        this.scores = scores;
    }
}
