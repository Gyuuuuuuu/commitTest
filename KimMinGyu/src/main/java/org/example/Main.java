package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarRacer cr = new CarRacer();

        System.out.println("1. 시동걸기");
        System.out.println("2. 전진");
        System.out.println("3. 감속");
        System.out.println("4. 브레이크");
        System.out.println("5. 시동끄기");
        System.out.println("6. 현재속력");
        System.out.println("0. 프로그램 끝내기");

        while (true) {
            int option = sc.nextInt();

            switch (option) {
                case 1: cr.startEngine(); break;
                case 2: cr.accel(); break;
                case 3: cr.decel(); break;
                case 4: cr.stop(); break;
                case 5: cr.stopEngine(); break;
                case 6: cr.showSpeed(); break;
                case 0: System.out.println("프로그램 종료"); break;
                default:
                    System.out.println("알맞은 번호만 입력."); break;
            }
            if(option==0) break;
        }
    }
}
