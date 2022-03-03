package com.crud.kodillalibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BorrowDto {
    private Long id;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private Long copyId;
    private Long readerId;
}
