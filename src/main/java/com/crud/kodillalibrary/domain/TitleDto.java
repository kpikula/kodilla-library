package com.crud.kodillalibrary.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TitleDto {
    private Long id;
    private String bookTitle;
    private String author;
    private Long yearOfPublication;
    private List<Copy> copies;
}