package com.company;

public class Enemy
    {
        private String name;
        private int hp,strength,dexterity,charisma,intelligence,luck,constitution;

        public Enemy(String n,int h,int str,int dex,int chr,int intel,int lck, int con)
            {
                name=n;
                hp=h;
                strength=str;
                dexterity=dex;
                charisma=chr;
                intelligence=intel;
                luck=lck;
                constitution=con;

            }

        public String toString()
            {

                return (name+ ":\nHealth "+hp+"\nStrength: "+ strength+ "\nDexterity: "+ dexterity+"\nCharisma: "+charisma+"\nIntelligence: "+intelligence+"\nLuck: "+luck+"\nConstitution: "+constitution);

            }
    }
