public class JumpCommand implements Command {
    private Player player;

    /**
     * Constrcutor
     * @param player
     */
    public JumpCommand(Player player) {
        this.player = player;
    }

    /**
     * execute command and gets name
     */
    public void execute() {
        player.jump();
    }

    public String getName() {
        return "Player jumps";
    }
}