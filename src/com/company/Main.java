package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Bekérem az első oldal értékét
        System.out.println("Kérem az elő oldalt: ");
        Scanner a_side = new Scanner(System.in);
        //Bekérem a második oldal értékét
        System.out.println("Kérem a második oldalt: ");
        Scanner b_side = new Scanner(System.in);
        //elmentem változóba a kapott értékeket
        int b = b_side.nextInt();
        int a = a_side.nextInt();
        //elvégzem a számításokat
        int kerulet = (a+b)*2;
        int area = (a*b);
        //kiíratás
        System.out.println("A téglalap területe: " + area + " cm^2");
        System.out.println("A téglalap kerülete: " + kerulet+ " cm");
    }
}
