package Unit;

public class Wizard extends Magician{
    @Override
    public String getInfo() {
        return "� ������";
    }

    public Wizard(String name) {
        super(name, 45, 90);
        super.name = name;
    }

}
