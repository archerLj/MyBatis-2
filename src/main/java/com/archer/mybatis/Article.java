package com.archer.mybatis;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by archerlj on 2017/4/7.
 */
public class Article {
    private int id;
    private String title;
    private String content;
    private Author author;
    private List<Comment> comments;
    private Timestamp createTime;
    private Timestamp modifyTime;

    public Article() {
        super();
    }

    public Article(String title, String content, Author author, List<Comment> comments, Timestamp createTime, Timestamp modifyTime) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.comments = comments;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author=" + author +
                ", comments=" + comments +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }
}
