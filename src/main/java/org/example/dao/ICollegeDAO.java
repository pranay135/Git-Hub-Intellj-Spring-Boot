package org.example.dao;

import org.example.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICollegeDAO extends JpaRepository<College,Long> {
   List<College> findByName(String name);
   List<College> findByNos(int nos);
}
