package com.covid19.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.covid19.dto.UserInfoDto;

@Repository
public class UserInfoDaoImpl implements UserInfoDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void join(UserInfoDto userInfoDto) throws SQLException {
		sqlSession.insert("com.covid19.UserInfoDao.join", userInfoDto);
	}

	@Override
	public UserInfoDto login(UserInfoDto userInfoDto) throws SQLException {
		return sqlSession.selectOne("com.covid19.UserInfoDao.login", userInfoDto);
	}

	@Override
	public UserInfoDto edit(UserInfoDto userInfoDto) throws SQLException {
		return sqlSession.selectOne("com.covid19.UserInfoDao.edit", userInfoDto);
	}

	@Override
	public void delete(UserInfoDto userInfoDto) throws SQLException {
		sqlSession.delete("com.covid19.UserInfoDao.delete", userInfoDto);
	}
}
