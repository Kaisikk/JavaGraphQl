package com.kaisikk.java.javagraphql.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "author", cascade = CascadeType.ALL)
    private Book book;

    private String lastname;

    private String firstname;


    public Author(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }
}
