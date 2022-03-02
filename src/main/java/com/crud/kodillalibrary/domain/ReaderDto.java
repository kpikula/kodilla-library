package com.crud.kodillalibrary.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReaderDto {
    private Long id;
    private String name;
    private LocalDate accountStartDate;
    private List<Copy> copies;
}