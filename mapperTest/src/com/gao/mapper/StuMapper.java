package com.gao.mapper;

import java.util.List;

import com.gao.entity.Student;

public interface StuMapper {

	List<Student> queryAll();

	Student selectStu(int stuid);

}
