public class FireCommand implements Command{
    private Player player;

    /**
     * constructor
     * @param player
     */
    public FireCommand(Player player) {
        this.player = player;
    }

    /**
     * Executes command and gets name
     */
    public void execute() {
        player.fire();
    }

    public String getName() {
        return "Players fires";
    }



}
