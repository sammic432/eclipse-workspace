package a10_1;
import java.util.Random;

public class Creature {
	Random rand = new Random();
    
    private int type;               // 0 Human, 1 Cyberdemon, 2 Balrog, 3 elf
    private int strength;           // how much damage this Creature inflicts
    private int hitpoints;          // how much damage this Creature can sustain
        
    public String getSpecies() {
        switch (type) {
            case 0: return "Human";
            case 1: return "Cyberdemon";
            case 2: return "Balrog";
            case 3: return "Elf";
        }
        return "unknown"; 
    }
       
       
    public Creature() {
        strength = 10;
        hitpoints = 10;
        type = 0;
    }
    
    
    public Creature(int newType, int newStrength, int newHitpoints) {
        type = newType;
        strength = newStrength;
        hitpoints = newHitpoints;
    }
    
    
    public int getDamage()  {
        int damage;
    
        // All Creatures inflict damage which is a random number up to their strength
        damage = rand.nextInt(strength) + 1;
        System.out.println(getSpecies() + " attacks for " + damage + " points!");
    
        // Demons can inflict damage of 50 with a 25% chance
        if (type == 2 || type == 1){
            if (rand.nextInt(4) == 0) {
                damage = damage + 50;
                System.out.println("Demonic attack inflicts 50 additional damage points!");
            }
        }
    
        // Elves inflict double magical damage with a 50% chance
        if (type == 3) {
            if (rand.nextInt(2) == 0) {
                System.out.println("Magical attack inflicts " 
                                    + damage + " additional damage points!");
                damage *= 2;
            }
        }
    
        // Balrogs are so fast they get to attack twice
        if (type == 2) {
            int damage2 = rand.nextInt(strength) + 1;
            System.out.println("Balrog speed attack inflicts " + damage2 + " additional damage points!");
            damage += damage2;
        }
    
        return damage;
    }
    
    
    // also include appropriate accessors and mutators
}
