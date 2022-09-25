package com.company.Demo01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TextThread02 implements Runnable{

private  String url;
private  String name;

    public TextThread02(String url, String name) {
        this.url = url;
        this.name = name;
    }


    @Override
    public void run() {
        WeDownLongln longln = new WeDownLongln();
        longln.downlong(url,name);
        System.out.println("下载了文件名："+name);

    }


    public static void main(String[] args) {
        TextThread02 t1 = new TextThread02("https://tse1-mm.cn.bing.net/th/id/OIP-C.QPH1IBosDYBqaU3O6wV3YAHaEo?w=292&h=182&c=7&r=0&o=5&dpr=1.25&pid=1.7","1.jpg");
        TextThread02 t2 = new TextThread02("https://tse1-mm.cn.bing.net/th/id/OIP-C.Russj_ScHRzeGEodKscxEgHaEo?w=300&h=187&c=7&r=0&o=5&dpr=1.25&pid=1.7","2.jpg");
        TextThread02 t3 = new TextThread02("https://tse3-mm.cn.bing.net/th/id/OIP-C.QFdwl07_aviM1ch2KpyyFgHaEo?w=300&h=187&c=7&r=0&o=5&dpr=1.25&pid=1.7","3.jpg");
        TextThread02 t4 = new TextThread02("https://tse1-mm.cn.bing.net/th/id/OIP-C.AodWtPRtJkV1hRJHExvjhAHaEK?w=307&h=180&c=7&r=0&o=5&dpr=1.25&pid=1.7","4.jpg");
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
        new Thread(t4).start();

    }
}



class WeDownLongln{
    public void downlong(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downlong线程出现异常");
        }
    }
}
