package racingcar;

public class Application {
    public static void main(String[] args) {
        GameManager gameManager = GameManager.getInstance();
        gameManager.run();
    }
}
