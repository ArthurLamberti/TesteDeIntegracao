public class Fatorial {
    private Numero resultado;
    private Multiplicador multiplicador;

    Fatorial(Multiplicador multiplicador) {
        this.resultado = new Numero(0);
        this.multiplicador = multiplicador;
    }

    public Fatorial fatorial(Numero valor) {
        multiplicador.set(valor.duplica());

        while (valor.valor() > 1) {
            multiplicador.vezes(valor);
            valor.dec();
        }

        this.resultado = multiplicador.resultado();
        return this;
    }

    public Numero resultado() {
        return resultado;
    }
}