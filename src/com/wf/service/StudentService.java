package com.wf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wf.bean.Student;
import com.wf.dao.StudentMapper;


@Service
public class StudentService {
	@Autowired
	private StudentMapper studentMapper;
	public List<Student> getStudentList() {
		
		return studentMapper.getStudentList();
	}
	public void saveInfo(Student student) {
			studentMapper.saveInfo(student);
		
	}
	public void deleteStudentById(Integer sid) {
		studentMapper.deleteStudentById(sid);
		
	}
	public Student getStudentById(Integer sid) {
		
		return studentMapper.getStudentById(sid);
		
	}
	public void updateInfo(Student student) {
		studentMapper.updateInfo(student);
		
	}

	
}
