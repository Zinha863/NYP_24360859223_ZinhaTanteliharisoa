package com.bank.app.accounts;

import com.bank.app.cards.KrediKarti;

public class VadesizHesap extends BankaHesabi {
	private String hesapTuru="vadesiz";
	
	//Getter metod
	public String getHesapTuru() {
		return hesapTuru;
	}
	
	//Constructor
	public VadesizHesap(double bakiye) {
		super(bakiye);
	}
	
	public void paraTransferi(BankaHesabi aliciHesap, BankaHesabi gonderenHesap, double miktar) {
		gonderenHesap.setBakiye(gonderenHesap.getBakiye() - miktar);
		aliciHesap.setBakiye(aliciHesap.getBakiye() + miktar);
	}
	
	public void krediKartiBorcOdeme(KrediKarti kart, double miktar) {
		this.setBakiye(this.getBakiye() - miktar);
		kart.setGuncelBorc(kart.getGuncelBorc() - miktar);
	}
	
	//Ekran çıktısı
	@Override
	public String toString() {
	    return super.toString() + ", Hesap Turu: Vadesiz";
	}
}

