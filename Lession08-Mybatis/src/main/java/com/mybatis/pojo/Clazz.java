package com.mybatis.pojo;

public class Clazz {
    Integer claId;
    String claName;
    public Clazz(){}
    public Clazz(Integer claId, String claName) {
        this.claId = claId;
        this.claName = claName;
    }

    public Integer getClaId() {
        return claId;
    }

    public void setClaId(Integer claId) {
        this.claId = claId;
    }

    public String getClaName() {
        return claName;
    }

    public void setClaName(String claName) {
        this.claName = claName;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "claId=" + claId +
                ", claName='" + claName + '\'' +
                '}';
    }
}
