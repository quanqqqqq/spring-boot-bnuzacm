package com.bnuz.entity;


import com.bnuz.utils.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;

@Entity
@Table(name = "t_test")
public class TestEntity {

    @Id
    @GeneratedValue
    private int id;

    private long date;

    @JsonSerialize(using = CustomDateSerializer.class)
    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }
}