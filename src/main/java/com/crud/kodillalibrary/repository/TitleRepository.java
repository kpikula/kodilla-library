package com.crud.kodillalibrary.repository;

import com.crud.kodillalibrary.domain.Title;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TitleRepository extends CrudRepository<Title, Long> {

}
