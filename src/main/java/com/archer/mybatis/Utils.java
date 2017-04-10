package com.archer.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by archerlj on 2017/4/7.
 */
public abstract class Utils {


    private static volatile SqlSessionFactory sqlSessionFactory;
    public static final String configLocation = "mybatis-config.xml";

    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        if (sqlSessionFactory == null) {
            synchronized (Utils.class) {
                if (sqlSessionFactory == null) {
                    InputStream inputStream = Resources.getResourceAsStream(configLocation);
                    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
                    inputStream.close();
                }
            }
        }
        return sqlSessionFactory;
    }
}
