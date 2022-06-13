package com.hibernanteapp.hibernateapp.model;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
    private String course;
    private String duration;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Certificate [course=" + course + ", duration=" + duration + "]";
    }

}
