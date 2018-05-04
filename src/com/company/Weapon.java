package com.company;

public class Weapon
   {
      private String name;
      private int damage;
      
      public Weapon(String n, int dmg)
         {
            name = n;
            damage= dmg;
            
         }
         public String toString()
         {
         
            return name+ " with damage "+ damage;
         }
      
      
   }
