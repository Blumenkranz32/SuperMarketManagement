package com.seucxxy.domain;

public class Student {
    public String openid;
    public String nickname;
    public String session;
    public String call;
    public String type;
    public String realname;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Student() {
    }

    public Student(String openid, String nickname, String session, String call, String type, String realname) {
        this.openid = openid;
        this.nickname = nickname;
        this.session = session;
        this.call = call;
        this.type = type;
        this.realname = realname;
    }
}
