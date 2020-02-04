package com.Epam.mavenProject;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Chocolates c1 = new Chocolates(10,5,"DairyMilk");
        Chocolates c2 = new Chocolates(15,15,"BarOne");
        Chocolates c3 = new Chocolates(5,4,"Munch");
        Chocolates c4 = new Chocolates(20,25,"Perk");
        Sweets s1 = new Sweets(50,40);
        Sweets s2 = new Sweets(70,100);
        Sweets s3 = new Sweets(40,30);
        Sweets s4 = new Sweets(30,20);
        Gifts g = new Gifts();
        System.out.println("Total Weight:"+ g.getWeight());
        System.out.println("Sorting Chocolates based on price: ");
        Chocolates c = new Chocolates();
        c.sortChocolates();
        c.getChocolatesInRange(3, 15);
    }
}
