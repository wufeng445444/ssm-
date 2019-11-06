package com.wf.dao;

import java.util.List;

import com.wf.bean.Student;

public interface StudentMapper {
	public List<Student> getStudentList();

	public void saveInfo(Student student);

	public void deleteStudentById(Integer sid);

	public Student getStudentById(Integer sid);

	public void updateInfo(Student student);  
	
	}
