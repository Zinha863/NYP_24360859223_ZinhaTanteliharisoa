package com.bank.app.main;

import com.bank.app.accounts.VadesizHesap;
import com.bank.app.cards.KrediKarti;
import com.bank.app.people.BankaPersoneli;
import com.bank.app.people.Musteri;
import com.bank.app.service.BankaService;

public class Test {

	public static void main(String[] args) {
		BankaService bankaService=new BankaService();
		
		//Müşteri oluşturmak
		System.out.println("=== Musteri Olusturuluyor ===");
		Musteri musteri=bankaService.musteriOlustur("Zinha", "Tanteliharisoa", "zinhaantsaharisoa@gmail.com", 05055357147L);
		System.out.println(musteri);
		
		// Banka personeli olusturmak
		System.out.println("=== Banka Personeli Olusturuluyor ===");
		BankaPersoneli personel = new BankaPersoneli("Ahmet", "Kaya", "ahmet@btu.edu.tr", 5551234);
		System.out.println(personel);

		// Personelin musterisini eklemek
		personel.getMusteriler().add(musteri);
		
		
		//Hesap açmak
		System.out.println("=== Hesap Aciliyor ===\n");
		bankaService.hesapAc(musteri, "vadesiz");
		
		//Hesaba para yatırmak
		System.out.println("=== Para Yatiriliyor ===");
		VadesizHesap hesap=(VadesizHesap) musteri.getHesaplar().get(0);
		bankaService.paraYatir(hesap, 1000); 
		System.out.println(hesap);
		
		//Para transferi
		System.out.println("\n=== Para transferi yapılıyor ===");
		bankaService.hesapAc(musteri, "vadesiz");
		VadesizHesap hesap2=(VadesizHesap) musteri.getHesaplar().get(1);
		bankaService.paraTransferi(hesap, hesap2, 500);
		System.out.println("=== Gönderen hesap ===");
		System.out.println(hesap);
		System.out.println("=== Alan hesap ===");
		System.out.println(hesap2);
		
		//Kredi kart tanımlamak
		System.out.println("\n=== Kredi Kart Tamamlanıyor ===");
		bankaService.krediKartTanimla(musteri, 10000);
		KrediKarti kart=musteri.getKrediKartlari().get(0);
		System.out.println(kart);//// Ödeme öncesi kart bilgileri
		
		//Borc ödemek
		System.out.println("\n=== Borç ödeniyor ===");
		kart.setGuncelBorc(500);
		bankaService.borcOde(hesap, kart, 100);
		System.out.println(kart);// Ödeme sonrası kart bilgileri
		
		//Hesap silmek
		System.out.println("\n=== Hesap siliniyor ===");
		bankaService.hesapSil(musteri, hesap2);
		
	}

}
