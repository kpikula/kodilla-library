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
@Entity(name = "READERS")
public class Reader {
    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "READER_ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "ACCOUNTSTARTDATE")
    private LocalDate accountStartDate;

    @OneToMany(
            targetEntity = Borrow.class,
            mappedBy = "reader",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    private List<Borrow> borrows;
}