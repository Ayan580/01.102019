import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ведите имя: ");
        String name = scanner.nextLine();

        System.out.println(" ведите возраст ");
        int age = scanner.nextInt();
        System.out.println("ведите температур: ");
        int temperature = scanner.nextInt();

        String notExceet = " не выходит гулять ";
        String exceet = "выходит гулять";

        if (age > 0 && age <= 20 && temperature > 0 && temperature < 20){
            System.out.println(name + " " + exceet);
        } else if (age > 20 && age <= 45 && temperature > -20 && temperature < 35) {
            System.out.println((name + " " + exceet));
        } else if (age > 45 && age < 100 && temperature > -10 && temperature < 25) {
            System.out.println(name = " " + exceet);
        } else {
            System.out.println(name + " " + notExceet);
        }


    }
}
