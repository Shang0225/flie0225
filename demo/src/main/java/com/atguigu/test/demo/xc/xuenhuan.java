package com.atguigu.test.demo.xc;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.time.Clock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  循环打印A->B->C
 *  线程  操作  资源类
 *  判断  干活  通知唤醒下一个线程
 */
public class xuenhuan {

    public static void main(String[] args){

        ABC abc = new ABC();

        new Thread(()->{for (int i=0;i<2;i++) abc.A();},"A").start();
        new Thread(()->{for (int i=0;i<2;i++) abc.B();},"B").start();
        new Thread(()->{for (int i=0;i<2;i++) abc.C();},"C").start();

    }
    
}
class ABC{

    private int a=1;
    private Lock lock=new ReentrantLock();
    private Condition condition1=lock.newCondition();
    private Condition condition2=lock.newCondition();
    private Condition condition3=lock.newCondition();

    public void A(){
        lock.lock();
        try{
            while (a!=1){
                condition1.await();
            }
            for (int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            a=2;
            condition2.signalAll();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }
   public void B(){
        lock.lock();
        try{
            while (a!=2){
                condition2.await();
            }
            for (int i=1;i<=10;i++){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            a=3;
            condition3.signalAll();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
   }
   public void C(){
       lock.lock();
       try{
           while (a!=3){
               condition3.await();
           }
           for (int i=1;i<=15;i++){
               System.out.println(Thread.currentThread().getName()+":"+i);
           }
           a=1;
           condition1.signalAll();
       }catch(Exception e){
           e.printStackTrace();
       }finally{
           lock.unlock();
       }
   }

}