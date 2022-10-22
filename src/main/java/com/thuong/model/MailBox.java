package com.thuong.model;

public class MailBox {
    private Integer id;
    private String language;
    private Integer size;
    private String filter;
    private String signature;

    public MailBox() {
    }

    public MailBox(Integer id, String language, Integer size, String filter, String signature) {
        this.id = id;
        this.language = language;
        this.size = size;
        this.filter = filter;
        this.signature = signature;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
