package com.archer.mybatis;

import java.util.List;

/**
 * Created by archerlj on 2017/4/7.
 */
public interface MyMapper {
    Author selectAuthor(int id);
    Article selectArticle(int id);
    Article selectArticleDetails(int id);
}
