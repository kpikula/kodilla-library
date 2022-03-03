package com.crud.kodillalibrary.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CopyDto {
    private Long id;
    private String status;
    private Long titleId;
    private List<BorrowDto> borrows;
}