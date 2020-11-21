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
