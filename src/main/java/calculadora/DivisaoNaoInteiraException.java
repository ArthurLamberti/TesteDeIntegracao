package calculadora;

public class DivisaoNaoInteiraException extends RuntimeException {
    public DivisaoNaoInteiraException(){
        super("Divisão não é inteira");
    }
}
