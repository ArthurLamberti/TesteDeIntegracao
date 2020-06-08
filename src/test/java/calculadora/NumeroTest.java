package calculadora;

import calculadora.Numero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumeroTest {
    Numero numero;

    @Test
    public void deveIncrementarComValorPositivo(){
        numero = new Numero(4);

        int resultadoEsperado = 5;
        int resultadoObtido = numero.inc().valor();

        assertEquals(resultadoEsperado,resultadoObtido);
    }

    @Test
    public void deveIncrementarComValorNegativo(){
        numero = new Numero(-4);

        int resultadoEsperado = -3;
        int resultadoObtido = numero.inc().valor();

        assertEquals(resultadoEsperado,resultadoObtido);
    }

    @Test
    public void deveDecrementarComValorPositivo(){
        numero = new Numero(4);

        int resultadoEsperado = 3;
        int resultadoObtido = numero.dec().valor();

        assertEquals(resultadoEsperado,resultadoObtido);
    }

    @Test
    public void deveDecrementarComValorNegativo(){
        numero = new Numero(-4);

        int resultadoEsperado = -5;
        int resultadoObtido = numero.dec().valor();

        assertEquals(resultadoEsperado,resultadoObtido);
    }

    @Test
    public void deveRetornarValorAbsoluto(){
        numero = new Numero(-4);

        int resultadoEsperado = 4;
        int resultadoObtido = numero.abs().valor();

        assertEquals(resultadoEsperado,resultadoObtido);
    }

    @Test
    public void deveDuplicarNumero(){
        numero = new Numero(7);
        Numero numeroDuplicado = numero.duplica();


        int resultadoEsperado = 7;
        int resultadoObtido = numeroDuplicado.valor();

        assertEquals(resultadoEsperado,resultadoObtido);
        assertNotSame(numero, numeroDuplicado);
    }

    @Test
    public void testaToString(){
        Integer numeroPrimitivo = 1;
        Numero numero = new Numero(numeroPrimitivo);

        String esperado = numeroPrimitivo.toString();
        String resultado = numero.toString();

        assertEquals(esperado, resultado);
    }

}