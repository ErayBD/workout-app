package Java.Workout_Program;

public class Workout {
    
    private int burpeeCount;
    private int pushUpCount;
    private int sitUpCount;
    private int squatCount;

    public Workout (int burpeeCount, int pushUpCount, int sitUpCount, int squatCount) {
        this.burpeeCount = burpeeCount;
        this.pushUpCount = pushUpCount;
        this.sitUpCount = sitUpCount;
        this.squatCount = squatCount;
    }



    public int getBurpeeCount() {
        return burpeeCount;
    }

    public void setBurpeeCount (int burpeeCount) {
        this.burpeeCount = burpeeCount;
    }



    public int getPushUpCount() {
        return pushUpCount;
    }

    public void setPushUpCount (int pushUpCount) {
        this.pushUpCount = pushUpCount;
    }



    public int getSitUpCount() {
        return sitUpCount;
    }

    public void setSitUpCount (int sitUpCount) {
        this.sitUpCount = sitUpCount;
    }



    public int getSquatCount() {
        return squatCount;
    }

    public void setSquatCount (int squatCount) {
        this.squatCount = squatCount;
    }


    
    public void doMove (String moveType, int count) {

        if (moveType.equals("Burpee")) {
            doBurpee(count);
        }

        else if (moveType.equals("Push-Up")) {
            doPushUp(count);
        }

        else if (moveType.equals("Sit-Up")) {
            doSitUp(count);
        }

        else if (moveType.equals("Squat")) {
            doSquat(count);
        }

        else {
            System.out.println("\nInvalid move selected...\nTry again.");
        }
    }



    public void doBurpee (int count) {

        if (burpeeCount < count) {
            burpeeCount = 0;
            System.out.println("Remaninig Burpee's: " + burpeeCount);
            System.out.println("Well done! You have passed your Burpe goal!");
        }

        else {
            burpeeCount = burpeeCount - count;
            System.out.println("\nRemaninig Burpee's: " + burpeeCount);
        }

        if (burpeeCount == 0) {
            
            System.out.println("No left Burpee to do...");
        }
    }



    public void doPushUp (int count) {

        if (pushUpCount < count) {
            pushUpCount = 0;
            System.out.println("\nRemaninig Push-Up's: " + pushUpCount);
            System.out.println("Well done! You have passed your Push-Up goal!");
        }

        else {
            pushUpCount = pushUpCount - count;
            System.out.println("Remaninig Push-Up's: " + pushUpCount);
        }

        if (pushUpCount== 0) {
            System.out.println("No left Push-Up to do...");
        }
    }

    

    public void doSitUp (int count) {

        if (sitUpCount < count) {
            sitUpCount = 0;
            System.out.println("\nRemaninig Sit-Up's: " + sitUpCount);
            System.out.println("Well done! You have passed your Sit-Up goal!");
        }

        else {
            sitUpCount = sitUpCount - count;
            System.out.println("Remaninig Sit-Up's: " + sitUpCount);
        }

        if (sitUpCount == 0) {
            System.out.println("No left Sit-Up to do...");
        }
    }

    public void doSquat (int count) {

        if (squatCount < count) {
            squatCount = 0;
            System.out.println("\nRemaninig Squat's: " + squatCount);
            System.out.println("Well done! You have passed your Squat goal!");
        }

        else {
            squatCount = squatCount - count;
            System.out.println("Remaninig Squat's: " + squatCount);
        }

        if (squatCount == 0) {
            System.out.println("No left Squat to do...");
        }
    }

    public boolean IsItOver() {
        return (burpeeCount == 0) && (pushUpCount == 0) && (squatCount == 0) && (sitUpCount == 0);
    }

}
