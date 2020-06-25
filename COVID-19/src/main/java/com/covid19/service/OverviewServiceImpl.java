package com.covid19.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid19.dao.OverviewDao;
import com.covid19.dto.OverviewDto;

@Service
public class OverviewServiceImpl implements OverviewService {
	@Autowired
	private OverviewDao overviewDao;

	@Override
	public OverviewDto getAll(OverviewDto overviewDto) throws SQLException {
		System.out.println("=== all ===");
		return overviewDao.getAll(overviewDto);
	}

	@Override
	public OverviewDto confirmed(OverviewDto overviewDto) throws SQLException {
		System.out.println("=== confirmed ===");
		return overviewDao.confirmed(overviewDto);
	}

	@Override
	public OverviewDto getRecovered(OverviewDto overviewDto) throws SQLException {
		System.out.println("=== recovered ===");
		return overviewDao.getRecovered(overviewDto);
	}

	@Override
	public OverviewDto getActive(OverviewDto overviewDto) throws SQLException {
		System.out.println("=== active ===");
		return overviewDao.getActive(overviewDto);
	}

	@Override
	public OverviewDto getDeaths(OverviewDto overviewDto) throws SQLException {
		System.out.println("=== confirmed ===");
		return overviewDao.getDeaths(overviewDto);
	}

	@Override
	public OverviewDto getDate(OverviewDto overviewDto) throws SQLException {
		System.out.println("=== date ===");
		return overviewDao.getDate(overviewDto);
	}

}
