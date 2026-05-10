package com.bank.app.people;

import java.util.ArrayList;
import java.util.Random;

public class BankaPersoneli extends Kisi{
	private String personelID= "ID"+ (new Random().nextInt(90000) + 10000);
	private ArrayList<Musteri> musteriler= new ArrayList<>();
	
	//Getter metod
	public ArrayList<Musteri> getMusteriler(){
		return musteriler;
	}
	
	//Constructor
	public BankaPersoneli(String ad ,String soyad ,String email ,int telefonNumarasi) {
		super(ad,soyad, email, telefonNumarasi);
	}
	
	//Ekran çıktısı
	@Override
	public String toString() {
	    return super.toString() + ", PersonelID: " + personelID+"\n\n";
	}
}
