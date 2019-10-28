public class RunCommand implements Command {
    private Player player;

    /**
     * Constructor
     * @param player
     */
    public RunCommand(Player player) {
        this.player= player;
    }

    /**
     * Executes and gets name
     */
    public void execute() {
        player.runForward();
    }

    public String getName() {
        return "Player runs forward";
    }
}
