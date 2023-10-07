package HW3;


public class Main {
    public static void main(String[] args) {
        int[] years = {2022, 2023, 2024};
        int[] month = {9, 10, 11};
        int[] day = {30, 31, 30};
        Date[] dates = new Date[3];

        // for loop
        for (int i = 0; i < dates.length; i++) {
            dates[i] = new Date(years[i], month[i], day[i]);
        }

        // for loop - printDate
        for (int i = 0; i < dates.length; i++) {
            System.out.println(dates[i].printDate());
        }

        // enhanced-for loop
        for (Date date : dates) {
            System.out.println(date.printDate());
        }
    }
}