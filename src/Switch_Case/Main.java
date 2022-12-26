package Switch_Case;

public class Main {
    public static void main(String[] args) {
        int weekday = 3;

        switch (weekday)
        {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Friday");
                break;

            default:
                System.out.println("Try again");
        }
    }
}
