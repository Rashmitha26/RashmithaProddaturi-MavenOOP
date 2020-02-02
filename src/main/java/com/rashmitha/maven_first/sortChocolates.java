package com.rashmitha.maven_first;
import java.util.Comparator;

public class sortChocolates implements Comparator<Chocolates> {
	public int compare(Chocolates a,Chocolates b)
	{
		return a.price-b.price;
	}

}
