package kiosk;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        boolean flag = true;//프로그램 반복 실행 여부를 제어하는 변수
        Scanner sc = new Scanner(System.in);

        //각 메뉴를 문자열로 정의
        String menu1 = "ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거";
        String menu2 = "SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거";
        String menu3 = "Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거";
        String menu4 = "Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거";
        String menu5 = "종료           | 종료";

        //초기 메뉴 화면 출력
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. " + menu1);
        System.out.println("2. " + menu2);
        System.out.println("3. " + menu3);
        System.out.println("4. " + menu4);
        System.out.println("0. " + menu5);

        while (flag) {
            try {
                System.out.println("메뉴를 선택하세요");
                int select = sc.nextInt();// 메뉴 선택
                //사용자가 입력한 번호에 따라 다른 동작 수행
                switch (select) {
                    case 1:
                        System.out.println("ShackBurger를 선택하셨습니다.");
                        break;
                    case 2:
                        System.out.println("SmokeShack를 선택하셨습니다.");
                        break;
                    case 3:
                        System.out.println("Cheeseburger를 선택하셨습니다.");
                        break;
                    case 4:
                        System.out.println("Hamburger를 선택하셨습니다.");
                        break;
                    case 0:
                        flag = false; //반복문 종료
                        break;
                    default://조건에 해당하지 않는 숫자 입력 시
                        System.out.println("잘못 입력했습니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못 입력했습니다.");
                sc.next();//잘못 입력된 값 비우기
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
