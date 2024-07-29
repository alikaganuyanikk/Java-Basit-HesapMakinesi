package com.calculator;

public class Calculator {

    public void toplama(int x, int y) {
        int res = x + y;
        System.out.printf("Toplama işlemi sonucu: %d%n", res);
    }

    public void cikartma(int x, int y) {
        int res = x - y;
        System.out.printf("Çıkartma işlemi sonucu: %d%n", res);
    }

    public void carpma(int x, int y) {
        int res = x * y;
        System.out.printf("Çarpma işlemi sonucu: %d%n", res);
    }

    public void bolme(int x, int y) {
        if (y == 0) {
            System.out.println("Hata: Sıfıra bölme hatası.");
        } else {
            double res = (double) x / y;
            System.out.printf("Bölme işlemi sonucu: %.2f%n", res);
        }
    }

    public void modAlma(int x, int y) {
        if (y == 0) {
            System.out.println("Hata: Mod alma hatası, bölen sıfır olamaz.");
        } else {
            int res = x % y;
            System.out.printf("Mod Alma işlemi sonucu: %d%n", res);
        }
    }

    public void karesiniAl(int x) {
        int res = (int) Math.pow(x, 2);
        System.out.printf("Karesini Alma işlemi sonucu: %d%n", res);
    }

    public void faktoriyelAl(int x) {
        if (x < 0) {
            System.out.println("Hata: Negatif sayıların faktöriyeli hesaplanamaz.");
        } else {
            int res = 1;
            for (int i = 1; i <= x; i++) {
                res *= i;
            }
            System.out.printf("Faktöriyel Alma işlemi sonucu: %d%n", res);
        }
    }
}
