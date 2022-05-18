package Java.Workout_Program;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.println("\nWelcome to Workout Program!\n");

        String workOutList = "Move List:\n"
                           + "- Burpee\n"
                           + "- Push Up\n"
                           + "- Sit-Up\n"
                           + "- Squat";
                
        System.out.println(workOutList);

        System.out.println("\n--> Start Creating a Workout Program...\n");

        System.out.print("Burpee rep: ");
        int burpee = scanner.nextInt();
        System.out.print("Push-Up rep: ");
        int pushUp= scanner.nextInt();
        System.out.print("Sit-Up rep: ");
        int sitUp = scanner.nextInt();
        System.out.print("Squat rep: ");
        int squat = scanner.nextInt();
        scanner.nextLine();     //to be safe

        Workout newWorkout = new Workout (burpee, pushUp, sitUp, squat);

        System.out.println("\nYour workout is about to begin...");

        System.out.println("Moves: Burpee, Push-Up, Sit-Up, Squat");

        while (newWorkout.IsItOver() == false) {

            System.out.print("\nWhich workout move you want to do: ");
            String chooseWorkout = scanner.nextLine();

            System.out.print("How many reps: ");
            int chooseReps = scanner.nextInt();
            scanner.nextLine();     //to be safe

            if (chooseReps >= 0) {
                newWorkout.doMove(chooseWorkout, chooseReps);
            }

            else {
                System.out.println("\nThe rep number has to be over than zero...\nTry again.");
            }
            


        }
        System.out.println("\nWorkout completed succesfully, well done!");
        scanner.close();
    }
    
}
