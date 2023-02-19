package Unit;

public class Bandit extends Rogue{

    public Bandit(String name) {

        super(name, 67, 78);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я Разбойник";
    }
}
