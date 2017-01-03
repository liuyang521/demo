package com.sxt.demo;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * 类名: MorraDemo 
 * 备注: 猜拳小游戏
 * 时间: 2017年1月2日 下午5:30:14 
 * 作者:刘阳
 * @version 
 * @since JDK 1.8
 */

public class MorraDemo {
		static String userName =null;
		static int count = 0;
		static String cName = null;
		 static void morra() {
			System.out.print("请输入您想要的对手：1.张飞	2.关羽	3.刘备");
			int computerId = new Scanner(System.in).nextInt();
			
			switch (computerId) {
			case 1:
				System.out.println("你选择了张飞。");
				break;
			case 2:
				System.out.println("你选择了关羽。");
				break;
			case 3:
				System.out.println("你选择了刘备。");
				break;
			}
			System.out.println("开始游戏！");
			System.out.println("请出拳：1.石头   2.剪刀   3.布");
			int u = new Scanner(System.in).nextInt();
			int p = (new Random().nextInt(3) + 1);
			System.out.println("p的值：" + p);
			if (p == 1) {
				if (u == 1) {
					System.out.println("平局");
				} else if (u == 2) {
					count--;
					System.out.println("电脑赢");
				} else if (u == 3) {
					count++;
					System.out.println("电脑输");
				}
			}
			if (p == 2) {
				if (u == 1) {
					count++;
					System.out.println("电脑输");
				} else if (u == 2) {
					System.out.println("平局");
				} else if (u == 3) {
					count--;
					System.out.println("电脑赢");
				}
			}
			if (p == 3) {
				if (u == 1) {
					count--;
					System.out.println("电脑赢");
				} else if (u == 2) {
					count++;
					System.out.println("电脑输");
				} else if (u == 3) {
					System.out.println("平局");
				}
			}
			System.out.println("是否继续游戏？y.是	n.否");
			String goOn = new Scanner(System.in).next();
			switch (goOn) {
			case "y":
				morra();
				break;

			case "n":
				System.out.println("您好"+userName+",您最后得分为："+count);
				break;
			}
		}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎来到猜拳小游戏！");
		System.out.print("请输入用户名：");
		userName = new Scanner(System.in).next();	
			morra();				
			

	}
}

