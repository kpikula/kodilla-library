package com.crud.kodillalibrary.controller;

import com.crud.kodillalibrary.domain.ReaderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/readers")
@RequiredArgsConstructor
public class ReaderController {
    @GetMapping
    public List<ReaderDto> getReaders() {
        return new ArrayList<>();
    }

    @PostMapping
    public void createReader(ReaderDto readerDto) {
    }
}
