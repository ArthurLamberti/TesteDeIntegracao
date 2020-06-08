package calculadora;

public class FatorialNumeroNegativoException extends RuntimeException {
    public FatorialNumeroNegativoException(){
        super("Não é possível realizar o fatorial de número negativo");
    }
}
