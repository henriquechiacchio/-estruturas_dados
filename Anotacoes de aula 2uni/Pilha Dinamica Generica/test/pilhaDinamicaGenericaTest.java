//Executar todos os comandos dentro da pasta "Pilha Dinâmica Genérica"
//compilar fonte: javac src/*.java -d bin
//compilar teste: javac -cp .;bin;lib/junit-4.13.2.jar -d test test/PilhaDinamicaGenericaTest.java
//executar teste: java -cp .;bin;test;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore PilhaDinamicaGenericaTest

import java.util.NoSuchElementException;
import org.junit.Test;
import static org.junit.Assert.*;

public class pilhaDinamicaGenericaTest {

    @Test
    public void testEmpilhar() {
        empilhavelGenerica<String> pilha = new pilhaDinamicaGenerica<>(5);
        pilha.empilhar("Instituto");
        pilha.empilhar("Federal");
        assertEquals("Federal", pilha.espiar());
    }

    @Test
    public void testDesempilhar() {
        empilhavelGenerica<String> pilha = new pilhaDinamicaGenerica<>(5);
        pilha.empilhar("Instituto");
        pilha.empilhar("Federal");
        assertEquals("Federal", pilha.desempilhar());
    }

    @Test
    public void testEspiar() {
        empilhavelGenerica<String> pilha = new pilhaDinamicaGenerica<>(5);
        pilha.empilhar("Instituto");
        pilha.empilhar("Federal");
        assertEquals("Federal", pilha.espiar());
    }

    @Test
    public void testAtualizar() {
        empilhavelGenerica<String> pilha = new pilhaDinamicaGenerica<>(5);
        pilha.empilhar("Instituto");
        pilha.empilhar("Federal");
        pilha.atualizar("Municipal");
        assertEquals("Municipal", pilha.espiar());
    }

    @Test
    public void testImprimir() {
        empilhavelGenerica<String> pilha = new pilhaDinamicaGenerica<>(5);
        pilha.empilhar("Instituto");
        pilha.empilhar("Federal");
        pilha.empilhar("de");
        String resultado = pilha.imprimir();
        assertTrue(resultado.contains("Instituto"));
        assertTrue(resultado.contains("Federal"));
        assertTrue(resultado.contains("de"));
    }

    @Test
    public void testPilhaCheiaEmpilhar() {
        empilhavelGenerica<String> pilha = new pilhaDinamicaGenerica<>(1);
        pilha.empilhar("Instituto");
        try {
            pilha.empilhar("Federal");// deve lançar exceção
            //Se chegou aqui, a exceção não foi lançada!
            fail("Deveria ter acontecido um overflow!");
        } catch (NoSuchElementException e) {
            assertEquals("Pilha cheia!", e.getMessage());
        }
    }

    @Test
    public void testPilhaVaziaDesempilhar() {
        empilhavelGenerica<String> pilha = new pilhaDinamicaGenerica<>(1);
        try {
            pilha.desempilhar(); // deve lançar exceção
            //Se chegou aqui, a exceção não foi lançada!
            fail("Deveria ter acontecido um underflow!");
        } catch (NoSuchElementException e) {
            assertEquals("Pilha vazia!", e.getMessage());
        }
    }

    @Test
    public void testPilhaVaziaEspiar() {
        empilhavelGenerica<String> pilha = new pilhaDinamicaGenerica<>(1);
        try {
            pilha.espiar(); // deve lançar exceção
            //Se chegou aqui, a exceção não foi lançada!
            fail("Deveria ter acontecido um underflow!");
        } catch (NoSuchElementException e) {
            assertEquals("Pilha vazia!", e.getMessage());
        }
    }

    @Test
    public void testPilhaVaziaAtualizar() {
        empilhavelGenerica<String> pilha = new pilhaDinamicaGenerica<>(1);
        try {
            pilha.atualizar("Universidade"); // deve lançar exceção
            //Se chegou aqui, a exceção não foi lançada!
            fail("Deveria ter acontecido um underflow!");
        } catch (NoSuchElementException e) {
            assertEquals("Pilha vazia!", e.getMessage());
        }
    }
}