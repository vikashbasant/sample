package com.junit.pojo;

class Cal{
    public static int div(int a, int b){

        int result = a/b;
        return result;

    }
}
public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Cal cal = new Cal();
        try{
            int result = cal.div(1,0);
            System.out.println(result);
        }catch(Exception e){
            e.printStackTrace ();
        }
    }
}
