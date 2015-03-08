import java.util.Random;
import java.util.Scanner;


public class KninciElamanBulma {
	

	public static void main(String[] args) {
		int uzunluk = 0;
		System.out.println("Dizinin uzunluğunu giriniz :");
		Scanner girilenSayi = new Scanner(System.in);     // Dizinin uzunlugunu kullanıcıdan alıyoruz
        uzunluk= girilenSayi.nextInt();    // Alınan uzunluk değişkene aktırılıyor
		int dizi[] = new int[uzunluk];    // Dizinin boyutunu kullanıcının istediği boyuta göre tanımlıyoruz
		for (int i = 0; i < dizi.length; i++) {    // Dizinin uzunluğu kadar kullanıcıdan eleman girmesini sağlıyoruz
			System.out.println((i+1)+". elamanı giriniz");
			Scanner sayilar = new Scanner(System.in);
			dizi[i]= sayilar.nextInt();
		}
		for (int i = 0; i < dizi.length; i++) {    // Kullanıcının girmiş olduğu diziyi yazdırıyoruz
			System.out.print(dizi[i]+"-");
		}
		System.out.println(" ");
		elemanBul(dizi);    //Dizinin k. elemanını bulması için "elemanBul" metodunu çağırıyoruz
		

	}
	public static void elemanBul(int dizi[]){
		int kacinciEleman = 0;
		System.out.println("Girdiğiniz dizinin kaçıncı elamanını bulmak istiyorsunuz :");
		Scanner grlenSayi = new Scanner(System.in);    // Aranan eleman indexini kullanıcıdan alıyoruz
        kacinciEleman= grlenSayi.nextInt();
        System.out.println("İstenilen indexteki sayı :"+ dizi[kacinciEleman-1] );    // Ekrana istenilen indexin değerini yazdırıyoruz
	}
	 

}
