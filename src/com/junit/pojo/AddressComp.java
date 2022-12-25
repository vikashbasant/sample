package com.junit.pojo;

public class AddressComp {
    private String hno;
    private String city;
    private String state;

    public AddressComp(){
    }
    public AddressComp(String hno, String city, String state) {
        this.hno = hno;
        this.city = city;
        this.state = state;
    }

    public String getHno() {
        return hno;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "hno='" + hno + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
