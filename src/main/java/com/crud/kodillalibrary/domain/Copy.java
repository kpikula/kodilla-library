package com.crud.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "copies")
public class Copy {
    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID_COPY", unique = true)
    private Long id;

    @NotNull
    @Column(name = "STATUS")
    private String status;

    @ManyToOne
    @JoinColumn(name = "TITLE_ID")
    public Title title;

    @ManyToOne
    @JoinColumn(name = "READER_ID")
    public Reader reader;
}