package secondWeek.lesson;

import java.util.Random;

public class SuperHero {
    private String name;
    private int energy;
    private boolean isDead;


    public SuperHero(String name) {
        this.name = name;
        this.energy=20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public void attack(SuperHero rival){
        Random random = new Random();
        int damage = random.nextInt(11);
        rival.check(damage);
        System.out.println(this.getName() + " attacked and " + rival.getName() + " get  " + damage +" damage. ");
    }

    private void check(int damage) {
        if((this.energy-damage)<=0){
            this.energy=0;
            isDead=true;
        }else
            this.energy=this.energy-damage;
    }
}
