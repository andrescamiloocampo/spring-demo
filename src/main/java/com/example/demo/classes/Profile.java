package com.example.demo.classes;

public class Profile {
    private String id = "";
    private String name = "";
    private String lastname = "";
    private int age = 0;
    private double salary = 0;
    private String marital_status = "";
    private Address address;
    private Enrollment enrollment;

    public Profile(String id, String name, String lastname, int age, double salary, String marital_status) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.marital_status = marital_status;
    }

    public Profile(){
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }
}
