package com.wang.dao;

import com.wang.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    List<Student> getStudent();
}
