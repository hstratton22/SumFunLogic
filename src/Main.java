
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's begin.");
        //for(int i = 0; i <5; i++ ){
        AddLevel1 level = new AddLevel1();

        int startingLvl = level.getCurrentLevel();
        level.addLevel();
        int nextLvlAdd = level.getCurrentLevel();
        System.out.println("new level: "+ level.getCurrentLevel());
        AddLevel1 level2 = new AddLevel1(nextLvlAdd);
        level2.addLevel();

        SubLevel sLevel =  new SubLevel();
        sLevel.subLevel();
        int nextLvlSub = sLevel.getCurrentLevel();
        System.out.println("new level: " + sLevel.getCurrentLevel());
        SubLevel sLevel2 = new SubLevel(nextLvlSub);
        sLevel2.subLevel();
    //}

    }

}
