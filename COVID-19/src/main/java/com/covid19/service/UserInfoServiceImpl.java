package com.covid19.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid19.dao.UserInfoDao;
import com.covid19.dto.UserInfoDto;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public void join(UserInfoDto userInfoDto) throws SQLException {
		System.out.println("=== join ===");
		userInfoDao.join(userInfoDto);
	}

	@Override
	public UserInfoDto login(UserInfoDto userInfoDto) throws SQLException {
		System.out.println("=== login ===");
		return userInfoDao.login(userInfoDto);
	}

	@Override
	public UserInfoDto edit(UserInfoDto userInfoDto) throws SQLException {
		System.out.println("=== edit ===");
		return userInfoDao.edit(userInfoDto);
	}

	@Override
	public void delete(UserInfoDto userInfoDto) throws SQLException {
		System.out.println("=== delete ===");
		userInfoDao.delete(userInfoDto);
	}

}
