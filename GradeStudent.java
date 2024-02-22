import java.util.Locale;
import java.util.Scanner;

public class GradeStudent {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String student;
        double grade1;
        double grade2;
        double grade3;

        System.out.print("Student: ");
        student = sc.nextLine();

        System.out.print("Note 1: ");
        grade1 = sc.nextDouble();

        System.out.print("Note 2: ");
        grade2 = sc.nextDouble();

        System.out.print("Note 3: ");
        grade3 = sc.nextDouble();
        System.out.println();

        double finalGrade = grade1 + grade2 + grade3;

        if (finalGrade >= 60) {
            System.out.print("Student " + student + " (Pass)");
            System.out.println();
            System.out.printf("Final Grade = %.2f %n", (finalGrade));
        } else if (finalGrade < 60.0) {
            double points = 60 - finalGrade;
            System.out.print("Student " + student + " (Failed)");
            System.out.println();
            System.out.printf("Final Grade = %.2f %n", finalGrade);
            System.out.printf("Missing %.2f Points", (points));
        }

        sc.close();
    }
}
