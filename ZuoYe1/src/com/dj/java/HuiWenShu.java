package com.dj.java;
import java.util.Scanner;
public class HuiWenShu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int sum1=0;
		int num=sc.nextInt();
		int a=num;
		int num1=num;
		while(num!=0) 
		{
			sum=sum*10+num%10;
			num=num/10;
		}
		if(sum==a) 
		{
			/*while(num1!=0)
	        {	
			sum1=sum1+1;
			num1=num1/10;
			}
			if(sum1%2!=0) {*/
			System.out.println("这个数为回文数");
			}
			/*else 
			{
				System.out.println("这个数不是回文数");
			}
			
		}*/
		else 
		{
			System.out.println("这个数不是回文数");
		}
	}
}
		