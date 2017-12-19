package com.xyc.commomsproject.logic.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by hasee on 2017/12/19.
 */
@Entity
public class User {
    @Id
    private int id;
    private int age;
    private String userName;
    @Transient
    private int type;

    @Generated(hash = 1088886201)
    public User(int id, int age, String userName) {
        this.id = id;
        this.age = age;
        this.userName = userName;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
