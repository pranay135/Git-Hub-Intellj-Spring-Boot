package org.example.services;

import org.example.dto.CollegeDTO;
import org.example.model.College;

import java.util.List;

public interface ICollegeService {
    List<College> getAllColleges();
    // Get Mapping

    College addCollege(College college);
    // Post Mapping

    College updateCollege(College college);
    // Put Mapping

    void deleteCollege(Long id);
    // Delete Mapping

    College updateCollegeField(College college);
    // Patch Mapping

    List<College> getByName(String collegeName);
    // Get Mapping

    List<College> getByNos(int collegeNos);
    // Get Mapping

    List<CollegeDTO> getallCollegesFromDB();
    // Get Mapping from Database

    CollegeDTO addCollegeToDB(CollegeDTO college);
    // Post Mapping to Database
}
