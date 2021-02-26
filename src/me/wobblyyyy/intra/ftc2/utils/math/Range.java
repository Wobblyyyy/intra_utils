package me.wobblyyyy.intra.ftc2.utils.math;

public class Range {
    private double min;
    private double max;

    public Range(double min,
                 double max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public boolean inRange(double number) {
        return min <= number && number <= max;
    }

    public boolean outsideRange(double number) {
        return !inRange(number);
    }
}
