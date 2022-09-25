package com.company.Demo01;
//模拟龟兔赛跑
public class Race implements Runnable {
    //胜利者
    private static String winner;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            //判断比赛是否结束
            //模拟兔子休息
            if (Thread.currentThread().getName().equals("兔子")&&i%10==0){
                try {
                    Thread.sleep(2);//兔子每跑十步休息2毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (gameOver(i)) {
                break;
            }
                System.out.println(Thread.currentThread().getName() + " ----> 跑了" + i + "步");
        }
    }
    //判断比赛是否完成
    private boolean gameOver(int steps){
        //判断是否有胜利者
        if (winner!=null){//已经存在胜利者
            return true;
        }{
            if (steps>=100){
                winner=Thread.currentThread().getName();
                System.out.println("winner is :"+winner);
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race,"乌龟").start();
        new Thread(race,"兔子").start();
    }
}
