package com.e.ggmap;


import com.e.ggmap.model.Results;

public class RootClass {

    private Object[] htmlAttributions;
    private Results[] results;
    private String status;

    public void setHtmlAttributions(Object[] htmlAttributions) {
        this.htmlAttributions = htmlAttributions;
    }

    public Object[] getHtmlAttributions() {
        return this.htmlAttributions;
    }

    public void setResults(Results[] results) {
        this.results = results;
    }

    public Results[] getResults() {
        return this.results;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }


}