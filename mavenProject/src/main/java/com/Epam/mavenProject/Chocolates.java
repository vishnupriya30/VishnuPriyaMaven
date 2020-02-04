package com.Epam.mavenProject;

import java.util.TreeMap;

public class Chocolates extends Gifts {
	String name;
	public static TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
	public Chocolates(int w,int p,String n){
		weight = w;
		cost = p;
		name = n;
		wgt.add(w);
		if(!tm.containsKey(p)){
			tm.put(p,n);
		}
		else
			tm.put(p,tm.get(p));
		//System.out.println(wgt.size());
	}
	public Chocolates() {
		// TODO Auto-generated constructor stub
	}
	public void sortChocolates(){
		for(int i:tm.keySet()){
			System.out.println(tm.get(i)+" "+i);
		}
	}
	public void getChocolatesInRange(int low,int high){
		System.out.println("Candies in range Rs"+low+" Rs"+high);
		for(int i:tm.keySet()){
			if(i >= low && i <= high){
				System.out.print(tm.get(i)+"--");
			}
		}
		System.out.print("\n");
	}
}
