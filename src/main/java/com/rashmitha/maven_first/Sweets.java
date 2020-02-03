package com.rashmitha.maven_first;

public class Sweets {
    int price,wt,number;
	Sweets(int p,int c,int n){
		this.price=p;
		this.wt=c;
		this.number=n;
	}
	public String toString() {
		return "Price: "+this.price+" Weight: "+this.wt+" Quantity: "+this.number;
	}
}
