package calculadora;

import calculadora.Fatorial;
import calculadora.Multiplicador;
import calculadora.Numero;
import calculadora.Somador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FatorialTest{
    Numero numero;
    Somador somador;
    Multiplicador multiplicador;
    Fatorial fatorial;

    @BeforeEach
    public void setup(){
        somador = new Somador();
        multiplicador = new Multiplicador(somador);
        fatorial = new Fatorial(multiplicador);
    }

    @Test
    public void calculaFatorialDe3(){
        numero = new Numero(3);
        Fatorial resultado = fatorial.fatorial(numero);
        int esperado = 6;
        assertEquals(esperado, resultado.resultado().valor());
    }

    @Test
    public void calculaFatorialDe1(){
        numero = new Numero(1);
        Fatorial resultado = fatorial.fatorial(numero);
        int esperado = 1;
        assertEquals(esperado, resultado.resultado().valor());
    }

    @Test
    public void calculaFatorialDe0(){
        numero = new Numero(0);
        Fatorial resultado = fatorial.fatorial(numero);
        int esperado = 0;
        assertEquals(esperado, resultado.resultado().valor());
    }


    @Test
    public void calculaFatorialDe5(){
        numero = new Numero(5);
        Fatorial resultado = fatorial.fatorial(numero);
        int esperado = 120;
        assertEquals(esperado, resultado.resultado().valor());
    }

    @Test
    public void lancaExcecaoFatorialNumeroNegativo(){
        numero = new Numero(-4);

        assertThrows(FatorialNumeroNegativoException.class, () -> fatorial.fatorial(numero));
    }
}