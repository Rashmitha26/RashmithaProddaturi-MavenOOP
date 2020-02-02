package com.rashmitha.maven_first;

public class Chocolates extends Sweets{
	String flavour;
	Chocolates(int price,int wt,int n,String f){
		super(price,wt,n);
		this .flavour=f;
	}

}
