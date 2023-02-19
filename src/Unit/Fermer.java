package Unit;

public class Fermer extends Human {
    int food;
    int ammunition;

    public Fermer(String name) {
        super(name, 34, 56);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я крестьянин";
    }
}
