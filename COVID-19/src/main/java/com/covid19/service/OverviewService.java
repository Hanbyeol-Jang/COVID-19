package com.covid19.service;

import java.sql.SQLException;

import com.covid19.dto.OverviewDto;

public interface OverviewService {
	public OverviewDto getAll(OverviewDto overviewDto) throws SQLException;

	public OverviewDto confirmed(OverviewDto overviewDto) throws SQLException;

	public OverviewDto getRecovered(OverviewDto overviewDto) throws SQLException;

	public OverviewDto getActive(OverviewDto overviewDto) throws SQLException;

	public OverviewDto getDeaths(OverviewDto overviewDto) throws SQLException;

	public OverviewDto getDate(OverviewDto overviewDto) throws SQLException;
}
