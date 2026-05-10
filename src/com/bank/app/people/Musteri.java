package com.bank.app.people;
import java.util.ArrayList;
import java.util.Random;

import com.bank.app.accounts.BankaHesabi;
import com.bank.app.accounts.VadesizHesap;
import com.bank.app.accounts.YatirimHesabi;
import com.bank.app.cards.KrediKarti;

public class Musteri extends Kisi {
	private String musteriNumarasi = "A" + (new Random().nextInt(900000) + 100000);
	private ArrayList<BankaHesabi> hesaplar= new ArrayList<>();
	private ArrayList<KrediKarti> krediKartlari= new ArrayList<>();
	
	//Getter metodlar
	public ArrayList<BankaHesabi> getHesaplar(){
		return hesaplar;
	}
	public ArrayList<KrediKarti> getKrediKartlari(){
		return krediKartlari;
	}
	
	//Constructor
	public Musteri(String ad ,String soyad ,String email ,long telefonNumarasi){
		super(ad,soyad, email, telefonNumarasi);
	}
	
	public void hesapEkle(String hesapTuru) {
		if (hesapTuru.equals("vadesiz")) {
			hesaplar.add(new VadesizHesap(0));
		}
		else {
			hesaplar.add(new YatirimHesabi(0));
		}
	}
	
	public void krediKartEkle(double limit) {
		krediKartlari.add(new KrediKarti(limit,0));
	}
	
	public void hesapSil(BankaHesabi hesap) {
		if (hesap.getBakiye()>0) {
			System.out.println("Lütfen öncelikle bakiyenizi başka bir hesaba aktarınız.");
		}
		else {
			hesaplar.remove(hesap);
		}
	}
	
	public void krediKartSil(KrediKarti kart) {
		if (kart.getGuncelBorc()>0) {
			System.out.println("Lütfen öncelikle borç ödemesi yapınız.");
		}
		else {
			krediKartlari.remove(kart);
		}
	}
	
	//Ekran çıktısı
	@Override
    public String toString() {
        return super.toString() + ", MusteriNo: " + musteriNumarasi+"\n";
    }
}
