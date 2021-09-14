package org.anirudh.example.restexample.model;

import javax.persistence.*;

@Entity
@Table(name="marks")
public class Marks {
    @Id
    private String id;
    @Column(name = "test_no")
    private String testno;
    @Column
    private String m1;
    @Column
    private String m2;
    @Column
    private String m3;
    @ManyToOne
    @JoinColumn(name="student_id", referencedColumnName = "sid")
    private Student student;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTestno() { return testno; }

    public void setTestno(String testno) {
        this.testno = testno;
    }

    public String getM1() { return m1; }

    public void setM1(String m1) {
        this.m1 = m1;
    }

    public String getM2() {
        return m2;
    }

    public void setM2(String m2) {
        this.m2 = m2;
    }

    public String getM3() {
        return m3;
    }

    public void setM3(String m3) {
        this.m3 = m3;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
