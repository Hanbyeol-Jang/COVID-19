package com.covid19.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.covid19.dao.OverviewDao;
import com.covid19.dto.OverviewDto;
import com.covid19.service.OverviewService;

//@CrossOrigin(origins = "*")
@Controller
public class OverviewController {
	@Autowired
	private OverviewService overviewService;

	@RequestMapping(value = "/confirmed", method = RequestMethod.GET)
	public String confirmed(OverviewDto overviewDto) throws SQLException {
		System.out.println("controller");
		System.out.println(overviewService.confirmed(overviewDto));
		return "confirmed";
	}
}
