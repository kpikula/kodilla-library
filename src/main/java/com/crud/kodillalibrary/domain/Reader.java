package com.crud.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "readers")
public class Reader {
    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID_READER")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ACCOUNTSTARTDATE")
    private LocalDate accountStartDate;
}