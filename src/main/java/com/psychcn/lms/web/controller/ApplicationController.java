package com.psychcn.lms.web.controller;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.cas.authentication.CasAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.psychcn.lms.persistence.core.student.StudentService;

@Controller
@RequestMapping("/")
public class ApplicationController {
	
	@Resource
	private StudentService studentService;
	/**
	 * 首页
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping()
	public ModelAndView index(HttpServletRequest request,HttpServletResponse response,Locale locale, Model model){
		Map<String,Object> map = new HashMap<String,Object>();
		final CasAuthenticationToken token = (CasAuthenticationToken) request.getUserPrincipal();
		String username = token.getUserDetails().getUsername();
		
		Map<String,Object> student = studentService.getStudentByUsername(username);
		
		map.put("title", "首页");
		map.put("student", student);
		return new ModelAndView("index",map);
	}
}
