package com.gbase.jdbctest.entity;

import lombok.Data;

@Data
public class StudentDTO {
    private String id;

    /* 学号 */
    private String sno;

    /* 姓名 */
    private String name;
}
