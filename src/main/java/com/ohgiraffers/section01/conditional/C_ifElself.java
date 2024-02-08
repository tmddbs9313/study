package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElself {

    public void testSimpleIfElseIFStatement() {

        /*수업목표. if-eles 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다*/
        /*필기.
        *  [if-else - if 문 표현식]
        *  if (조건식) {
        *    조건식 1 이 true 일때 실행할 명령문;
        *  } else if {
        *    조건식1이 false 이고, 조건식2 가 true 일때 실행할 명령문;
        *  } else {
        *    위의 조건 2개가 모두 거짓인 경우 실행할 명령문;
        *  }
        * */

        /*필기.
        *  if-else-if 문은 조건식 1의 결과 갑이 참(true) 이면 if { } 안에있는 코드 실행.
        *  조건식 1이 fals이면 조건식 2를 확인하여 참(true) 이면 else if { }안에있는 코드를 실행한다.
        *  조건식 1과 조건식2의 결과값이 모두 거짓 (fale) 이면 else { } 안에 있는 코드 실행*/

        //여러개이 조건을 제시하여 그 중 한가지를 반드시 실행시키고 싶은 경우 사용.

        System.out.println("산속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨렸다...");
        System.out.println("나무꾼이 어쩔 줄 몰라하던 그때..");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");

        System.out.print("어느 도끼가 너의 도끼이느냐? (1.금도끼, 2.은도끼, 3.쇠도끼): ");

        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if (answer == 1){
            System.out.println("이런 거짓말쟁이놈아 너에게는 아무런 도끼 줄 수 ㄴㄴ 욕심쟁이야 ;;");
        } else if (answer == 2){
            System.out.println("욕심이 과하지는 않지만 니 이거 아니잖슴 거짓말좀 작작ㅋㅋ;;");
        } else {
            System.out.println("오 정직하군 ㅋ 상으로 내가 금도끼를 주겟당 ㅋㅋ");

        }
        System.out.println("그렇게 산신령은 다시 연못으로 ");

    }

}
