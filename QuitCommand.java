public class QuitCommand implements Command {
    private Player player;

    /**
     * Quits the program
     */
    public RunCommand() {
        System.exit(0);
    }

    public void execute() {
        System.exit(0);
    }

    public String getName() {
        System.out.println("Quitting");
    }

}
