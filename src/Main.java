import Unit.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> team = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {

            int rn = ran.nextInt(6)+1;
            switch (rn) {
                case 0:
                    team.add(new Arbalester(getName()));
                    break;
                case 1:
                    team.add(new Fermer(getName()));
                    break;
                case 2:
                    team.add(new Monk(getName()));
                    break;
                case 3:
                    team.add(new Bandit(getName()));
                    break;
                case 4:
                    team.add(new Sniper(getName()));
                    break;
                case 5:
                    team.add(new Wizard(getName()));
                    break;
                case 6:
                    team.add(new Spearman(getName()));
                    break;

            }
            System.out.println(team.get(i).getInfo());
        }





    }
    private static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
        return name;
    }



}



