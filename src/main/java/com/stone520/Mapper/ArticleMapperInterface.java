package com.stone520.Mapper;

import org.apache.ibatis.annotations.Insert;

/**
 * Description:
 * Author: stone-jin
 * Date: 2016/10/17
 */
public interface ArticleMapperInterface {

    @Insert("insert into blog_article(content)values(#{content})")
    int insertArticle(String content);
}
