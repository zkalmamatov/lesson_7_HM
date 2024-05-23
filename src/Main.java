import java.security.PublicKey;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Hero[] heroes = {new Magic(), new Medic(), new Warrior()};

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
                System.out.println( "Medic HP ups for: " + ((Medic) hero).getHealPoints() + "\n");
            }
        }
    }
}
