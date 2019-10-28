import java.util.HashMap;

public class InputHandler {

    /**
     * Tried to create a hashmap
     */
    private HashMap<String,Command> commands  = new HashMap<>();

    /**
     * Created the input handler to hold the commands
     * @param player
     */
    public InputHandler(Player player) {
        commands.put("jump", JumpCommand);
        commands.put("run", RunCommand);
        commands.put("fire", FireCommand);
        commands.put("quit", QuitCommand);
    }

    /**
     * Tried to match the string to the hashmap commands
     * I've never used a hashmap before
     * @param button
     */
    public void buttonPressed(String button) {
        if(button == "jump") {
            //Execute Jump Command
        }
        if(button == "run") {
            //Execute run Command
        }
        if(button == "fire") {
            //Execute fire Command
        }
        if(button == "quit") {
            //Execute quit Command
        }
    }

}
