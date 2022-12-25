package com.junit.pojo;

public class Address {
    private AddressComp cAddress;
    private AddressComp pAddress;


    public Address() {
    }

    public Address(AddressComp cAddress, AddressComp pAddress) {
        this.cAddress = cAddress;
        this.pAddress = pAddress;
    }

    public AddressComp getcAddress() {
        return cAddress;
    }

    public void setcAddress(AddressComp cAddress) {
        this.cAddress = cAddress;
    }

    public AddressComp getpAddress() {
        return pAddress;
    }

    public void setpAddress(AddressComp pAddress) {
        this.pAddress = pAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "cAddress=" + cAddress +
                ", pAddress=" + pAddress +
                '}';
    }
}
