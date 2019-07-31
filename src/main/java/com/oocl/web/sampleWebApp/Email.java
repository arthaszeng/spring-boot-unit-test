package com.oocl.web.sampleWebApp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import static java.util.Arrays.asList;

@JsonIgnoreProperties(value = "id", allowGetters = true)
public class Email {
    private String from;
    private String to;
    private String subject;
    private String content;
    private int id;

    public Email() {
    }

    public Email(String from, String to, String subject, String content) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.content = content;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    @Override
    public String toString() {
        return String.join("", asList(from, to, subject, content, String.valueOf(id)));
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
