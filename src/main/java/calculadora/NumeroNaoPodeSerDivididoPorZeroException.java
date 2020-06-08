package calculadora;

public class NumeroNaoPodeSerDivididoPorZeroException extends RuntimeException {
    public NumeroNaoPodeSerDivididoPorZeroException(){
        super("Um número não pode ser dividido por 0");
    }
}
