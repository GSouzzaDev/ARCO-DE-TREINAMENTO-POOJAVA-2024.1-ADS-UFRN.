import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Player player = new Player("Gustavo", "defesa", LocalDate.of(2005, 12, 11), "Brasileiro", 1.78f, 69.8f);
        player.Status();
        player.CalculateAge();
        player.TimeRetire();
    }
}
