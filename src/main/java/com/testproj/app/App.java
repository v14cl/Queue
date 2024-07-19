package com.testproj.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String args[]) {
        Queue q1 = new Queue(10, DataType.INT);
        
        q1.put_int(1);
        q1.put_int(2);
        q1.put_int(3);
        q1.put_int(4);
        q1.put_int(7);
        q1.put_int(8);
        q1.put_int(9);
        System.out.println(q1.get_int());
        System.out.println(q1.get_int());
        System.out.println(q1.get_int());
        System.out.println(q1.get_int());
        System.out.println(q1.get_int());
        System.out.println(q1.get_int());
        System.out.println(q1.get_int());
    }
}
