package com.example.newsapplication.model;

public class NewsResponse {

    private String next;
    private String previous;
    private Results results;

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

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }
}
