package com.company.Demo3;

import java.text.SimpleDateFormat;
import java.util.Date;

//模拟倒计时
public class TextSleep  {
    public static void main(String[] args) {
      /*  tenDown();*/

        //打印当前时间
        /*Date date = new Date();*/

        java.util.Date day=new Date();

        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(sdf.format(day));
    }





//模拟倒计时
    public static void tenDown(){
        int num=10;
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println(num--);
                if (num<=0){
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
