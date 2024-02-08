package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_ifElse {
    public static void main(String[] args) {

        D_ifElse d = new D_ifElse();
        d.test();
    }

    public void test() {

        Scanner sc = new Scanner(System.in);
        System.out.print("1~10사이의 정수를 입력해주세요 : ");
        int num = sc.nextInt();

        if (num > 0 && num < 11) {


            if (num % 2 == 0) {
                System.out.println("입력하신 숫자는 짝수입니다.");
            } else {
                System.out.println("입력하신 숫자는 홀수입니다.");
            }
        }
        System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다. ");
    }
}