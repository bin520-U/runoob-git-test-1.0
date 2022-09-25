package com.company.Demo01;

//多个线程同时操作同一个对象
//买火车票
//发现问题：多个线程操作同一个资源的情况下，线程不安全，数据紊乱
public class TextThread_Runnable01 implements Runnable{
//票数
    private int ticketnums=10;
    private String name;


    @Override
    public void run() {
        while (true){
            if (ticketnums<=0) {
                break;
            }
            try {//模拟演示
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->拿到了弟"+(ticketnums--)+"张票");
        }
    }

    public static void main(String[] args) {
        TextThread_Runnable01 t1 = new TextThread_Runnable01();
        new Thread(t1,"张三").start();
        new Thread(t1,"李四").start();
        new Thread(t1,"王五").start();

    }
}
