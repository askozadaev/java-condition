
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println((a > b) ? "True" : "False");

        int grade = 50;
        switch (grade) {
            case 5:
                System.out.println("Best");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Norm");
                break;
            case 2:
                System.out.println("Bad");
                break;
            default:
                System.out.println("out of range");
        }

    }
}
