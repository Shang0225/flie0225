package com.atguigu.test.demo.test;

public class Test {

    //静态的变量s，是公共的
    static int s;
    int i;
    int j;
    {
        //这个变量i与上面的i不一样。
        int i=1;
        i++;
        j++;//1 2
        s++;//1 2
    }
    public void test(int j) {
        j++;
        i++;//1.  2
        s++;//3 4 5
    }
    public static void main(String[] args) {
        //new了对象加载代码块。
        Test obj1=new Test();
        Test obj2=new Test();
        obj1.test(10);
        obj1.test(20);
        obj2.test(30);
        System.out.println(obj1.i+","+obj1.j+","+obj1.s);//2 1 5
        System.out.println(obj2.i+","+obj2.j+","+obj2.s);//1 1 5
    }

}
