package racingcar;

public class GameExecutor {
    private RacingCarGame game;
    private InputInterface in;
    private OutputInterface out;

    public GameExecutor(RacingCarGame game, InputInterface in, OutputInterface out) {
        this.game= game;
        this.in = in;
        this.out = out;
    }

    public void run() {
        while(!game.isFinished()){
            game.runStage();
            out.printStage(game);
        }
        out.printWinners(game.getWinners());
    }
}
