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
        System.out.println("2222222222222=============");
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            //通过SqlSession执行SQL语句
            List<Article> articles = sqlSession.selectList("com.stone520.blog_article.selectArticle");
            System.out.println(articles);
        } catch (IOException e) {
            System.out.println("================>");
            e.printStackTrace();
        }finally {
            if(sqlSession != null){
                sqlSession.close();
            }
        }
        System.out.println("=====================");
        return null;
    }
}
