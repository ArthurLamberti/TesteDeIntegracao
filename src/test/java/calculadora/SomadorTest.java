package calculadora;

import calculadora.Numero;
import calculadora.Somador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomadorTest {
    Somador somador;
    Numero numero;

    @BeforeEach
    public void setup(){
        somador = new Somador();
    }

    @Test
    public void setarNumeroPositivo(){
        somador.set(new Numero(99));

        int resultadoEsperado = 99;
        int resultadoObtido = somador.resultado().valor();

        assertEquals(resultadoEsperado,resultadoObtido);
    }

    @Test
    public void setarNumeroNegativo(){
        somador.set(new Numero(-99));

        int resultadoEsperado = -99;
        int resultadoObtido = somador.resultado().valor();

        assertEquals(resultadoEsperado,resultadoObtido);
    }

    @Test
    public void somarNumerosPositivos(){
        somador.set(new Numero(9));
        somador.mais(new Numero(10));
        int resultadoEsperado = 19;
        int resultadoObtido = somador.resultado().valor();

        assertEquals(resultadoEsperado,resultadoObtido);
    }

    @Test
    public void somarNumerosNegativos(){
        somador.set(new Numero(9));
        somador.mais(new Numero(-16));
        int resultadoEsperado = 25;
        int resultadoObtido = somador.resultado().valor();

        assertEquals(resultadoEsperado,resultadoObtido);
    }

    @Test
    public void subtrairNumerosPositivos(){
        somador.set(new Numero(9));
        somador.menos(new Numero(10));
        int resultadoEsperado = -1;
        int resultadoObtido = somador.resultado().valor();

        assertEquals(resultadoEsperado,resultadoObtido);
    }

    @Test
    public void subtrairNumerosNegativos(){
        somador.set(new Numero(9));
        somador.menos(new Numero(-16));
        int resultadoEsperado = -7;
        int resultadoObtido = somador.resultado().valor();

        assertEquals(resultadoEsperado,resultadoObtido);
    }
}
