package com.dj.java;
import java.util.Scanner;
public class SuShu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int n=sc.nextInt();
		int i,r;
		for( i=2;i<n;i++) 
		{
		    r=n%i;
			if(r==0) {
				System.out.println(n+"不是素数");
			break;
			}
		}	
		if(i==n)
		{
			System.out.println(n+"是素数");
		}
	}
	
}
