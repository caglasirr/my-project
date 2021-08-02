package com.example.myproject.Entities;

import javax.persistence.*;

@Entity
@Table(name="configuration")
public class Configuration{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="searchtype")
    private String searchType;

    @Column(name="sourcetype")
    private String sourceType;

    @Column(name="createdate")
    private String createDate;

    @Column(name="createdbyusername")
    private String createdByUsername;

    public Configuration() {

    }

    public Configuration(String name, String description, String searchType, String sourceType, String createDate, String createdByUserName) {
        this.name = name;
        this.description = description;
        this.searchType = searchType;
        this.sourceType = sourceType;
        this.createDate = createDate;
        this.createdByUsername = createdByUserName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreatedByUserName() {
        return createdByUsername;
    }

    public void setCreatedByUserName(String createdByUserName) {
        this.createdByUsername = createdByUserName;
    }
}
