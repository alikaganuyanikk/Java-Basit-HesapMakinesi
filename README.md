# Hesap Makinesi Projesi

Bu proje, temel matematiksel işlemleri gerçekleştiren bir hesap makinesi uygulamasıdır. Projede iki ana Java sınıfı bulunmaktadır:

- `Calculator`: Matematiksel işlemleri gerçekleştiren sınıf.
- `CalculatorMain`: Kullanıcı etkileşimi ve işlem seçimlerini yöneten ana sınıf.

## İçindekiler

- [Özellikler](#özellikler)
- [Kullanım](#kullanım)
- [Kurulum](#kurulum)


## Özellikler

- Toplama
- Çıkarma
- Çarpma
- Bölme
- Mod Alma
- Karesini Alma
- Faktöriyel Alma

## Kullanım

1. Programı çalıştırdığınızda, size hangi matematiksel işlemi yapmak istediğiniz sorulacaktır.
2. İstediğiniz işlemi seçin ve iki sayıyı girin (bazı işlemler tek sayı gerektirir).
3. Sonuç ekranda gösterilecektir.
4. İşlem yapmak istemiyorsanız `0` tuşlayarak çıkabilirsiniz.

## Kurulum

1. Bu projeyi GitHub'dan klonlayın:
    ```bash
    git clone https://github.com/kullanici_adiniz/hesap-makinesi.git
    ```
2. Proje klasörüne gidin:
    ```bash
    cd hesap-makinesi
    ```
3. Projeyi derleyin ve çalıştırın:
    ```bash
    javac -d bin src/com/calculator/*.java
    java -cp bin com.calculator.CalculatorMain
    ```


