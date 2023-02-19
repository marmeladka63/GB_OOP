package Unit;

public class Spearman extends Rogue{
    public Spearman(String name) {
        super(name, 98, 67);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я Копейщик";
    }
}
