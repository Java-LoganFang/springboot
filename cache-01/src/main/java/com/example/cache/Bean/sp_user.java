package com.example.cache.Bean;

public class sp_user {
    private int user_id;
    private String username;
    private int qq_open_id;
    private int password;
    private String user_email;
    private int user_email_code;
    private String is_active;
    private String user_sex;
    private String user_qq;
    private String user_tel;
    private String user_xueli;
    private String user_hobby;
    private String user_introduce;
    private int create_time;
    private int update_time;

    public sp_user() {
    }

    @Override
    public String toString() {
        return "sp_user{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", qq_open_id=" + qq_open_id +
                ", password=" + password +
                ", user_email='" + user_email + '\'' +
                ", user_email_code=" + user_email_code +
                ", is_active='" + is_active + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_qq='" + user_qq + '\'' +
                ", user_tel='" + user_tel + '\'' +
                ", user_xueli='" + user_xueli + '\'' +
                ", user_hobby='" + user_hobby + '\'' +
                ", user_introduce='" + user_introduce + '\'' +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }

    public sp_user(int user_id, String username, int qq_open_id, int password, String user_email, int user_email_code, String is_active, String user_sex, String user_qq, String user_tel, String user_xueli, String user_hobby, String user_introduce, int create_time, int update_time) {
        this.user_id = user_id;
        this.username = username;
        this.qq_open_id = qq_open_id;
        this.password = password;
        this.user_email = user_email;
        this.user_email_code = user_email_code;
        this.is_active = is_active;
        this.user_sex = user_sex;
        this.user_qq = user_qq;
        this.user_tel = user_tel;
        this.user_xueli = user_xueli;
        this.user_hobby = user_hobby;
        this.user_introduce = user_introduce;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getQq_open_id() {
        return qq_open_id;
    }

    public void setQq_open_id(int qq_open_id) {
        this.qq_open_id = qq_open_id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public int getUser_email_code() {
        return user_email_code;
    }

    public void setUser_email_code(int user_email_code) {
        this.user_email_code = user_email_code;
    }

    public String getIs_active() {
        return is_active;
    }

    public void setIs_active(String is_active) {
        this.is_active = is_active;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_qq() {
        return user_qq;
    }

    public void setUser_qq(String user_qq) {
        this.user_qq = user_qq;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public String getUser_xueli() {
        return user_xueli;
    }

    public void setUser_xueli(String user_xueli) {
        this.user_xueli = user_xueli;
    }

    public String getUser_hobby() {
        return user_hobby;
    }

    public void setUser_hobby(String user_hobby) {
        this.user_hobby = user_hobby;
    }

    public String getUser_introduce() {
        return user_introduce;
    }

    public void setUser_introduce(String user_introduce) {
        this.user_introduce = user_introduce;
    }

    public int getCreate_time() {
        return create_time;
    }

    public void setCreate_time(int create_time) {
        this.create_time = create_time;
    }

    public int getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(int update_time) {
        this.update_time = update_time;
    }



}
