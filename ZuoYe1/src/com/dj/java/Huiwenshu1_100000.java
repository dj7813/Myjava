package com.dj.java;
public class Huiwenshu1_100000 {
	public static void main(String[] args) {
	for(int num=1;num<=100000;num++) 
		{     
			int sum=0;
			int a=num;
			int k= num;
			while(k!=0) 
			{
				sum=sum*10+k%10;
				k=k/10;
			}
			if(sum==a) 
			{   
				System.out.println(num+"是回文数");
			}
		}
	}
}


