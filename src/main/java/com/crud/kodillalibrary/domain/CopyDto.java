package com.crud.kodillalibrary.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CopyDto {
    private Long id;
    private String status;
    public Title title;
    public Reader reader;
}