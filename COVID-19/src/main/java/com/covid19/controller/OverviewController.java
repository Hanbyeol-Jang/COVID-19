package com.covid19.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String all(Model model, OverviewDto overviewDto) throws SQLException {
		model.addAttribute("overviewList", overviewService.all(overviewDto));
		System.out.println(overviewService.all(overviewDto));
		return "all";
	}

	@RequestMapping(value = "/confirmed", method = RequestMethod.GET)
	public String confirmed(OverviewDto overviewDto) throws SQLException {
		System.out.println(overviewService.confirmed(overviewDto));
		return "confirmed";
	}

	@RequestMapping(value = "/recovered", method = RequestMethod.GET)
	public String recovered(OverviewDto overviewDto) throws SQLException {
		System.out.println(overviewService.recovered(overviewDto));
		return "recovered";
	}

	@RequestMapping(value = "/active", method = RequestMethod.GET)
	public String active(OverviewDto overviewDto) throws SQLException {
		System.out.println(overviewService.active(overviewDto));
		return "active";
	}

	@RequestMapping(value = "/deaths", method = RequestMethod.GET)
	public String deaths(OverviewDto overviewDto) throws SQLException {
		System.out.println(overviewService.deaths(overviewDto));
		return "deaths";
	}

	@RequestMapping(value = "/date", method = RequestMethod.GET)
	public String date(OverviewDto overviewDto) throws SQLException {
		System.out.println(overviewService.date(overviewDto));
		return "date";
	}
}
