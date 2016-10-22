package com.stone520.dao;

import com.stone520.Mapper.ArticleMapperInterface;
import com.stone520.bean.Article;
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
        List<Article> articles = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            //通过SqlSession执行SQL语句
            //ArticleMapperInterface articleMapperInterface = sqlSession.getMapper(com.stone520.Mapper.ArticleMapperInterface.class);
            //articleMapperInterface.insertArticle("1111111");
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(sqlSession != null){
                sqlSession.close();
            }
        }
        return articles;
    }
}
