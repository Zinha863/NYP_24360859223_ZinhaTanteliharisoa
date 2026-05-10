package com.bank.app.service;

import com.bank.app.accounts.BankaHesabi;
import com.bank.app.accounts.VadesizHesap;
import com.bank.app.cards.KrediKarti;
import com.bank.app.people.Musteri;

public class BankaService {
	
	//Müşetri oluşturmak
	public Musteri musteriOlustur(String ad ,String soyad ,String email ,long telefonNumarasi) {
		return new Musteri(ad,soyad,email,telefonNumarasi);
	}
	
	//Müşteri adına Hesap açmak
	public void hesapAc(Musteri musteri, String hesapTuru) {
		musteri.hesapEkle(hesapTuru);
	}
	
	//Hesaba Para yatırmak
	public void paraYatir(BankaHesabi hesap, double miktar) {
		hesap.setBakiye(hesap.getBakiye()+miktar);
	}
	
	//Hesaplar arasında para transferi gerçekleştirmek
	public void paraTransferi(VadesizHesap gonderenHesap, BankaHesabi aliciHesap, double miktar) {
		gonderenHesap.paraTransferi(aliciHesap, gonderenHesap, miktar);
	}
	
	//Müşteriye kredi kartı tanımlama
	public void krediKartTanimla(Musteri musteri, double limit) {
		musteri.krediKartEkle(limit);
	}
	
	//Kredi kartı borcu ödeme işlemi yapmak
	public void borcOde(VadesizHesap hesap, KrediKarti kart, double miktar) {
		hesap.krediKartiBorcOdeme(kart, miktar);
	}
	
	//Hesap silmek
	public void hesapSil(Musteri musteri, BankaHesabi hesap) {
		musteri.hesapSil(hesap);
	}
} 
