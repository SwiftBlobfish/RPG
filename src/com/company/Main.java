package com.company;

public class Main
    {
        public static void main(String [] args)
           {
               Weapon sword= new Weapon("Sword",10);
               System.out.println(sword);
               Weapon spear = new Weapon("Spear",5);
               System.out.println(spear);
               System.out.println(spear.getDmg());

           }
    }