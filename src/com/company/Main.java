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
        System.out.println("------------------------------");

        //2.
        //Bekérem a deciliter mennyiségét
        System.out.println("Kérem a deciliter mennyiségét: ");
        Scanner amount = new Scanner(System.in);
        //elmentem a mennyiséget változóba
        int deciliter = amount.nextInt();
        //elvégzem az átváltásokat, double -re átkasztolom, hogy megfelelő legyen aaz osztás eredménye
        double liter = (double)deciliter/10;
        double hektoliter = (double)deciliter/100;
        int centiliter = deciliter*10;
        int mililiter = deciliter*100;
        //kiíratás
        System.out.println(deciliter + " dl = " + mililiter + " ml");
        System.out.println(deciliter + " dl = " + centiliter + " cl");
        System.out.println(deciliter + " dl = " + liter+ " l");
        System.out.println(deciliter + " dl = " + hektoliter + " hl");
        System.out.println("------------------------------");

        //3
        //Bekérem a kör sugarát
        System.out.println("Kérem a kör sugarát: ");
        Scanner radius = new Scanner(System.in);
        //double használata a PI értéke miatt
        double newRadius = radius.nextInt();
        //elvégzem a műveletet
        double sphereVolume =4*Math.pow(newRadius,3)*Math.PI/3;
        //kiíratás
        System.out.println("A 3 sugarú gömb térfogata: " + sphereVolume);
        System.out.println("------------------------------");
    }
}
