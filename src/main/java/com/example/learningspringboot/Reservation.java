package com.example.learningspringboot;

import java.time.LocalDate;

public class Reservation {

    private Long id;
    private String name;
    private LocalDate date = LocalDate.now();

    public Reservation() {
    }

    public Reservation(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
