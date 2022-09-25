package com.company.Demo01;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//练习thread,实现多线程同步下载图片
public class TextThread extends Thread{

    private String url;//网络图片地址
    private String name;// 保存的文件名



    public  TextThread(String url,String name){
        this.url=url;
        this.name=name;
    }

    //下载图片线程的执行体
    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载了文件名为 ："+name);
    }

    public static void main(String[] args) {
        TextThread t1 = new TextThread("https://tse1-mm.cn.bing.net/th/id/OIP-C.QPH1IBosDYBqaU3O6wV3YAHaEo?w=292&h=182&c=7&r=0&o=5&dpr=1.25&pid=1.7","1.jpg");
        TextThread t2 = new TextThread("https://tse1-mm.cn.bing.net/th/id/OIP-C.Russj_ScHRzeGEodKscxEgHaEo?w=300&h=187&c=7&r=0&o=5&dpr=1.25&pid=1.7","2.jpg");
        TextThread t3 = new TextThread("https://tse3-mm.cn.bing.net/th/id/OIP-C.QFdwl07_aviM1ch2KpyyFgHaEo?w=300&h=187&c=7&r=0&o=5&dpr=1.25&pid=1.7","3.jpg");
        TextThread t4 = new TextThread("https://tse1-mm.cn.bing.net/th/id/OIP-C.AodWtPRtJkV1hRJHExvjhAHaEK?w=307&h=180&c=7&r=0&o=5&dpr=1.25&pid=1.7","4.jpg");

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}

//下载器
class WebDownloader {
    //下载方法
    public void downloader (String url,String name)  {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}
