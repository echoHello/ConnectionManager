/**
 * Created by Taylor on 1/23/16.
 */
public class App {
    public static void main(String[] args) {
        ConnectionManager poopy = new ConnectionManager();
        System.out.println(poopy.displayConnection().getIpAddress());
    }
}
