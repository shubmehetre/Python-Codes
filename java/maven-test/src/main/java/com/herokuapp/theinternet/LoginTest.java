package com.herokuapp.theinternet;


public class LoginTest {

    public void test1(){
        System.out.println("test1 from class LoginTest");
    }

    public void test2(){
        System.out.println("test2");
    }

    public void test3(){
        System.out.println("test3");
    }

    public void test4() {
        System.out.println("test4");
    }

    public static void main(String[] args){
        LoginTest obj1 = new LoginTest();
        LoginTest2 obj2 = new LoginTest2();

        obj1.test1();
        obj2.test1();

    }

}