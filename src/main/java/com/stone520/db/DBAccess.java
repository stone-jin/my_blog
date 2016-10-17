package com.stone520.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Description: 专门用来访问数据库类
 * Author: stone-jin
 * Date: 2016/10/14
 */
public class DBAccess {

    public SqlSession getSqlSession() throws IOException {
        String resource = "config/Configuration.xml";
        Reader reader =  Resources.getResourceAsReader(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
}
