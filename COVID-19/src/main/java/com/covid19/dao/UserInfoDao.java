package com.covid19.dao;

import java.sql.SQLException;

import com.covid19.dto.UserInfoDto;

public interface UserInfoDao {

	/* 회원가입 */
	public void join(UserInfoDto userInfoDto) throws SQLException;

	/* 로그인 */
	public UserInfoDto login(UserInfoDto userInfoDto) throws SQLException;

	/* 회원정보 변경 */
	public UserInfoDto edit(UserInfoDto userInfoDto) throws SQLException;

	/* 회원정보 삭제 */
	public void delete(UserInfoDto userInfoDto) throws SQLException;

}
