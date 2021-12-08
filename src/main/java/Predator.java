public abstract class Predator {
    private final String color;
    private final double weight;

    public Predator(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }


    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    abstract String sleeping();

    abstract String huntering();
}
