package com.stone520.dao;

import com.stone520.bean.ArticleLabel;
import com.stone520.db.DBAccess;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

/**
 * Description:
 * Author: stone-jin
 * Date: 2016/10/21
 */
public class ArticleLabelDao {

    public Boolean addArticleLabel(String labelName, String author){
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;

        try {
            sqlSession = dbAccess.getSqlSession();
            ArticleLabel articleLabel = new ArticleLabel();
            articleLabel.setLabelName(labelName);
            articleLabel.setAuthor(author);
            sqlSession.insert("com.stone520.label.add_label", articleLabel);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != sqlSession){
                sqlSession.close();
            }
        }

        return Boolean.TRUE;
    }

    public Boolean deleteArticleLabel(Integer id){
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;

        try {
            sqlSession = dbAccess.getSqlSession();
            ArticleLabel articleLabel = new ArticleLabel();
            articleLabel.setId(id);
            sqlSession.delete("com.stone520.label.delete_label", articleLabel);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != sqlSession){
                sqlSession.close();
            }
        }
        return Boolean.TRUE;
    }
}
