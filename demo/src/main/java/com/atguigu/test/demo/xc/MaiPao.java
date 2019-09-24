package com.atguigu.test.demo.xc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  三个窗口卖30张票
 *  在高内聚低耦合的前提下：线程 操作 资源类
 */
public class MaiPao {

    public static void main(String[] args) {

        Pao pao = new Pao();

        new Thread(()->{for (int i=1;i<40;i++) pao.maiPiao();}, "A").start();
        new Thread(()->{for (int i=0;i<40;i++) pao.maiPiao();},"B").start();
        new Thread(()->{for (int i=0;i<40;i++) pao.maiPiao();},"C").start();
    }
}

class Pao{

    private int a=30;
    private Lock lock=new ReentrantLock();

    public void maiPiao(){

        lock.lock();
        try{
            if (a>0){
                --a;
                System.out.println(Thread.currentThread().getName()+"卖了:1张票,还剩："+a+"张票");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }

    }
}