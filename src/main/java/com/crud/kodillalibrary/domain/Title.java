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
@Entity(name = "TITLES")
public class Title {
    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "TITLE_ID", unique = true)
    private Long id;

    @NotNull
    @Column(name = "TITLE")
    private String title;

    @NotNull
    @Column(name = "AUTHOR")
    private String author;

    @NotNull
    @Column(name = "YEAROFPUBLICATION")
    private Long yearOfPublication;

    @OneToMany(
            targetEntity = Copy.class,
            mappedBy = "title",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private List<Copy> copies;
}