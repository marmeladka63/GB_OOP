package Unit;

public class Monk extends Magician{
    public Monk(String name) {
        super(name,34, 34);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я Монах";
    }
}
