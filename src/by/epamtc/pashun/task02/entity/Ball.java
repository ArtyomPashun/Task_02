package by.epamtc.pashun.task02.entity;

public class Ball {

    private final BallColour colour;
    private double weight;

    public Ball(double weight, BallColour colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public BallColour getColour() {
        return colour;
    }

    @Override
    public int hashCode() {

        return  33 * (int) weight + ((colour == null) ? 0 : colour.hashCode());

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        Ball ball = (Ball) obj;
        return weight == ball.weight && ((colour == ball.colour) || (colour != null && colour.equals(ball.getColour())));
    }

    @Override
    public String toString() {
        return getClass().getName() + '@'
                + "colour: " + colour
                + ", weight: " + weight;
    }
}
