package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class score {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. : ");
        int score = sc.nextInt();
        if (score>=0 && score <=100)

            switch (score/10){
                case 10 :
                case 9 :
                    System.out.println("수");
                    break;
                case 8  :
                    System.out.println("우");
                    break;
                case 7 :
                    System.out.println("미");
                    break;
                case 6 :
                    System.out.println("양");
                    break;
                case 5 :
                case 4 :
                case 3:
                case 2 :
                case 1 :
                    System.out.println("가");
                    break;
              }
          }
        }
