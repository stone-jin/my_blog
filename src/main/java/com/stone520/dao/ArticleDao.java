package com.stone520.dao;

import com.stone520.db.DBAccess;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

/**
 * Description:
 * Author: stone-jin
 * Date: 2016/10/15
 */
public class ArticleDao {
    public List<Article> queryArticles(){
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            //通过SqlSession执行SQL语句
            //List<Article> articles = sqlSession.selectList("com.stone520.blog_article.selectArticle");
            //System.out.println(articles);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        System.out.println("=====================");
        return null;
    }
}
