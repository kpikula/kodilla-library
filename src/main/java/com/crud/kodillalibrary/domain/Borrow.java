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
@Entity(name = "borrowing")
public class Borrow {
    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID_BORROW", unique = true)
    private Long id;

    @NotNull
    @Column(name = "BORROWDATE")
    private LocalDate borrowDate;

    @NotNull
    @Column(name = "RETURNDATE")
    private LocalDate returnDate;
}
