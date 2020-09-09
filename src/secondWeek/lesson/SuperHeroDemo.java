package secondWeek.lesson;

import java.util.Random;

public class SuperHeroDemo {
    public static void main(String[] args) {
        Player1 player1 = new Player1("Dr Doom");
        Player2 player2 = new Player2("Venom");
        System.out.println("Game starts");

        while(!player1.isDead() && !player2.isDead()){
            Random first = new Random();

            int firstAttacker = first.nextInt(1)+1;
            if(firstAttacker==1)
                player1.attack(player2);
            if (player2.isDead()){
                System.out.println(player2.getName() +" died");
                break;
            }




            else
                player2.attack(player1);
            if (player1.isDead()){
                System.out.println(player1.getName() +" died");
                break;
            }
            System.out.println(player1.getName() +" : " + player1.getEnergy());
            System.out.println(player2.getName() +" : " +player2.getEnergy());
        }

    }
}
