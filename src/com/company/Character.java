package com.company;

public class Character
    {
        private String name;
        private int health,strength,dexterity,charisma,intelligence,luck,constitution;

        public Character(String n,int hp, int str,int dex,int chr,int intel,int lck, int con)
            {
                health=hp;
                name=n;
                dexterity=dex;
                strength=str;
                charisma=chr;
                intelligence=intel;
                luck=lck;
                constitution=con;
            }
        public Character(String n)
            {
                name=n;
                strength =0;
                health=0;
                dexterity=0;
                charisma=0;
                intelligence=0;
                luck=0;
                constitution=0;

            }
        public String toString()
            {
                return (name+ ":\nHealth "+health+"\nStrength: "+ strength+ "\nDexterity: "+ dexterity+"\nCharisma: "+charisma+"\nIntelligence: "+intelligence+"\nLuck: "+luck+"\nConstitution: "+constitution);


            }
    }
