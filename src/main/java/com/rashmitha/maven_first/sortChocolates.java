package com.rashmitha.maven_first;
import java.util.Comparator;

public class sortChocolates implements Comparator<Chocolates> {
	int op;
	sortChocolates(int n){
		this.op=n;
	}
	public int compare(Chocolates a,Chocolates b)
	{
		switch(op) {
		case 1:return a.price-b.price;
		case 2:return a.wt-b.wt;
		case 3:return a.number-b.number;
		
		}
		return 0;
	}

}
