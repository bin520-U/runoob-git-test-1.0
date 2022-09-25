package com.company.Demo01;

//创建线程方式：采用Runnable接口,重写run方法，执行线程需要丢入Runable接口的实现类，调用star
public class TextThread2 implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("我在学习！");
        }

    }


    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        TextThread2 t1 = new TextThread2();
        //创建一个线程对象，通过线程对象来开启我们的线程，代理
        /*Thread thread = new Thread(t1);
        thread.start();
*/
        new Thread(t1).start();
        for (int i = 0; i <1000 ; i++) {
            System.out.println("我在学习java！");
        }
    }
}
