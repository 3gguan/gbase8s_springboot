package com.gbase.jdbctest.mapper;

import com.gbase.jdbctest.entity.StudentDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {

    void createTable();

    int addStudent(StudentDTO studentDTO);

    int deleteStudent(@Param("id") Integer id);

    int modifyStudentName(@Param("id") Integer id, @Param("name") String name);

    List<StudentDTO> listStudent();

}
