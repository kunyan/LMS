package org.yankun.lms.web.controller;


import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.cas.authentication.CasAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.yankun.lms.entity.User;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/")
public class HomeController {
	
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
		final CasAuthenticationToken token = (CasAuthenticationToken) request.getUserPrincipal();

		String username = token.getUserDetails().getUsername();
		map.put("username", username);
		
		return new ModelAndView("home",map);
	}
	
	@RequestMapping("/testForm")
	public ModelAndView testForm(HttpServletRequest request,HttpServletResponse response,Locale locale, Model model){
		Map<String,Object> map = new HashMap<String,Object>();
		User user = new User();
		map.put("user", user);
		return new ModelAndView("form",map);
	}
	
	@RequestMapping("/doTestForm")
	public ModelAndView doTestForm(@Valid User user,BindingResult result, Model model){
		Map<String,Object> map = new HashMap<String,Object>();
		if (result.hasErrors()) {
			return new ModelAndView("form",map);
		}
		return new ModelAndView("success",map);
	}
	
}
