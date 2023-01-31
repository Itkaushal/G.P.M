package com.kaushal.myprogp;

import android.widget.EditText;
public class Gatter {
    String  name;
    String email;
    String mobile;
    String enrollment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Gatter(String name, String email, String mobile, String enrollment, String profession, String gender) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.enrollment = enrollment;
        this.profession = profession;
        this.gender = gender;
    }

    String profession;
    String gender;
}
