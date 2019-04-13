package com.myEruekaClient.util;

import java.util.Arrays;

public class RandomaArr {
	private int[] arr= new int[10] ;
	public int[] Array() {
		for(int i = 0; i < 10; i++) {
			int random = (int) (Math.random()*100);
			arr[i] = random;
		}
		//System.out.println(Arrays.toString(arr));
		//随机一个数换成一定是4星礼装
		int change =(int) (Math.random()*10);
		//规定在44到60之间,不包括60
		int four =45 + (int) (Math.random()*6);
		arr[change] = four;
		//随机一个数换成一定是英灵3，4，5星
		int changeservent  = (int) (Math.random()*10);
		//判断礼装和英灵是否字同一个牌位置
		if (change == changeservent) {//如果字同一个位置，英灵卡牌位置加一
			changeservent +=1;
			//判断英灵位置是否超出第10个位置
			if (changeservent>arr.length-1) {
				//如果英灵超过第十个位置，位置减二 
				changeservent-=2;
			}
		}
		//随机数代表英灵的区间，包括3，4，5星
		int minservent = (int) (Math.random()*44);
		//十连时，保底有英灵数组内的随机一个数换成0-44之间的
		arr[changeservent] = minservent;
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	public static void main(String[] args) {
		RandomaArr randomaArr = new RandomaArr();
		int[] a = randomaArr.Array();
		int s = 0;
		int r = 0;
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]<44) {
				s+=1;
				
			}
			if (a[i]>44) {
				r+=1;
				
			}
		}
		System.out.println("英灵数"+s);
		System.out.println("礼装数"+r);
		
	}
}
