package com.mvc.pojo;

import java.util.List;

public class Clazz {
    Integer claId;
    String claName;
    List<Student> students;
    public Clazz(){}
    public Clazz(Integer claId, String claName, List<Student> students) {
        this.claId = claId;
        this.claName = claName;
        this.students = students;
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "claId=" + claId +
                ", claName='" + claName + '\'' +
                ", students=" + students +
                '}';
    }
}
