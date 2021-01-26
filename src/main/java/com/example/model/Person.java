package com.example.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String github;
    private String start;
    private Integer java;
    private Integer bestPractice;
    private Integer tdd;
    private Integer question;
    private Integer hibernate;
    private Integer html;
    private Integer jsp;
    private Integer thymeleaf;
    private Integer git;
    private Integer checkbox;


    public Person() {

    }

    public Person(Long id, String firstName, String lastName, String github, String start, Integer java, Integer bestPractice, Integer tdd, Integer question, Integer hibernate, Integer html, Integer jsp, Integer thymeleaf, Integer git, Integer checkbox) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.github = github;
        this.start = start;
        this.java = java;
        this.bestPractice = bestPractice;
        this.tdd = tdd;
        this.question = question;
        this.hibernate = hibernate;
        this.html = html;
        this.jsp = jsp;
        this.thymeleaf = thymeleaf;
        this.git = git;
        this.checkbox = checkbox;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public Integer getJava() {
        return java;
    }

    public void setJava(Integer java) {
        this.java = java;
    }

    public Integer getBestPractice() {
        return bestPractice;
    }

    public void setBestPractice(Integer bestPractice) {
        this.bestPractice = bestPractice;
    }

    public Integer getTdd() {
        return tdd;
    }

    public void setTdd(Integer tdd) {
        this.tdd = tdd;
    }

    public Integer getQuestion() {
        return question;
    }

    public void setQuestion(Integer question) {
        this.question = question;
    }

    public Integer getHibernate() {
        return hibernate;
    }

    public void setHibernate(Integer hibernate) {
        this.hibernate = hibernate;
    }

    public Integer getHtml() {
        return html;
    }

    public void setHtml(Integer html) {
        this.html = html;
    }

    public Integer getJsp() {
        return jsp;
    }

    public void setJsp(Integer jsp) {
        this.jsp = jsp;
    }

    public Integer getThymeleaf() {
        return thymeleaf;
    }

    public void setThymeleaf(Integer thymeleaf) {
        this.thymeleaf = thymeleaf;
    }

    public Integer getGit() {
        return git;
    }

    public void setGit(Integer git) {
        this.git = git;
    }

    public Integer getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(Integer checkbox) {
        this.checkbox = checkbox;
    }
}
