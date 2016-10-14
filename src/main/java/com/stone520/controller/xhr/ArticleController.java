package com.stone520.controller.xhr;

import com.stone520.dao.Article;
import com.stone520.model.ArticleInfo;
import com.stone520.model.ArticleResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description:
 * Author: stone-jin
 * Date: 2016/10/14
 */
@Controller
@RequestMapping("/xhr")
public class ArticleController {

    @RequestMapping("/article")
    @ResponseBody
    public ArticleResult publicArticle(@RequestBody ArticleInfo articleInfo){
        System.out.println(articleInfo.toString());
        ArticleResult article = new ArticleResult();
        return article;
    }
}
