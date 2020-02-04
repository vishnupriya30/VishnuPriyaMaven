package com.Epam.mavenProject;

import java.util.ArrayList;
import java.util.Collections;

public class Gifts {
	public int weight;
	public int cost;
	public static ArrayList<Integer> wgt = new ArrayList<Integer>();
	public int getWeight(){
		int totalWeight = 0;
		for(int i = 0;i < wgt.size(); i++){
			totalWeight += wgt.get(i);
		}
		return totalWeight;
	}
	
}
