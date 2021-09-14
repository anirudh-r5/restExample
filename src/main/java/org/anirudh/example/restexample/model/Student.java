package org.anirudh.example.restexample.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="sdetails")
public class Student {
    @Id
    private String sid;
    @Column
    private String fname;
    @Column
    private String lname;
    @Column
    private String dob;
    @Column
    private String address;
//    @OneToMany
//    @JoinColumn(name="student_id")
//    List<Marks> marksList = new ArrayList<>();
//
//    public List<Marks> getMarksList() {
//        return marksList;
//    }
//
//    public void setMarksList(List<Marks> marksList) {
//        this.marksList = marksList;
//    }

    public Student(String sid) {
        this.sid = sid;
    }

    public Student() {
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
