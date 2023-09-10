package com.enterprise.spring.jpa.postgresql.repository;

import com.enterprise.spring.jpa.postgresql.model.SampleTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SampleTableRepository extends JpaRepository<SampleTable, Long> {

  List<SampleTable> findByNameContaining(String name);
}
