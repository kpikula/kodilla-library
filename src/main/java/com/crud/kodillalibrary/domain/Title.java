package com.crud.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "books")
public class Title {
    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID_BOOK", unique = true)
    private Long id;

    @NotNull
    @Column(name = "TITLE")
    private String bookTitle;

    @NotNull
    @Column(name = "AUTHOR")
    private String author;

    @NotNull
    @Column(name = "YEAROFPUBLICATION")
    private Long yearOfPublication;

    @OneToMany(
            targetEntity = Copy.class,
            mappedBy = "title",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    private List<Copy> copies;
}