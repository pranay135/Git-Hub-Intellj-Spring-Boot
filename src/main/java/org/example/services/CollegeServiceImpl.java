package org.example.services;

import org.example.dao.ICollegeDAO;
import org.example.dto.CollegeDTO;
import org.example.model.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CollegeServiceImpl implements ICollegeService {

    @Autowired
    ICollegeDAO collegeDAO;

    @Override
    public List<College> getAllColleges() {
        return collegeDAO.findAll();
    }
    // Get Mapping

    @Override
    public College addCollege(College college) {
        return collegeDAO.save(college);
    }
    // Post Mapping

    @Override
    public College updateCollege(College college) {
        return collegeDAO.save(college);
    }
    // Put Mapping

    @Override
    public void deleteCollege(Long id) {
        collegeDAO.deleteById(id);
    }
    // Delete Mapping

    @Override
    public College updateCollegeField(College college) {
        return collegeDAO.save(college);
    }
    // Put Mapping

    @Override
    public List<College> getByName(String collegeName) {
        return collegeDAO.findByName(collegeName);
    }
    // Get Mapping by Name

    @Override
    public List<College> getByNos(int collegeNos) {
        return collegeDAO.findByNos(collegeNos);
    }
    // Get Mapping by Nos

    @Override
    public List<CollegeDTO> getallCollegesFromDB() {
        List<College> l1 = collegeDAO.findAll();
        List<CollegeDTO> l2 = convertCollegeListToDTOList(l1);
        return l2;
    }
    // Get Mapping from Database

    @Override
    public CollegeDTO addCollegeToDB(CollegeDTO college) {
        College c = convertCollegeDTOToCollege(college);
        College c1 = collegeDAO.save(c);
        return convertCollegeToCollegeDTO(c1);
    }
    // Post Mapping to Database

    public static College convertCollegeDTOToCollege(CollegeDTO collegeDTO){
        College college = new College();
        college.setId(collegeDTO.getId());
        college.setName(collegeDTO.getMyCollegeName());
        college.setNos(collegeDTO.getNoOfStudents());
        return college;
    }
    // Conversion of College DTO to College Model i.e DTO object is converted to Model object.

    public static CollegeDTO convertCollegeToCollegeDTO(College college){
        CollegeDTO collegeDTO = new CollegeDTO();
        collegeDTO.setId(college.getId());
        collegeDTO.setMyCollegeName(college.getName());
        collegeDTO.setNoOfStudents(college.getNos());
        return collegeDTO;
    }

    // Conversion of College Model to College DTO i.e Model object is converted to DTO object.

    public static List<CollegeDTO> convertCollegeListToDTOList(List<College> collegeList){
        List<CollegeDTO> collegeDTOList = new ArrayList<>();
        for(College college : collegeList){
            collegeDTOList.add(convertCollegeToCollegeDTO(college));
        }
        return collegeDTOList;
    }

    // Conversion of College List Model to College DTO List i.e Model List object is converted to DTO List object.
}
