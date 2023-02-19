package Unit;

import java.util.Random;

public class Human implements GameInter{

    protected int health;
    protected int attack;
    protected String name;

    public String getName() {

        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }





    public Human(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;


    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return null;
    }



    }
