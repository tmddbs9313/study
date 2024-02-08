package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class school {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("학년과 점수를 입력: ");
        int grade = sc.nextInt();
        int score = sc.nextInt();

        String msg = "잘못 입력하셨습니다.";

        if( score >=60 ) {
            if(grade != 4 ){
                System.out.println("합격");
            }else if (score >=70) {
                System.out.println("합격");
            }else{
                System.out.println("불합격");
            }
        }else {
            System.out.println("불합격");
        }

    }
}
