package com.gbase.jdbctest.service.impl;

import com.gbase.jdbctest.entity.StudentDTO;
import com.gbase.jdbctest.mapper.StudentMapper;
import com.gbase.jdbctest.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public void createTable() {
        studentMapper.createTable();
    }

    @Override
    public int addStudent(String sno, String name) {
        StudentDTO dto = new StudentDTO();
        dto.setSno(sno);
        dto.setName(name);
        return studentMapper.addStudent(dto);
    }

    @Override
    public int deleteStudent(Integer id) {
        return studentMapper.deleteStudent(id);
    }

    @Override
    public int modifyStudentName(Integer id, String name) {
        return studentMapper.modifyStudentName(id, name);
    }

    @Override
    public List<StudentDTO> studentInfo() {
        return studentMapper.listStudent();
    }

}
