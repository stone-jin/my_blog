package com.stone520.service;

import com.stone520.dao.ArticleLabelDao;

/**
 * Description:
 * Author: stone-jin
 * Date: 2016/10/21
 */
public class ArticleLabelService {

    public Boolean addArticleLabel(String labelName, String author){
        ArticleLabelDao articleLabelDao = new ArticleLabelDao();
        return articleLabelDao.addArticleLabel(labelName, author);
    }

    public Boolean deleteArticleLabel(Integer id){
        ArticleLabelDao articleLabelDao = new ArticleLabelDao();
        return articleLabelDao.deleteArticleLabel(id);
    }
}
