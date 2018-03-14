package com.bnuz.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_team")
public class TeamEntity implements Serializable
{
    @Id
    @GeneratedValue
    private Long teamId;
    private int contestId;
    private String teamName;
    private String leaderId;
    private boolean hasPsw;
    private String password;
    private String remark;
    private int person;
    private String userName;
    //构造函数
    public TeamEntity()
    {

    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public int getContestId() {
        return contestId;
    }

    public void setContestId(int contestId) {
        this.contestId = contestId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }

    public boolean isHasPsw() {
        return hasPsw;
    }

    public void setHasPsw(boolean hasPsw) {
        this.hasPsw = hasPsw;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

