public class Medic extends Hero {

    private double healPoints = 20;

    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(double healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperience() {
        healPoints *= 1.1;


    }


    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HEALING ");

    }
}
