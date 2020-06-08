package calculadora;

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
        if (this.resultado.valor() == 0 || outro.valor() == 0) {
            somador.set(new Numero(0));
            this.resultado = somador.resultado();
        } else {
            if (this.resultado.valor() == 1 || this.resultado.valor() == -1) {
                somador.set(outro.duplica());
            } else {
                Numero aux = outro.duplica().abs();

                somador.set(this.resultado.duplica().abs());

                while (aux.valor() > 1) {
                    somador.mais(this.resultado.duplica().abs());
                    aux.dec();
                }
            }

            if (this.resultado.valor() < 0 ^ outro.valor() < 0) {
                this.resultado = new Numero(Math.negateExact(somador.resultado().valor()));
            } else {
                this.resultado = somador.resultado();
            }
        }

        return this;
    }

    public Multiplicador dividido(Numero outro) {
        if (outro.valor() == 0) {
            throw new NumeroNaoPodeSerDivididoPorZeroException();
        }

        if (resultado.valor() % outro.valor() != 0) {
            throw new DivisaoNaoInteiraException();
        }

        if (outro.valor() == 1 || outro.valor() == -1) {
            somador.set(this.resultado.duplica().abs());
        } else if(this.resultado.duplica().abs().valor() == outro.duplica().abs().valor()){
            somador.set(new Numero(1));
        }else {
            Numero aux = outro.duplica();
            aux = aux.abs();

            somador.set(this.resultado.duplica().abs());
            Numero counter = new Numero(0);
            while (somador.resultado().valor() != 0) {
                somador.menos(aux.duplica().abs());
                counter.inc();
            }
            somador.set(counter);
        }

        if (this.resultado.valor() < 0 ^ outro.valor() < 0) {
            this.resultado = new Numero(Math.negateExact(somador.resultado().valor()));
        } else {
            this.resultado = somador.resultado();
        }

        return this;
    }

    public Numero resultado() {
        return resultado;
    }
}