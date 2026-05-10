package com.bank.app.accounts;

public class YatirimHesabi extends BankaHesabi{
	private String hesapTuru="yatirim";
	
	//Getter metod
	public String getHesapTuru() {
		return hesapTuru;
	}
	
	//Constructor
	public YatirimHesabi(double bakiye) {
		super(bakiye);
	}
	
	public void paraEkle(double miktar) {
		this.setBakiye(this.getBakiye() + miktar);
	}
	
	public void paraCek(double miktar) {
		if (this.getBakiye()<miktar) {
			System.out.println("Yetersiz bakiye!");
		}
		else {
			this.setBakiye(this.getBakiye() - miktar);
		}
	}
	
	//Ekran çıktısı
	@Override
	public String toString() {
	    return super.toString() + ", Hesap Turu: Yatirim";
	}
}
