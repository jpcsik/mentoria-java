package Desafio1;

public class Desafio1 {

    public Desafio1(
            Integer capacidadeCabine,
            Integer tamanhoTurma
    ) {
        if (capacidadeCabine <= 0) {
            throw new IllegalArgumentException("Capacidade da cabine não deve ser menor ou igual a zero !");
        }

        this.tamanhoTurma = tamanhoTurma;
        this.capacidadeCabine = capacidadeCabine;
    }

    private final Integer capacidadeCabine;

    private final Integer tamanhoTurma;

    protected String calcularViagens() {
        int numeroMinimo = tamanhoTurma / capacidadeCabine + 1;
        return "Número mínimo de viagens: " + numeroMinimo;
    }

}

