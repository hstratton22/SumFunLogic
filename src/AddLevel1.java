import java.util.Scanner;

public class AddLevel1 {
    //Random rand = new Random();
    Boolean correct = false;
    Boolean passed_level = false;
    Boolean valid_response = false;
    int currentLevel = 1;

    public AddLevel1() {

    }
    public AddLevel1(int cLevel){
        this.currentLevel= cLevel;
    }

    //https://stackoverflow.com/questions/29323116/how-to-use-the-same-scanner-across-multiple-classes-in-java#:~:text=Simply%20use%20public%20static%20final,arguments%20you%20pass%20to%20Scanner.
    //public static final Scanner input = new Scanner(System.in);//access with MainClassName.input

    //int rand_int1 = rand.nextInt(10);
    //int rand_int2 = rand.nextInt(100);

    //returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0
    //int rand_int3 = (int)(Math.random()*100);
    //int rand_int4 = (int)(Math.random()*10);

    //System.out.println("rand_int1: "+rand_int1);
    //System.out.println("rand_int2: " +rand_int2);
    //System.out.println("rand_int3: "+ rand_int3);
    //System.out.println("rand_int4: "+ rand_int4);
    /*public int curLvl() {
        return 1;
    }
    */

    public void addLevel() {
        Scanner input = new Scanner(System.in);
        while (!passed_level) {
            int count = 0;
            int response = 0;
            for (int i = 0; i < 5; i++) {
                RandNumber num = new RandNumber();
                System.out.print(currentLevel + " + " + num.getRand() + " = ");
                while (!valid_response) {
                    if (input.hasNextInt()) {
                        response = input.nextInt();
                        valid_response = true;
                    } else {
                        input.next();
                        System.out.println("Enter number");
                    }
                }

                if (response == currentLevel + num.getRand()) {
                    correct = true;
                    count++;
                    System.out.println("Correct");
                    valid_response = false;

                } else {
                    System.out.println("Wrong");
                    valid_response = false;
                }
            }

            if (count > 3) {
                System.out.println("Level passed!");
                passed_level = true;
                currentLevel++;
            } else {

                System.out.println("Let's practice more.");

            }
        }
    }
    /**Getters and Setters*/
    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public Boolean getPassed_level() {
        return passed_level;
    }

    public void setPassed_level(Boolean passed_level) {
        this.passed_level = passed_level;
    }

    public Boolean getValid_response() {
        return valid_response;
    }

    public void setValid_response(Boolean valid_response) {
        this.valid_response = valid_response;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }


}
