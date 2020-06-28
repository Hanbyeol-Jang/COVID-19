package com.covid19.dao;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.covid19.dto.OverviewDto;

@Repository
@Mapper
public class OverviewDaoImpl implements OverviewDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public OverviewDto all(OverviewDto overviewDto) throws SQLException {
		return sqlSession.selectOne("overviewDao.all", overviewDto);
	}

	@Override
	public OverviewDto confirmed(OverviewDto overviewDto) throws SQLException {
		return sqlSession.selectOne("coverviewDao.confirmed", overviewDto);
	}

	@Override
	public OverviewDto recovered(OverviewDto overviewDto) throws SQLException {
		return sqlSession.selectOne("overviewDao.recovered", overviewDto);
	}

	@Override
	public OverviewDto active(OverviewDto overviewDto) throws SQLException {
		return sqlSession.selectOne("overviewDao.active", overviewDto);
	}

	@Override
	public OverviewDto deaths(OverviewDto overviewDto) throws SQLException {
		return sqlSession.selectOne("overviewDao.deaths", overviewDto);
	}
	
	@Override
	public OverviewDto date(OverviewDto overviewDto) throws SQLException {
		return sqlSession.selectOne("overviewDao.date", overviewDto);
	}

}
