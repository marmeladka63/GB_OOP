package Unit;

public class Sniper extends Shooter{
    public Sniper(String name) {
        super(name, 60, 23);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я Снайпер";
    }
}
