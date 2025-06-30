package com.leandersonandre.optimization.function;

public class RastriginFunction implements Function {

    @Override
    public double calculate(double[] x) {
        double sum = 10 * x.length;
        for (int i = 0; i < x.length; i++) {
            sum += x[i]*x[i] - 10 * Math.cos(2 * Math.PI * x[i]);
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
        return "Rastrigin";
    }
}

