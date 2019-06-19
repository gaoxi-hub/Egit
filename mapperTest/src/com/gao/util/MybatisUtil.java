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
				// 2.����������
				inputStream = Resources.getResourceAsStream(resource);
				// 3.����SqlSeesionFactory ����
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				sqlSession = sqlSessionFactory.openSession(true); // �����Զ��ύ��
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
