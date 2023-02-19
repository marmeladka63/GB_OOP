package Unit;

public class Arbalester extends Shooter{

    public Arbalester(String name) {
        super(name,23, 18);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я арбалетчик";
    }
}
