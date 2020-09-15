package com.gbase.jdbctest.controller;

import com.gbase.jdbctest.entity.StudentDTO;
import com.gbase.jdbctest.service.StudentService;
import com.gbase.jdbctest.util.ResponseData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/createTable", method = RequestMethod.POST)
    public ResponseData createTable() {
        studentService.createTable();
        return ResponseData.success();
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public ResponseData addStudent(String sno, String name) {
        return ResponseData.success(studentService.addStudent(sno, name));
    }

    @RequestMapping(value = "/deleteStudent", method = RequestMethod.POST)
    public ResponseData deleteStudent(Integer id) {
        return ResponseData.success(studentService.deleteStudent(id));
    }

    @RequestMapping(value = "/modifyStudentName", method = RequestMethod.POST)
    public ResponseData modifyStudentName(Integer id, String name) {
        return ResponseData.success(studentService.modifyStudentName(id, name));
    }

    @RequestMapping(value = "/allStudent", method = RequestMethod.GET)
    public ResponseData<List<StudentDTO>> allStudent() {
        log.info("allStudent");

        List<StudentDTO> rets = studentService.studentInfo();
        return ResponseData.success(rets);
    }

}
