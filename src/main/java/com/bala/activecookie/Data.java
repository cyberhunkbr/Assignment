package com.bala.activecookie;

public class Data {
    String cookieName ;
    String date ;

    public String getCookieName() {
        return cookieName;
    }

    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Data{" +
                "cookieName='" + cookieName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
