package com.crud.kodillalibrary.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "BORROWS")
public class Borrow {
    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "BORROW_ID", unique = true)
    private Long id;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "BORROWDATE")
    private LocalDate borrowDate;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "RETURNDATE")
    private LocalDate returnDate;

    @ManyToOne
    @JoinColumn(name = "READER_ID")
    public Reader reader;

    @ManyToOne
    @JoinColumn(name = "COPY_ID")
    public Copy copy;

}
