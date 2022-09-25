package com.company.Demo2;
//推导Lambda表达式
public class TextLamda {

    //静态内部类
    static class Like2 implements ILike{

        @Override
        public void lambda() {
            System.out.println("i'm study Lambda2! ");
        }
    }
    public static void main(String[] args) {

        ILike like = new Like1();
        like.lambda();
        ILike like1 = new Like2();
        like1.lambda();
        //局部内部类
        class Like3 implements ILike{

            @Override
            public void lambda() {
                System.out.println("i'm study Lambda3! ");
            }
        }
        //ILike like = new Like();
        ILike like3 = new Like3();
        like3.lambda();

        //5.匿名内部类:没有类的名称，必须借助接口或者父类
        ILike like4=new ILike() {
            @Override
            public void lambda() {
                System.out.println("i'm study Lambda4! ");
            }
        };
         like4.lambda();

         //6.用Lambda简化
        like=()-> System.out.println("i'm study Lambda5! ");
        like.lambda();

    }




}
//定义一个函数式接口-->只有一个方法n
interface ILike{
    void lambda();
}

class Like1 implements ILike {

    @Override
    public void lambda() {
        System.out.println("i'm study Lambda! ");
    }
}