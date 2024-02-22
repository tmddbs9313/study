package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Question {

    /* 1부터 10까지의 숫자를 출력하는 프로그램 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력해주세요: ");
        int num =sc.nextInt();
        int i;

        for ( i =1; i<11; i++){

            if (i % 2 == 0){
                System.out.println("짝수");
            }else if  (i% 2 == 0){
                System.out.println("홀수");
            }else {
                System.out.println("1~10사이 출력하셍");
            }
            break;
        }
    }

//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//
//        }

        /* 10부터 1까지의 숫자를 역순으로 출력하는 프로그램 */

//        for (int i = 10; i >=1; i--){
//            System.out.println(i);
//        }
        /* 구구단 7단을 출력하는 프로그램 */

//        int i =7;
//
//        for(int j=1; j<=9; j++){
//            System.out.println(i + " * " + j + " = " +(i*j));
//        }

        /* 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램 */
//        for (int i=1; i<=100; i++){
//            System.out.println(i * 2);
//        }

        /* 사용자로부터 입력받은 숫자의 팩토리얼을 계산하는 프로그램
         *   팩토리얼은 6! = 1 * 2 * 3 * 4 * 5 * 6
         * */

//        System.out.print("숫자를 입력해 주세요 : ");
//        int num = sc.nextInt();
//        int mul = 1;
//
//        for(int i = num; i>=1; i--){
//
//            mul *= i;
//            if(i == 1) {
//                System.out.print(i + " = ");
//            }else {
//                System.out.print(i +" x ");
//            }
//
//        }
//        System.out.print(mul);

        /* 0시 0분에서 23시 59분 까지 출력하는 프로그램을 작성해보자 */

//        int si;
//        int bun;
//
//        for (si = 0; si <= 23; si++) {
//            for ( bun = 0; bun <= 59; bun++) {
//                System.out.println(si + " 시 " + bun + " 분 ");
//            }
//        }
//
//        System.out.println();
//    }

//        System.out.println("정수를 입력해주세요: ");
//        int num =sc.nextInt();
//        int i;
//
//        for ( i =1; i>11; i++){
//
//            if (i%2 ==0){
//                System.out.println("짝수");
//            }else if  (i % 2 != 0){
//                System.out.println("홀수");
//            }else {
//                System.out.println("1~10사이 출력하셍");
//            }
//        }

        }


