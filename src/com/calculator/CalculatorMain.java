package com.calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        while (true) {
            System.out.println("Hesap Makinesine Hoşgeldiniz!..");
            System.out.println("********************************");
            System.out.println("Hangi İşlemi Yaptırmak İstersiniz ?");
            System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Mod Alma\n6-Karesini Alma\n7-Faktöriyel Alma\n0-Çıkış");

            int i = sc.nextInt();

            if (i == 0) {
                System.out.println("Çıkılıyor...");
                break;
            }

            System.out.println("İşlem yapmak istediğiniz sayıları giriniz.");
            int sayi1 = sc.nextInt();
            int sayi2 = sc.nextInt();
            System.out.println("********************************");

            switch (i) {
                case 1:
                    cal.toplama(sayi1, sayi2);
                    break;
                case 2:
                    cal.cikartma(sayi1, sayi2);
                    break;
                case 3:
                    cal.carpma(sayi1, sayi2);
                    break;
                case 4:
                    cal.bolme(sayi1, sayi2);
                    break;
                case 5:
                    cal.modAlma(sayi1, sayi2);
                    break;
                case 6:
                    cal.karesiniAl(sayi1);
                    break;
                case 7:
                    cal.faktoriyelAl(sayi1);
                    break;
                default:
                    System.out.println("Geçersiz İşlem!..");
                    break;
            }
        }
        sc.close();
    }
}

