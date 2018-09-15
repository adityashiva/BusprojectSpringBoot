package com.busproject.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "customerdata")
public class Customerdata {
    @Id
    @Column(name = "arrival")
    String arrival;
    @Column(name = "destination")
    String destination;
    @Column(name = "rating")
    String rating;
    @Column(name = "time")
    String time;
    @Column(name = "duration")
    String duration;

    @Column(name = "username")
    String username;

    @GeneratedValue
    int customerno;

    public int getCustomerno() {
        return customerno;
    }

    public void setCustomerno(int customerno) {
        this.customerno = customerno;
    }





    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
