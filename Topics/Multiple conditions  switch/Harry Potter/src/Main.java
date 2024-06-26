import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String result = "unknown";

        switch (input) {
            case "gryffindor":
                result = "bravery";
                break;
            case "hufflepuff":
                result = "loyalty";
                break;
            case "slytherin":
                result = "cunning";
                break;
            case "ravenclaw":
                result = "intellect";
                break;
            default:
                result = "not a valid house";
                break;
        }
        System.out.println(result);

        scanner.close();
    }
}