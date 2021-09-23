package com.wang.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


// sqlSessionFactory-->  sqlSession
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            // 使用mybatis第一步 获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // SqlSession 完全包含了面向数据库执行sql命令的所有方法
    public static SqlSession getSqlSession() {
        // 得到sqlSession实例
        // SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSessionFactory.openSession();
    }

}
