package com.gao.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {

	private static SqlSession sqlSession = null;

	public static synchronized SqlSession getSqlSession() {
		if (sqlSession == null) {
			String resource = "Mybatis.xml";
			InputStream inputStream;
			try {
				// 2.加载输入流
				inputStream = Resources.getResourceAsStream(resource);
				// 3.创建SqlSeesionFactory 工厂
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				sqlSession = sqlSessionFactory.openSession(true); // 设置自动提交。
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sqlSession;

	}

	public static void closeSqlSession() {
		if (sqlSession != null) {
			sqlSession.close();
		}
	}

}
