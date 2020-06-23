package com.covid19.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covid19.service.UserInfoService;

@Controller
public class UserInfoController {
	private static Logger logger;

//	logger = LoggerFactory.getLogger(UserInfoController.class);

	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping("/index")
	public String index() throws SQLException {
		return "index";
	}
	
}
