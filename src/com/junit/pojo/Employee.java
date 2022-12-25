package com.junit.pojo;



enum WorkingDays{
    Mon, Tue, Wed;
}
public class Employee {
    private String firstName;
    private String lastName;
    private String mobileNo;
    private boolean status;
    private Address address;
    private WorkingDays workingDays;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String mobileNo, boolean status, Address address, String workingDays) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.status = status;
        this.address = address;
        this.workingDays = WorkingDays.valueOf(workingDays);
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getWorkingDays() {
        return String.valueOf(workingDays);
    }

    public void setWorkingDays(String workingDays) {
        this.workingDays = WorkingDays.valueOf(workingDays);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", status=" + status +
                ", address=" + address +
                ", workingDays='" + workingDays + '\'' +
                '}';
    }
}
