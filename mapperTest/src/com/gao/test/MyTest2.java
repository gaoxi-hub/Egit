package com.gao.test;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.gao.entity.Role;
import com.gao.entity.User;
import com.gao.mapper.RoleMapper;
import com.gao.mapper.UserMapper;
import com.gao.util.MybatisUtil;

public class MyTest2 {
	@Test
	public void testQueryRoleAndUser()
	{
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
		List<Role> queryRoleAndUser = mapper.queryRoleAndUser();
		System.out.println(queryRoleAndUser);
	}

	
	@Test
	public void testQueryRoleAndUser2()
	{
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
		List<Role> queryRoleAndUser = mapper.queryRoleAndUser2();
		System.out.println(queryRoleAndUser);
	}
	
	
	
	@Test
	public void testQueryUsersListAndRole()
	{
		SqlSession sqlSession = MybatisUtil.getSqlSession();
	   UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		List<User> queryRoleAndUser = mapper.queryAllUser();
		System.out.println(queryRoleAndUser);
	}
	
	@Test
	public void testQueryUsersListAndRole2()
	{
		SqlSession sqlSession = MybatisUtil.getSqlSession();
	   UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		List<User> queryRoleAndUser = mapper.queryAllUser2();
		System.out.println(queryRoleAndUser);
	}
	
	
	
	@Test
	public void testRequireSelect()
	{
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
		List<Role> queryRoleAndUser = mapper.queryRoleAndUser2();
		System.out.println(queryRoleAndUser.get(0).getUsers());
	}


}
