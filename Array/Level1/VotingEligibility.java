import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        int[] ages = new int[10]; 
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                ages[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Setting age to -1.");
                ages[i] = -1;
                scanner.next(); 
            }
        }
        System.out.println(); 
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age.");
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
        scanner.close(); 
    }
}
