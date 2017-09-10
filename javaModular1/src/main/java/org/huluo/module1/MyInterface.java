package org.huluo.module1;

public interface MyInterface  {
    int a = 3;

    void test();

    private static void sayHello() {
        System.out.println("helloworld");
    }


    default void doSomething() {
        sayHello();
    }
}
