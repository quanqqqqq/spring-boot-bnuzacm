package com.bnuz.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="t_user")
public class UserEntity implements Serializable {

    @Id
    @Column(name="User_id")
    private String userId;
    @Column(name="UserName")
    private String userName;
    @Column(name="UserEmail")
    private String userEmail;
    @Column(name="UserTel")
    private String userTel;
    @Column(name="UserCollege")
    private String userCollege;
    @Column(name="UserMajor")
    private String userMajor;
    @Column(name="UserPower")
    private byte userPower;
    @Column(name="IsMan")
    private byte isMan;
    @Column(name="State")
    private int state;
    @Column(name="CompetiterState")
    private int competiterState;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserCollege() {
        return userCollege;
    }

    public void setUserCollege(String userCollege) {
        this.userCollege = userCollege;
    }

    public String getUserMajor() {
        return userMajor;
    }

    public void setUserMajor(String userMajor) {
        this.userMajor = userMajor;
    }

    public byte getUserPower() {
        return userPower;
    }

    public void setUserPower(byte userPower) {
        this.userPower = userPower;
    }

    public byte getIsMan() {
        return isMan;
    }

    public void setIsMan(byte isMan) {
        this.isMan = isMan;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getCompetiterState() {
        return competiterState;
    }

    public void setCompetiterState(int competiterState) {
        this.competiterState = competiterState;
    }
}

