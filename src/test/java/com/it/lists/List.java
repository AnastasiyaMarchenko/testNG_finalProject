package com.it.lists;

import java.util.Objects;

public class List {

    public String to;
    public String subject;
    public String body;

    public List(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public String toString() {
        return "List{" +
                "to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        List list = (List) o;
        return Objects.equals(to, list.to) &&
                Objects.equals(subject, list.subject) &&
                Objects.equals(body, list.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, subject, body);
    }
}