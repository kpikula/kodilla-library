package com.crud.kodillalibrary.repository;

import com.crud.kodillalibrary.domain.Reader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface Title extends CrudRepository<Reader, Long> {

}
