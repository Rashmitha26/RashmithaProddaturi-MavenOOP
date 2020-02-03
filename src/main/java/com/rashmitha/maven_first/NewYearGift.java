package com.rashmitha.maven_first;
import java.util.*;

public class NewYearGift {
	String receiver;
	static int no_chocolates,no_sweets;//no_sweets indicates total number of sweets and no_chocolates indicates total number of chocolates in the gift
    static int totwt;//indicates total weight of gift;
	static Sweets[] sw;
	static NewYearGift[] gift;
	static Chocolates[] ch;
	NewYearGift(int x,int y,String z){
		this.no_sweets=x;
		this.no_chocolates=y;
		this.receiver=z;
		sw=new Sweets[no_sweets];
		ch=new Chocolates[no_chocolates];
	}
	public static int findCount(Chocolates[] ch,int min,int max) {
		int c=0;
		for(int i=0;i<ch.length;i++)
			if(ch[i].price>=min && ch[i].price<=max) c+=ch[i].number;
		return c;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of children who are to be gifted");
		int n=sc.nextInt();
		int price,weight,quan,n1,n2;
		String flavour,receiver;
		sortChocolates sorted;//create an object of sortChocolates class
		gift=new NewYearGift[n];
		if(n>0) {
		 for(int i=0;i<n;i++) {
			System.out.println("Enter the name of the receiver");
			receiver=sc.next();
			System.out.println("Enter the number of sweets types,chocolates types in the gift");
			n1=sc.nextInt();n2=sc.nextInt();
			gift[i]=new NewYearGift(n1,n2,receiver);
			if(gift[i].no_sweets!=0) {
			 System.out.println("Enter price,weight and number of sweets of this type");
			 for(int j=0;j<gift[i].no_sweets;j++) {
				price=sc.nextInt();
				weight=sc.nextInt();
				quan=sc.nextInt();//indicates number of sweets of given type in the gift
				sw[j]=new Sweets(price,weight,quan);
				gift[i].totwt+=weight*quan;
			 }
		    }
			if(gift[i].no_chocolates!=0) {
			 System.out.println("Enter price,weight,number and flavour of chocolates of this type");
			 for(int j=0;j<gift[i].no_chocolates;j++) {
				price=sc.nextInt();
				weight=sc.nextInt();
				quan=sc.nextInt();
				flavour=sc.next();
				ch[j]=new Chocolates(price,weight,quan,flavour);
				gift[i].totwt+=weight*quan;
			 }
			}
			System.out.println("Total weight of gift of "+gift[i].receiver+" is: "+totwt);
			if(gift[i].no_chocolates!=0) {
			 System.out.println("Enter the range of prices to find number of chocolates in the range");
			 int min=sc.nextInt();int max=sc.nextInt();
			 System.out.println("Number of chocolates in gift with price between "+min+" and "+max+" are "+findCount(ch,min,max));
			 System.out.println("Select the basis for sorting chocolates\n 1.Price 2.Weight 3.Quantity");
			 int op=sc.nextInt();
			 Arrays.sort(ch,new sortChocolates(op));
			 System.out.println("After sorting chocolates in a gift according to selected option");
			 for(int j=0;j<no_chocolates;j++) {
				System.out.println(ch[j]);
			 }
			}
		  }
		}
		sc.close();
	}
}



