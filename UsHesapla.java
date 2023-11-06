package day01;

import java.util.Scanner;

public class UsHesapla {
    public static void main(String[] args) {
        int sayi,n;

        System.out.println("üssünü almak istediğiniz sayıyı giriniz: ");
        Scanner inp = new Scanner(System.in);
        sayi = inp.nextInt();

        System.out.println("kaçıncı dereceden üs almak istediğinizi giriniz: ");
        n = inp.nextInt();

        int i=1;
        int total=1;
        for(;i<=n;i++){
            total*=sayi;
        }

        System.out.println("sonuc: "+total);
    }
}
