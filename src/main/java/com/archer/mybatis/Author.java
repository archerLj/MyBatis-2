package com.archer.mybatis;


import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by archerlj on 2017/4/7.
 */
public class Author {
    private int id;
    private String username;
    private String nickname;
    private Date birthday;
    private Timestamp registerTime;

    public Author() {
        super();
    }

    public Author(String username, String nickname, Date birthday, Timestamp registerTime) {
        this.username = username;
        this.nickname = nickname;
        this.birthday = birthday;
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", birthday=" + birthday +
                ", registerTime=" + registerTime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }
}
