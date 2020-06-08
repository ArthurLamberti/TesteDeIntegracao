package calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MultiplicadorTest {
    Numero numero;
    Somador somador;
    Multiplicador multiplicador;

    @BeforeEach
    public void setup() {
        somador = new Somador();
        multiplicador = new Multiplicador(somador);
    }

    @Test
    public void deveMultiplicarNumeroPositivoPorUm() {
        numero = new Numero(77);
        multiplicador.set(numero);

        int resultadoEsperado = 77;
        int resultadoObtido = multiplicador.vezes(new Numero(1)).resultado().valor();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveMultiplicarNumeroNegativoPorUm() {
        numero = new Numero(-77);
        multiplicador.set(numero);

        int resultadoEsperado = -77;
        int resultadoObtido = multiplicador.vezes(new Numero(1)).resultado().valor();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveMultiplicarNumeroNegativoPorUmInvertido() {
        numero = new Numero(77);
        multiplicador.set(numero);

        int resultadoEsperado = -77;
        int resultadoObtido = multiplicador.vezes(new Numero(-1)).resultado().valor();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveMultiplicarNumeroPositivoPorXVezes() {
        numero = new Numero(1);
        multiplicador.set(numero);

        int resultadoEsperado = 8;
        int resultadoObtido = multiplicador.vezes(new Numero(8)).resultado().valor();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveMultiplicarNumeroNegativoPorXVezes() {
        numero = new Numero(-1);
        multiplicador.set(numero);

        int resultadoEsperado = -8;
        int resultadoObtido = multiplicador.vezes(new Numero(8)).resultado().valor();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveMultiplicarPor0() {
        numero = new Numero(11);
        multiplicador.set(numero);

        int resultadoEsperado = 0;
        int resultadoObtido = multiplicador.vezes(new Numero(0)).resultado().valor();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveMultiplicar0PorX() {
        numero = new Numero(0);
        multiplicador.set(numero);

        int resultadoEsperado = 0;
        int resultadoObtido = multiplicador.vezes(new Numero(33)).resultado().valor();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveDividirNumeroPositivoPorUm() {
        numero = new Numero(77);
        multiplicador.set(numero);

        int resultadoEsperado = 77;
        int resultadoObtido = multiplicador.dividido(new Numero(1)).resultado().valor();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveDividirNumeroNegativoPorUm() {
        numero = new Numero(-77);
        multiplicador.set(numero);

        int resultadoEsperado = -77;
        int resultadoObtido = multiplicador.dividido(new Numero(1)).resultado().valor();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveDividirNumeroPositivoPorXVezes() {
        numero = new Numero(8);
        multiplicador.set(numero);

        int resultadoEsperado = 2;
        int resultadoObtido = multiplicador.dividido(new Numero(4)).resultado().valor();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveDividirNumeroNegativoPorXVezes() {
        numero = new Numero(-8);
        multiplicador.set(numero);

        int resultadoEsperado = -2;
        int resultadoObtido = multiplicador.dividido(new Numero(4)).resultado().valor();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveDividirNumeroNegativoPorXVezesInvertido() {
        numero = new Numero(8);
        multiplicador.set(numero);

        int resultadoEsperado = -2;
        int resultadoObtido = multiplicador.dividido(new Numero(-4)).resultado().valor();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void lancaExcecaoAoDividirPor0() {
        numero = new Numero(11);
        multiplicador.set(numero);

        assertThrows(NumeroNaoPodeSerDivididoPorZeroException.class, () -> multiplicador.dividido(new Numero(0)));
    }

    @Test
    public void LancaExcecaoQuandoDivisaoNaoInteira() {
        numero = new Numero(11);
        multiplicador.set(numero);

        assertThrows(DivisaoNaoInteiraException.class, () -> multiplicador.dividido(new Numero(0)));
    }

    @Test
    public void deveDividir0PorX() {
        numero = new Numero(0);
        multiplicador.set(numero);

        int resultadoEsperado = 0;
        int resultadoObtido = multiplicador.dividido(new Numero(33)).resultado().valor();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveDividirPor1() {
        numero = new Numero(10);
        multiplicador.set(numero);

        int resultadoEsperado = 10;
        int resultadoObtido = multiplicador.dividido(new Numero(1)).resultado().valor();
        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void deveDividirPorMesmoNumero() {
        numero = new Numero(8);
        multiplicador.set(numero);

        int resultadoEsperado = 1;
        int resultadoObtido = multiplicador.dividido(new Numero(8)).resultado().valor();
        assertEquals(resultadoEsperado, resultadoObtido);
    }
}