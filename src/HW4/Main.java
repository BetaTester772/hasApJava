package HW4;

public class Main {
    public static void main(String[] args) {

        Snack s = new Snack("cookie", "chocolate", 139);
        Chips c = new Chips("chips", "salted", 155, "potato");

        System.out.println(s.info());
        System.out.println(c.info());
    }
}
