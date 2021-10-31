package by.epamtc.pashun.task02.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Basket {

    private ArrayList<Ball> basketArray;

    private double totalWeight;

    private int colourBalls;

    public Basket() {

        this.basketArray = new ArrayList<>();
    }

    public void addBall(Ball ball) {

        basketArray.add(ball);
        this.totalWeight = totalWeight + ball.getWeight();

    }

    public double receiveBallTotalWeight() {

        return totalWeight;
    }

    public int theNumberOfColourBalls(BallColour colour) {

        for (Ball ball : basketArray) {
            if (ball.getColour() == colour) {
                colourBalls++;
            }
        }
        return colourBalls;
    }

    @Override
    public int hashCode() {

        return (int) totalWeight * 31 + colourBalls + ((basketArray == null) ? 0 : basketArray.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        Basket basket = (Basket) obj;
        return (totalWeight == basket.totalWeight) && (colourBalls == basket.colourBalls)
                && (Objects.equals(basketArray, basket.basketArray));

    }

    @Override
    public String toString() {
        return getClass().getName() + '@'
                + "total weight: " + totalWeight
                + ", colour balls: " + colourBalls;
    }
}
