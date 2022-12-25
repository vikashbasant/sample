package com.junit;

import com.junit.pojo.Address;
import com.junit.pojo.AddressComp;
import com.junit.pojo.Employee;

import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main(String[] args) {


        Employee emp;
        emp = new Employee("sonakshi", "jain", "9671008646", true, new Address(new AddressComp("1","kanpur","up"), new AddressComp("1","kanpur","up")), "Mon");
        System.out.println(emp);


    }
}
