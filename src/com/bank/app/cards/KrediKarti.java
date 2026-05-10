package com.bank.app.cards;

import java.util.Random;

public class KrediKarti {
	private String kartNumarasi= String.valueOf(new Random().nextInt(900000)+ 100000);
	private double limit;
	private double guncelBorc;
	private double kullanilabilirLimit;
	
	//Getter metodlar
	public String getKartNumarasi(){
		return kartNumarasi;
	}
	public double getLimit() {
		return limit;
	}
	public double getGuncelBorc() {
		return guncelBorc;
	}
	public double getKullanilabilirLimit() {
		return kullanilabilirLimit;
	}
	
	//Setter metodlar
	public void setLimit(double limit) {
		this.limit=limit;
	}
	public void setGuncelBorc(double guncelBorc) {
		this.guncelBorc= guncelBorc;
	}
	public void setKullanilabilirLimit(double kullanilabilirLimit) {
		this.kullanilabilirLimit= kullanilabilirLimit;
	}
	
	//Constructor
	public KrediKarti(double limit, double guncelBorc) {
		this.limit= limit;
		this.guncelBorc= guncelBorc;
	}
	
	//Ekran çıktısı
	@Override
	public String toString() {
	    return "Kart Numarasi: " + kartNumarasi + ", Limit: " + limit + ", Guncel Borc: " + guncelBorc + ", Kullanilabilir Limit: " + (limit - guncelBorc)+"\n";
	}
}
