package com.leandersonandre.optimization;

import com.leandersonandre.optimization.function.Function;
import com.leandersonandre.optimization.function.FunctionFactory;
import com.leandersonandre.optimization.sa.SimulatedAnnealing;
import com.leandersonandre.optimization.sa.operator.GaussianOperator;

public class Main {
    public static void main(String[] args) {
        // Escolha qual função usar
        Function function = FunctionFactory.getInstance().getFunction("RASTRIGIN");
        // Function function = FunctionFactory.getInstance().getFunction("SPHERE");
        // Function function = FunctionFactory.getInstance().getFunction("BUKIN6");

        // Criação do algoritmo
        SimulatedAnnealing sa = new SimulatedAnnealing(
                function,
                new GaussianOperator(0.5), // Intensidade da perturbação
                0.96,                      // Fator de resfriamento (alpha)
                200,                       // Temperatura inicial
                100_000,                   // Número de iterações
                2                          // Dimensões
        );

        // Executa
        sa.execute();
    }
}
