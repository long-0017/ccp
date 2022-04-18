package com.allinfinance.ccp.model;

public class TblCcp {
    private String id;

    private String name;

    private String value;

    public TblCcp(String id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public TblCcp() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    @Override
    public String toString() {
        return "TblCcp{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}