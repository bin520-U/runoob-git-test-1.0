package com.company.Demo01;

//创建线程方式1：继承Thread类，重写run方法，调用star开启线程

/*
* 总结：注意，线程不一定立即执行由CPU调度执行
 */

public class Text_Thread1  extends Thread{
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i <200 ; i++) {
            System.out.println("我在看代码+++"+i);
        }
    }

    public static void main(String[] args) {
        //主线程
        //创建一个线程对象
        Text_Thread1 thread1 = new Text_Thread1();
        //调用start（)方法开启线程
        thread1.start();
        //thread1.run();
        for (int i=0;i<1000;i++) {
            System.out.println("我在学习+++"+i);
        }
    }
}
