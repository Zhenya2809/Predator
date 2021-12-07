import java.util.Objects;

public class Cats extends Predator {
    public Cats(String color, double weight, String breed) {
        super(color, weight);
        this.breed = breed;
    }

    private final String breed;

    public String getBreed() {
        return breed;
    }

    public String sleeping() {
        return "сплю";
    }

    public String huntering() {
        return "охочусь!";
    }

    public String tigidick() {
        return "делаю ТЫГЫДик!";
    }

    public String lickingBalls() {
        return "лижу яйца";
    }

    public String whatCatDoing(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY, FRIDAY, WEDNESDAY -> {
                return sleeping();
            }
            case TUESDAY, SATURDAY, THURSDAY -> {
                return huntering();
            }
            case SUNDAY -> {
                return tigidick();
            }
            case default -> {
                return lickingBalls();
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cats cats = (Cats) o;
        return Objects.equals(breed, cats.breed);
    }

    @Override
    public int hashCode() {
        return -43 * Objects.hash(breed);
    }
}
