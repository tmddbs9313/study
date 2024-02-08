package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwithState() {

        /* 수업목표. switch 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.*/
        /*필기.
        *  [switch 문 표현식]
        *  switch (비교할 변수) {
        *    case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
        *    case 비교값2 : 비교값2와 일치하는 경우 실행할 구문; break;
        *    default : case 에 모두 해당하지않는 경우 실행할 구문; break;
        *  } */

        /*필기.
        *  여러개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은
        *  if-else - if 와 유사하다.
        *  따라서 일부 호환이 가능하다.
        *  하지만, switch 문으로 비교 가능한 값은 정수 , 문자,문자열의 형태이다.
        *  실수와 논리는 비교할 수 없다.
        *  또한 정확하게 일치하는 경우만 비교할수있으며, 대소비교를 할수없다는게 차이점이다.*/

        /*필기.
        *  정수 두개와 연산 기호 문자를 입력받아서
        *  두 숫자의 연산 결과를 출력해보는 간단한 계산기를 만들어보자.
        * */
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("첫번째 정수를 입력해주세요 :");
//        int first = sc.nextInt();
//        System.out.print("두번쨰 정수를 입력해주세요 : ");
//        int second = sc.nextInt();
//        System.out.print("연산 기호 입력 (+,-,*,/,%) : ");
//        char op = sc.next().charAt(0);  //몇번째~~
//
//        /*연산의 결과를 저장할 변수생성*/
//        int result = 0;
//
//        /*입력한 연ㅇ산기호 문자에 연산의 결과가 달라짐*/
//        switch (op) {
//            case '+' :
//                result = first + second;
//                break;
//            case '-' :
//                result = first - second;
//                break;
//            case'*':
//                result = first * second;
//                break;
//            case'/':
//                result = first / second;
//                break;
//            case'%':
//                result = first % second;
//                break;
//        }
//        System.out.println(first +" " + op + " " + second + " " + " = "  + result);


    }
    public void testSwitchVendingMachine() {

        /*수업목표. switch 문 내의 break 문에대해 흐름을 이해하고 적용할 수 있다.*/
        /*필기.
        *  switch 문을 이용해서 문자열 값 비교 및 break에 대한 테스트*/

        /*필기. switch 문을 이용한 간단한 자판기 만들어보기*/
        System.out.println("=====himedia 자판기=====");
        System.out.println("사이다 콜라 포카리 솔의눈 맥콜");
        System.out.print("음료를 선택해주세요 : ");

        Scanner sc = new Scanner(System.in);
        String selectDrink = sc.nextLine();

        /*원하는 음료에 맞는 가격을 저장할 변수*/
        int price = 0;

        switch (selectDrink){

            case "사이다" :
                System.out.println("사이다선탣함");
                price = 1500;
                break;
            case "콜라" :
                System.out.println("콜라선탣ㅋㅋ");
                price = 2000;
                break;
            case "포카리" :
                System.out.println("포카리선택ㅋ");
                price=1800;
                break;
            case "솔의눈":
                System.out.println("솔으ㅣ눈선탣");
                price=800;
                break;
            case "맥콜" :
                System.out.println("맥콜ㄹㄹ선탣");
                price =1300;
                break;
        }
        System.out.println("가격은 " + price + "입니다.");
    }




}
