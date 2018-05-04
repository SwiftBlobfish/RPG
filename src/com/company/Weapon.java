package com.company;

public class Weapon
   {
      private String name;
      private int damage, range;
      
      public Weapon(String n, int dmg, int rng)
         {
            name=n;
            damage=dmg;
            range=rng;
            
         }
      public Weapon(String n, int dmg)
         {
            name = n;
            damage= dmg;
            range=5;
            
         }
         public String getDmg()
            {
               return ("The damage is "+ damage);
            }
            
         public String toString()
         {
         
            return name+ " with damage "+ damage;
         }
      
      
   }
