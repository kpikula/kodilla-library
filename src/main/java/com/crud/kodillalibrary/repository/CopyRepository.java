package com.crud.kodillalibrary.repository;

import com.crud.kodillalibrary.domain.Borrow;
import com.crud.kodillalibrary.domain.Copy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CopyRepository extends CrudRepository<Copy, Long> {

}
