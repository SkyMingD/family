package com.hom;

import java.util.Scanner;

public class Family {
    /*
     * 求你的身高
     *
     */
    public static void main(String[] args) {
        int a = 0;

        //从键盘输入数据
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数据: ");
        System.out.println("版本1");
        System.out.println("版本2");
        System.out.println("创建分支dev");
        System.out.println("主干添加");
        System.out.println("分支添加");
        System.out.println("测试push到github");
        System.out.println("github上编辑");


        //请输入数据
        a = Integer.parseInt(scanner.next());
        switch (a){
            case 0:
                System.out.println("我是0");
                break;
            case 1:
                System.out.println("我是1");
                break;
            default:
                System.out.println("您输入的数不符合规则");
        }



    }
}
