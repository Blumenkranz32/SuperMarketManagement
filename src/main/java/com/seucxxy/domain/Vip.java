package com.seucxxy.domain;

public class Vip {
    private String name;
    private String phone;
    private String cardid;

    public Vip(String name, String phone, String cardid) {
        this.name = name;
        this.phone = phone;
        this.cardid = cardid;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", cardid='" + cardid + '\'' +
                '}';
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public Vip() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
