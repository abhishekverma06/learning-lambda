package com.example.lambda;

public class Main {
    public static void main(String[] args) {
        System.out.println("My Application");

        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.sayHello();

        MyInterface myIn = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("this is my first anonymous class");
            }
        };

        myIn.sayHello();

        MyInterface myIn2 = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("this is my second anonymous class");
            }
        };

        myIn2.sayHello();

        // using lambda

        MyInterface myIn3 = ()->{
            System.out.println("first time using lambda");
        };

        myIn3.sayHello();
    }
}
