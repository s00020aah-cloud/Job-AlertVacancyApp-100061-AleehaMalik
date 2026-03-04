package com.example.jobalertvacancyapp.models;

public class Job {

    private String title;
    private String company;
    private String description;
    private String location;
    private String salary;

    public Job(String title, String company, String description, String location, String salary) {
        this.title = title;
        this.company = company;
        this.description = description;
        this.location = location;
        this.salary = salary;
    }

    public String getTitle() { return title; }
    public String getCompany() { return company; }
    public String getDescription() { return description; }
    public String getLocation() { return location; }
    public String getSalary() { return salary; }
}
