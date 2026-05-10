package com.bank.app.accounts;

import java.util.Random;

public class BankaHesabi {
	private String iban= "TR"+ (new Random().nextInt(900000)+100000);
	private double bakiye;
	
	//Getter metodlar
	public String getIban() {
		return iban;
	}
	public double getBakiye() {
		return bakiye;
	}
	
	//Setter metodlar
	public void setIban(String iban) {
		this.iban= iban;
	}
	public void setBakiye(double bakiye) {
		this.bakiye= bakiye;
	}
	public BankaHesabi(double bakiye) {
		this.bakiye= bakiye;
	}
	
	//Ekran çıktısı
	public String toString() {
		return "IBAN: " + iban + ", Bakiye: " + bakiye;
	}
}
