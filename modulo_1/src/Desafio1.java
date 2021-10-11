
public class Desafio1 {

    public Desafio1(
            Integer capacidadeCabine,
            Integer tamanhoTurma
    ) {
        if (capacidadeCabine <= 0) {
            throw new IllegalArgumentException("Capacidade da cabine não pode deve ser menor ou igual a zero !");
        }

        this.tamanhoTurma = tamanhoTurma;
        this.capacidadeCabine = capacidadeCabine;
    }

    private final Integer capacidadeCabine;

    private final Integer tamanhoTurma;

    private String calcularViagens() {
        int numeroMinimo = tamanhoTurma / capacidadeCabine + 1;
        return "Numero minimo de viagens: " + numeroMinimo;
    }

    public static void main(String[] args) {

        Desafio1 desafio = new Desafio1(10, 20);

        System.out.println(desafio.calcularViagens());

    }
}

