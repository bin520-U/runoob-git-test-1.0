package com.company.Demo2;
//Lambda表达式
public class TextLambda2 {

    public static void main(String[] args) {

        IStudy study=a-> {
            System.out.println("study-->"+a);
            System.out.println("study too");
        };
        study.stady(10);
    }


    //总结：Lambda表达式当方法体里面只有一行代码时才能简化成一行。否则就需要代码块报货（花括弧包裹）
    //必须是函数式接口（里面只有一个方法）
    //多个参数也可以省略参数类型,必须要加上括号

}

interface IStudy{
    void stady(int a);
}
