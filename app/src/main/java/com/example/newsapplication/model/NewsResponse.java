package com.example.newsapplication.model;

import java.util.List;

public class NewsResponse {

    private String next;
    private String previous;
    private List<Results> results;

    @Override
    public String toString() {
        return "NewsResponse{" +
                "next='" + next + '\'' +
                ", previous='" + previous + '\'' +
                ", results=" + results.toString() +
                '}';
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }


}
