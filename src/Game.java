import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * copied from Instructor WK3Game example for saving to file
 * and loading from file with gson
 * unknown if this is the correct usage for SumFun
 */
public class Game {
    AddLevel1 theLevel1;

    public Game(AddLevel1 theLevel1){this.theLevel1=theLevel1;}
    public AddLevel1 getTheLevel1(){
        return theLevel1;
    }
    public void saveGame(String filename){
        Gson gson= new Gson();
        String playerData = gson.toJson(theLevel1);
        try(Writer w = new BufferedWriter(new OutputStreamWriter( new FileOutputStream(filename), "UTF-8"))) {
            w.write(playerData);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    static Game loadGame(String filename) {

        String gameData = null;

        // Loading files with a specified encoding is easier than saving them.
        try {
            byte[] encoded = Files.readAllBytes(Paths.get(filename));
            gameData = new String(encoded, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize our player back from the json string to a class instance.
        Gson gson = new Gson();
        AddLevel1 savedPlayer = gson.fromJson(gameData, AddLevel1.class);
        // Create a new game with the player we just deserialized.
        Game newGame = new Game(savedPlayer);
        return newGame;
    }


    }