package com.leandersonandre.optimization.function;

public class SphereFunction implements Function {

    @Override
    public double calculate(double[] x) {
        double sum = 0;
        for (double xi : x) {
            sum += xi * xi;
        }
        return sum;
    }

    @Override
    public double getLowerBound() {
        return -5.12;
    }

    @Override
    public double getUpperBound() {
        return 5.12;
    }

    @Override
    public String getName() {
        return "Sphere";
    }
}
