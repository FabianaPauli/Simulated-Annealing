package com.leandersonandre.optimization;

import com.leandersonandre.optimization.function.FunctionFactory;
import com.leandersonandre.optimization.sa.SimulatedAnnealing;
import com.leandersonandre.optimization.sa.operator.GaussianOperator;

public class Main {
    public static void main(String[] args) {
        // Defina o nome do arquivo para salvar os gráficos e relatórios
        String fileName = "Rastrigin_Experiment";  // Nome para identificar o arquivo de saída

        // Inicializando o algoritmo SimulatedAnnealing com a função "RASTRIGIN"
        SimulatedAnnealing sa = new SimulatedAnnealing(
                FunctionFactory.getInstance().getFunction("RASTRIGIN"),
                new GaussianOperator(.5),
                0.96,
                200,
                100_000,
                2
        );

        // Passando o nome do arquivo para o método execute
        sa.execute(fileName);  // Passando fileName para gerar os gráficos e relatório
    }
}
