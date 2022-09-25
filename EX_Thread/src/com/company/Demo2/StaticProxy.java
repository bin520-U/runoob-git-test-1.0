package com.company.Demo2;

//代理模式总结
//真实对象和代理对象都要实现同一个接口
//代理对象必须代理真实角色

//好处：代理对象可以做许多真实对象做不了的事情
        //真实对象可以专注做自己的事情
public class StaticProxy extends Thread {

    public static void main(String[] args) {
      /*  Wedding wedding = new Wedding(new You());
        wedding.HappyMarry();*/
      new Wedding(new You()).HappyMarry();
    }
}


interface Marry {
    void HappyMarry();
}

class You implements Marry {

    @Override
    public void HappyMarry() {
        System.out.println("你要结婚了！ ");
    }
}

class Wedding implements Marry {
    private Marry target;

    public Wedding(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();
        after();
    }

    private void after() {
        System.out.println("结婚之后：收尾款");
    }

    private void before() {

        System.out.println("结婚之前：布置婚礼");
    }
}