package com.dj.java;
import java.util.Scanner;
public class LingXing{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入想要打印的上半部分菱形行数：");
	int a=sc.nextInt();
	for(int i=1;i<=a;i++) //上半部分行数
	{
	  for(int j=1;j<=a-i;j++)	
	  {
		  System.out.print(" ");//打印空格数
	  }
	  for(int k=1;k<=2*i-1;k++) 
	  {
		  System.out.print("*");//打印星星数
	  }
	      System.out.println();//控制换行
	}
	//下半部分
	for(int i=1;i<=a-1;i++) //因为上半部分先多打出一行，下半部分就比上半部分少一行（a-1）
	{
		for(int j=1;j<=i;j++) 
		{
			System.out.print(" ");
		}
		for(int k=1;k<=2*(a-i)-1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
  }
}
