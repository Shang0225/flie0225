package com.atguigu.test.demo.dome;

import java.util.ArrayList;

public class list {

    public static void main(String[] args){

        ArrayList list =new ArrayList();

        list.add("java");
        list.add("aaa");
        list.add("java");
        list.add("java");
        list.add("bbb");

        for (int i=list.size()-1;i>=0;i--){
            if ("java".equals(list.get(i))){
                list.remove(i);
            }
        }
        for (Object o : list) {
            System.out.println(o);
        }
    }

}
class A extends Thread implements Runnable{

    public static void main(String[] args){
        Thread thread = new Thread(){
            public void run(){
                pong();
            }
        };
        thread.run();
        System.out.println("jgsj");

    }
    static void pong(){
        System.out.println("ojghue");
    }
}
