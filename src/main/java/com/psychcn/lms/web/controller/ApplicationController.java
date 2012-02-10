package com.psychcn.lms.web.controller;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.yankun.lms.web.controller.HomeController;

@Controller
@RequestMapping("/")
public class ApplicationController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * 首页
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping()
	public ModelAndView index(HttpServletRequest request,HttpServletResponse response,Locale locale, Model model){
		Map<String,Object> map = new HashMap<String,Object>();
		logger.info("Hello World");
		map.put("title", "首页");
		return new ModelAndView("index",map);
	}
}
