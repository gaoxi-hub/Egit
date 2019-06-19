package com.gao.test;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.ibatis.builder.annotation.MapperAnnotationBuilder;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import com.gao.entity.Student;
import com.gao.mapper.StuMapper;
import com.gao.util.MybatisUtil;

public class MyTest {
	StuMapper mapper = null;

	@Before
	public void init() {
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		mapper = sqlSession.getMapper(StuMapper.class);
	}

	@Test
	public void testQueryAll() {
		List<Student> queryAll = mapper.queryAll();
		System.out.println(queryAll);
	}

	@Test
	public void testSelectOneStu() {
		Student selectStu = mapper.selectStu(1);
		System.out.println(selectStu);
	}
	


}
