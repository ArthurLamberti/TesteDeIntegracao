public class Multiplicador {
    private Numero resultado;
    private Somador somador;

    public Multiplicador(Somador somador) {
        this.resultado = new Numero(0);
        this.somador = somador;
    }

    public Multiplicador set(Numero numero) {
        this.resultado = numero;
        return this;
    }

    public Multiplicador vezes(Numero outro) {
        outro = outro.duplica();

        somador.set(this.resultado.duplica());

        while (outro.valor() > 0) {
            somador.mais(this.resultado);
            outro.dec();
        }

        this.resultado = somador.resultado();
        return this;
    }

    public Multiplicador dividido(Numero outro) {
        if (outro.valor() == 0) {
            throw new RuntimeException("Um número não pode ser dividido por 0");
        }

        if (resultado.valor() % outro.valor() != 0) {
            throw new RuntimeException("Divisão não é inteira");
        }

        outro = outro.duplica();

        somador.set(this.resultado.duplica());

        while (outro.valor() > 0) {
            somador.menos(this.resultado);
            outro.dec();
        }

        this.resultado = somador.resultado();
        return this;
    }

    public Numero resultado() {
        return resultado;
    }
}