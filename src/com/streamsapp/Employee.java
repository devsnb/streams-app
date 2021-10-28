package com.streamsapp;

public class Employee {
    String name;
    String city;
    String eid;

    public Employee(String name, String city, String eid) {
        this.name = name;
        this.city = city;
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getEid() {
        return eid;
    }

    @Override
    public String toString() {
        return "{name=" + name + "," + " city=" + city + "," + " eid=" + eid + "}";
    }
}
