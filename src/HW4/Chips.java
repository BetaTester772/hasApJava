package HW4;

public class Chips extends Snack {
    private String ingredient;

    public Chips(String name, String flavor, int calories, String ingredient) {
        super(name, flavor, calories);
        this.ingredient = ingredient;
        System.out.println("Chips Class");
    }

    public String info() {
        return ingredient + "로 만든 " + super.info();
    }
}
