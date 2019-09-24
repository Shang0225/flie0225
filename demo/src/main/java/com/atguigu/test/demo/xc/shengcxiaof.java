package com.atguigu.test.demo.xc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  厨师生产5个商品，
 */
public class shengcxiaof {

    public static void main(String[] args){
        SP sp = new SP();

        new Thread(()->{while (true){ sp.sc();}},"A").start();
        new Thread(()->{while (true){ sp.xf();}},"B").start();

    }

}
class SP{

    private int a=0;

    private Lock lock=new ReentrantLock();
    private Condition condition1=lock.newCondition();
    private Condition condition2=lock.newCondition();

    public void sc(){
        lock.lock();
        try{
            while (a>=10){
                condition1.await();
            }
            a++;
            System.out.println(Thread.currentThread().getName()+"生产了1个商品，现在有："+a+"个商品");
            condition2.signal();

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }
    public synchronized void xf(){
        lock.lock();
        try{
            while (a<=0){
                condition2.await();
            }
            --a;
            System.out.println(Thread.currentThread().getName()+"消费了1个商品，现在有："+a+"个商品");
            condition1.signal();

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

}