package com.example.demo.classes;

public class Enrollment {
    private String university_code = "";
    private String code = "";
    private String code_career = "";
    private String university = "";
    private String zone = "";

    public Enrollment() {
    }

    public Enrollment(String university_code, String code, String code_career, String university, String zone) {
        this.university_code = university_code;
        this.code = code;
        this.code_career = code_career;
        this.university = university;
        this.zone = zone;
    }

    public String getUniversity_code() {
        return university_code;
    }

    public void setUniversity_code(String university_code) {
        this.university_code = university_code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode_career() {
        return code_career;
    }

    public void setCode_career(String code_career) {
        this.code_career = code_career;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
