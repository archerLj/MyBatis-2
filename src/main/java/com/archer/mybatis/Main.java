package com.archer.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.List;

/**
 * Created by archerlj on 2017/4/7.
 */
public class Main {

    private static SqlSessionFactory sqlSessionFactory;
    public static void main(String[] args) {
        SqlSession sqlSession;
        try {
            sqlSessionFactory = Utils.getSqlSessionFactory();
            sqlSession = sqlSessionFactory.openSession(true);

            MyMapper myMapper = sqlSession.getMapper(MyMapper.class);

            Author author = myMapper.selectAuthor(1);
            System.out.println(author);

            Article article = myMapper.selectArticle(2);
            System.out.println(article);

            Article articleDetail = myMapper.selectArticleDetails(2);
            System.out.println(articleDetail);

            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
