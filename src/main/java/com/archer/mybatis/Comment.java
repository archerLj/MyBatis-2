package com.archer.mybatis;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Created by archerlj on 2017/4/7.
 */
public class Comment {
    private int id;
    private String content;
    private Author author;
    private Article article;
    private Timestamp createTime;

    public Comment() {
        super();
    }

    public Comment(String content, Author author, Article article, Timestamp createTime) {
        this.content = content;
        this.author = author;
        this.article = article;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author=" + author +
                ", article=" + article +
                ", createTime=" + createTime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
