import java.util.Scanner;

public class GenderEligiableAult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your gender");
        String gender = scanner.next();
        String mGender = "male";
        String fGender = "female";
        if (gender.equals(mGender)) {
            System.out.println("you are male");
            System.out.println("Please insert your age");
            int age = scanner.nextInt();
            System.out.println("age");


            if (age > 18 && age < 47)
                System.out.println("eligiable");

                if (age > 47)
                    System.out.println("not eligable");


            } else if (gender.equals(fGender)) {
                System.out.println("you are female");
            System.out.println("Please insert your age");
                int age2 = scanner.nextInt();
                if (age2 < 18)
                    System.out.println("under age");
                else
                    System.out.println("adult");
            }




    }
}