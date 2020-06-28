package com.covid19.dao;

import java.sql.SQLException;

import com.covid19.dto.OverviewDto;

public interface OverviewDao {
	public OverviewDto all(OverviewDto overviewDto) throws SQLException;

	public OverviewDto confirmed(OverviewDto overviewDto) throws SQLException;

	public OverviewDto recovered(OverviewDto overviewDto) throws SQLException;

	public OverviewDto active(OverviewDto overviewDto) throws SQLException;

	public OverviewDto deaths(OverviewDto overviewDto) throws SQLException;
	
	public OverviewDto date(OverviewDto overviewDto) throws SQLException;

}
