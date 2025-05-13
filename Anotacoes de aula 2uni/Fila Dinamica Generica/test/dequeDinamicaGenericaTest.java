/**
 * Classe de teste da fila dinamica generica
 *
 * @author Chiacchio H R B
 * @version 1.0
 * @since 2025 05 13
 */

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class dequeDinamicaGenericaTest {

    @Test
    public void testeEnfileirarinicio() {
        DuplamenteEnfileiravelGenerico<String> t = new dequeDinamicaGenerica<>();
        t.enfileirarInicio("1");
        t.enfileirarInicio("2");
        assertEquals("2", t.espiarinicio());
    }

    @Test
    public void testeEnfileirarFim() {
        DuplamenteEnfileiravelGenerico<String> t = new dequeDinamicaGenerica<>();
        t.enfileirarFim("1");
        t.enfileirarFim("2");
        assertEquals("2", t.espiarFim());
    }


    @Test
    public void testeDesinfileirarInicio() {
        DuplamenteEnfileiravelGenerico<String> t = new dequeDinamicaGenerica<>();
        t.enfileirarFim("1");
        t.enfileirarFim("2");
        assertEquals("1", t.desinfileirarinicio());
    }

    @Test
    public void testeDesinfileirarFim() {
        DuplamenteEnfileiravelGenerico<String> t = new dequeDinamicaGenerica<>();
        t.enfileirarFim("1");
        t.enfileirarFim("2");
        assertEquals("2", t.desinfileirarFim());
    }

    @Test
    public void testeEspiarInicio() {
        DuplamenteEnfileiravelGenerico<String> t = new dequeDinamicaGenerica<>();
        t.enfileirarFim("1");
        t.enfileirarFim("2");
        assertEquals("1", t.espiarinicio());
    }

    @Test
    public void testeEspiarFim() {
        DuplamenteEnfileiravelGenerico<String> t = new dequeDinamicaGenerica<>();
        t.enfileirarFim("1");
        t.enfileirarFim("2");
        assertEquals("2", t.espiarFim());
    }

    @Test
    public void testeAtualizarInicio() {
        DuplamenteEnfileiravelGenerico<String> t = new dequeDinamicaGenerica<>();
        t.enfileirarFim("1");
        t.enfileirarFim("5");
        t.atualizarInicio("7");
        assertEquals("7", t.espiarinicio());
    }

    @Test
    public void testeAtualizarFim() {
        DuplamenteEnfileiravelGenerico<String> t = new dequeDinamicaGenerica<>();
        t.enfileirarFim("1");
        t.atualizarFim("5");
        assertEquals("5", t.espiarFim());
    }

    @Test
    public void testeEstaCheioEnfileirar() {
        DuplamenteEnfileiravelGenerico<String> t = new dequeDinamicaGenerica<>(1);
        t.enfileirarFim("1");
        try {
            t.enfileirarFim("2");
            fail("Deveria gerar um exceção");
        } catch (NoSuchElementException e) {
            assertEquals("FILA CHEIA", e.getMessage());
        }
    }

    @Test
    public void testeEstaVaziaDesinfileirar() {
        DuplamenteEnfileiravelGenerico<String> t = new dequeDinamicaGenerica<>();
        try {
            t.desinfileirarinicio();
            fail("Deveria gerar uma execeção");
        } catch (NoSuchElementException e) {
            assertEquals("FILA VAZIA", e.getMessage());
        }
    }

    @Test
    public void testeEstaVaziaEspiarInicio() {
        DuplamenteEnfileiravelGenerico<String> t = new dequeDinamicaGenerica<>();
        try {
            t.espiarinicio();
            fail("Deveria gerar um exceção");
        } catch (NoSuchElementException e) {
            assertEquals("FILA VAZIA", e.getMessage());
        }
    }

    @Test
    public void testeEstaVaziaEspiarFim() {
        DuplamenteEnfileiravelGenerico<String> t = new dequeDinamicaGenerica<>();
        try {
            t.espiarFim();
            fail("Deveria gerar um exceção");
        } catch (NoSuchElementException e) {
            assertEquals("FILA VAZIA", e.getMessage());
        }
    }

    @Test
    public void testeEstaVaziaAtualizarInicio() {
        DuplamenteEnfileiravelGenerico<String> t = new dequeDinamicaGenerica<>();
        try {
            t.atualizarInicio("1");
            fail("Deveria gerar uma exceção");
        } catch (NoSuchElementException e) {
            assertEquals("FILA VAZIA", e.getMessage());
        }
    }

    @Test
    public void testeEstaVaziaAtualizarFim() {
        DuplamenteEnfileiravelGenerico<String> t = new dequeDinamicaGenerica<>();
        try {
            t.atualizarFim("1");
            fail("Deveria gerar uma exceção");
        } catch (NoSuchElementException e) {
            assertEquals("FILA VAZIA", e.getMessage());
        }
    }

    @Test
    public void testeImprimirInicioFim() {
        DuplamenteEnfileiravelGenerico<String> t = new dequeDinamicaGenerica<>();
        t.enfileirarFim("1");
        t.enfileirarFim("2");
        t.enfileirarFim("3");
        String impresso = t.imprimirInicioFim();
        assertTrue(impresso.contains("1"));
        assertTrue(impresso.contains("2"));
        assertTrue(impresso.contains("3"));

    }

    @Test
    public void testeImprimirFimInicio() {
        DuplamenteEnfileiravelGenerico<String> t = new dequeDinamicaGenerica<>();
        t.enfileirarFim("1");
        t.enfileirarFim("2");
        t.enfileirarFim("3");
        String impresso = t.imprimirInicioFim();
        assertTrue(impresso.contains("1"));
        assertTrue(impresso.contains("2"));
        assertTrue(impresso.contains("3"));

    }


}
