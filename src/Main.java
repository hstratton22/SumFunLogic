import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Boolean correct;

        int rand_int1 = rand.nextInt(10);
        int rand_int2 = rand.nextInt(100);

        //returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0
        int rand_int3 = (int)(Math.random()*100);
        int rand_int4 = (int)(Math.random()*10);

        //System.out.println("rand_int1: "+rand_int1);

        //System.out.println("rand_int2: " +rand_int2);
        //System.out.println("rand_int3: "+ rand_int3);
        //System.out.println("rand_int4: "+ rand_int4);

        Scanner input = new Scanner(System.in);
        int count = 0;
        for(int i=0; i<5; i++) {
            RandNumber num = new RandNumber();
            System.out.print("1 + " + num.getRand() + " = ");
            int response = input.nextInt();
            if (response == 1 + num.getRand()) {
                correct = true;
                count++;
                System.out.println("Correct");

            } else {
                System.out.println("Wrong");
            }
        }
        if(count>3){
            System.out.println("Level passed!");
        }




    }
}
