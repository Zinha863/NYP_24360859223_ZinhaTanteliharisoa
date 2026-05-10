package com.bank.app.people;

class Kisi {
	private String ad;
	private String soyad;
	private String email;
	private long telefonNumarasi;
	
	//getter metodlar
	public String getAd() {
		return ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public String getEmail() {
		return email;
	}
	public long getTelefonNumarasi() {
		return telefonNumarasi;
	}
	
	//setter metodlar
	public void setAd(String ad) {
		this.ad=ad;
	}
	public void setSoyad(String soyad) {
		this.soyad=soyad;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setTelefonNumarasi(long telefonNumarasi) {
		this.telefonNumarasi=telefonNumarasi;
	}
	
	//Constructor
	public Kisi(String ad ,String soyad ,String email ,long telefonNumarasi){
		this.ad=ad;
		this.soyad=soyad;
		this.email=email;
		this.telefonNumarasi=telefonNumarasi;
	}
	
	//Ekran çıktısı
	public String toString() {
		return "Ad: "+ad+", soyad: "+soyad+", email: "+email+", telefon numarasi: "+telefonNumarasi;
	}
}
