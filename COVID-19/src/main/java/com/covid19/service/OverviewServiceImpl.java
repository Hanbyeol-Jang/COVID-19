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
	public OverviewDto all(OverviewDto overviewDto) throws SQLException {
		System.out.println("=== all ===");
		return overviewDao.all(overviewDto);
	}

	@Override
	public OverviewDto confirmed(OverviewDto overviewDto) throws SQLException {
		System.out.println("=== confirmed ===");
		return overviewDao.confirmed(overviewDto);
	}

	@Override
	public OverviewDto recovered(OverviewDto overviewDto) throws SQLException {
		System.out.println("=== recovered ===");
		return overviewDao.recovered(overviewDto);
	}

	@Override
	public OverviewDto active(OverviewDto overviewDto) throws SQLException {
		System.out.println("=== active ===");
		return overviewDao.active(overviewDto);
	}

	@Override
	public OverviewDto deaths(OverviewDto overviewDto) throws SQLException {
		System.out.println("=== deaths ===");
		return overviewDao.deaths(overviewDto);
	}

	@Override
	public OverviewDto date(OverviewDto overviewDto) throws SQLException {
		System.out.println("=== date ===");
		return overviewDao.date(overviewDto);
	}

}
