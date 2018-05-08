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
                Character bubba=new Character("Bubba",10,10,10,10,10,10,4);
                System.out.println(bubba);
                Enemy goblin=new Enemy("Goblin",1,1,1,0,0,2,1);
                System.out.println(goblin);
           }
    }