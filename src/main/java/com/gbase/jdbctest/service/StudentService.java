package com.gbase.jdbctest.service;


import com.gbase.jdbctest.entity.StudentDTO;

import java.util.List;

public interface StudentService {

    void createTable();

    int addStudent(String sno, String name);

    int deleteStudent(Integer id);

    int modifyStudentName(Integer id, String name);

    List<StudentDTO> studentInfo();

}
