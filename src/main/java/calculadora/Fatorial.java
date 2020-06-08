package calculadora;

public class Fatorial {
    private Numero resultado;
    private Multiplicador multiplicador;

    public Fatorial(Multiplicador multiplicador) {
        this.resultado = new Numero(0);
        this.multiplicador = multiplicador;
    }

    public Fatorial fatorial(Numero valor) {
        if(valor.valor() < 0){
            throw new FatorialNumeroNegativoException();
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