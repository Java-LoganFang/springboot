package com.example.cache.Bean;

import java.io.Serializable;

//Serializable加入之后表示可以序列化
public class sp_type implements Serializable {
    private int type_id;
    private String type_name;
    private int delete_time;

    public sp_type() {
    }

    public sp_type(int type_id, String type_name, int delete_time) {
        this.type_id = type_id;
        this.type_name = type_name;
        this.delete_time = delete_time;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public int getDelete_time() {
        return delete_time;
    }

    public void setDelete_time(int delete_time) {
        this.delete_time = delete_time;
    }

    @Override
    public String toString() {
        return "sp_type{" +
                "type_id=" + type_id +
                ", type_name='" + type_name + '\'' +
                ", delete_time=" + delete_time +
                '}';
    }
}
