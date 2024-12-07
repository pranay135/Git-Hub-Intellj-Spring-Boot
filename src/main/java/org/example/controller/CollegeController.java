package org.example.controller;

import org.example.dto.CollegeDTO;
import org.example.model.College;
import org.example.services.ICollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/college")
public class CollegeController {

     @Autowired
     ICollegeService collegeService;
     @GetMapping("/college/getAll")
     public List<College> getAll(){
     return collegeService.getAllColleges();
    }
    @PostMapping("/college/add")
    public College addCollege(@RequestBody College college){
          return collegeService.addCollege(college);
    }
    @PutMapping("/college/update")
    public College updateCollege(@RequestBody College college){
          return collegeService.updateCollege(college);
    }
    @DeleteMapping("/college/deleted/{id}")
    public void deleteCollege(@PathVariable (value = "id") Long id){
         collegeService.deleteCollege(id);
    }
    @PatchMapping("/college/update/field")
    public College updateCollegeField(@RequestBody College college){
         return collegeService.updateCollegeField(college);
    }
    @GetMapping("college/getByName/{name}")
    public List<College> getByName(@PathVariable String name){
         return collegeService.getByName(name);
    }
    @GetMapping("college/getByNos/{id}")
    public List<College> getByNos(@PathVariable int id){
         return collegeService.getByNos(id);
    }
    @GetMapping("/college/list")
    public List<CollegeDTO> getCollegesList(){
         return collegeService.getallCollegesFromDB();
    }
    @PostMapping("/college/addCollegeList")
    public CollegeDTO addCollegeToDB(@RequestBody CollegeDTO collegeDTO){
         return collegeService.addCollegeToDB(collegeDTO);
    }
}
