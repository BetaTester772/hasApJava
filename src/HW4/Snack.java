package HW4;

public class Snack {
    private String name;
    private String flavor;
    private int calories;

    public Snack(String name, String flavor, int calories) {
        this.name = name;
        this.flavor = flavor;
        this.calories = calories;
        System.out.println("Snack Class");
    }

    public String info() {
        return name + " 과자의 " + flavor + " 맛 칼로리는 " + calories;
    }
}
