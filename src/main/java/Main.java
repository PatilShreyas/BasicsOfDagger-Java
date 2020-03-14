import di.DaggerLifeComponent;
import life.Life;

/**
 * Main class uses Dagger DI to use Life class.
 */
public class Main {
    public static void main(String[] args) {
        Life life = DaggerLifeComponent.create().getLife();
        life.enjoy();
    }
}
