package com.crud.kodillalibrary;

import com.crud.kodillalibrary.domain.Borrow;
import com.crud.kodillalibrary.repository.BorrowRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class KodillaLibraryTestSuite {

    @Autowired
    private BorrowRepository borrowRepository;

    @Test
    void testBorrowSave() {
        //given
        Borrow borrow = new Borrow(1L, LocalDate.now(), LocalDate.now());

        //when
        borrowRepository.save(borrow);

        //then
        Assertions.assertEquals(1L, borrow.getId());

        // cleanup
        borrowRepository.deleteAll();
    }
}
