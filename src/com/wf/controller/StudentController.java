package com.wf.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wf.bean.Student;
import com.wf.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping(value="/info/{id}",method=RequestMethod.GET)
	public String info(@PathVariable("id") Integer sid,Map<String,Object> map) {
		Student student=studentService.getStudentById(sid);
		map.put("student", student);
		return "update";
	}
	
	@RequestMapping(value="/saveInfo",method=RequestMethod.PUT)
	public String updateInfo(Student student) {
		studentService.updateInfo(student);
		return "redirect:/student/list";
		
	}
	
	
//	@PathVariable将占位符中的id值绑定到参数中
	@RequestMapping(value="/del/{id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") Integer sid) {
		studentService.deleteStudentById(sid);
		return "redirect:/student/list";
	}
	
	@RequestMapping(value="/saveInfo",method=RequestMethod.POST)
	public String saveInfo(Student student) {
		studentService.saveInfo(student);
		return "redirect:/student/list";
		
	}
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView getStudentList() {
		ModelAndView mv=new ModelAndView("list");
		List<Student> list=studentService.getStudentList();
		mv.addObject("studentList",list );
		return mv;
	}
	
	
}
