import java.util.Scanner;

public class MinMaxBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kacSayi=0, enBuyuk=0, enKucuk=0,girilenSayi;

        System.out.print("Kac tane sayi gireceksiniz?: ");
        kacSayi=input.nextInt();

        for(int i=1;i<=kacSayi;i++)
        {
            System.out.print(i+". Sayiyi giriniz: ");
            girilenSayi = input.nextInt();

            if(girilenSayi>enBuyuk)
                enBuyuk=girilenSayi;

            if(girilenSayi<enKucuk)
                enKucuk=girilenSayi;
        }

        System.out.println("En buyuk sayi:"+enBuyuk + ", En Kucuk Sayi:"+enKucuk);

    }
}
