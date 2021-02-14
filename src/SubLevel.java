import java.util.Scanner;

public class SubLevel {
    Boolean correct = false;
    Boolean passed_level = false;
    Boolean valid_response = false;
    int currentLevel = 1;
    int currentStage = 1;

    public SubLevel() {

    }
    public SubLevel(int cLevel){
        this.currentLevel= cLevel;

    }
    public void subLevel(){
        Scanner input = new Scanner(System.in);
        while (!passed_level) {
            int count = 0;
            int response = 0;
            for (int i = 0; i < 5; i++) {
                RandNumber num = new RandNumber();
                System.out.print((currentLevel*10) + " - " + num.getRand() + " = ");
                while (!valid_response) {
                    if (input.hasNextInt()) {
                        response = input.nextInt();
                        valid_response = true;
                    } else {
                        input.next();
                        System.out.println("Enter number");
                    }
                }

                if (response == (currentLevel*10) - num.getRand()) {
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
                if (currentLevel <= 5) {
                    currentLevel++;
                } else {
                    currentStage = 2;
                }
            } else {

                System.out.println("Let's practice more.");

            }
        }

    }

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

    public int getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(int currentStage) {
        this.currentStage = currentStage;
    }
}
