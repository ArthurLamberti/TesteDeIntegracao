public class Fatorial {
    private Numero resultado;
    private Multiplicador multiplicador;

    Fatorial(Multiplicador multiplicador) {
        this.resultado = new Numero(0);
        this.multiplicador = multiplicador;
    }

    public Fatorial fatorial(Numero valor) {
        if(valor.valor() < 0){
            throw new RuntimeException("Não é possível realizar o fatorial de número negativo");
        }
        multiplicador.set(valor.duplica());

        while (valor.valor() > 1) {
            valor.dec();
            multiplicador.vezes(valor);
        }

        this.resultado = multiplicador.resultado();
        return this;
    }

    public Numero resultado() {
        return resultado;
    }
}