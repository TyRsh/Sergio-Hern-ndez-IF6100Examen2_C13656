package cr.go.ucr.test;

import static org.junit.jupiter.api.Assertions.*;

import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Multiplicacion;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;

class Test {

	@org.junit.jupiter.api.Test
	void testSuma() {
        OperacionAritmetica suma = new OperacionAritmetica(new Sumar());
        assertEquals(35, suma.procesar(20, 15));
    }
	
	@org.junit.jupiter.api.Test
	void testResta() {
        OperacionAritmetica resta = new OperacionAritmetica(new Resta());
        assertEquals(3, resta.procesar(7, 4));

        assertEquals(-2, resta.procesar(2, 20));
        assertEquals(-1, resta.procesar(3, -15));
    }
	
	@org.junit.jupiter.api.Test
	void testMultiplicacion() {
        OperacionAritmetica multiplicacion = new OperacionAritmetica(new Multiplicacion());
        assertEquals(48, multiplicacion.procesar(6, 8));
    }
	
	@org.junit.jupiter.api.Test
	void testDivision() {
        OperacionAritmetica division = new OperacionAritmetica(new Division());
        assertEquals(3, division.procesar(6, 2));
        assertEquals(-3, division.procesar(8, 0));
        assertEquals(-1, division.procesar(62, -3));
    }
	
	@org.junit.jupiter.api.Test
	void testNumerosNegativos() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Sumar());
        assertEquals(-1, operacion.procesar(-5, 67));
        assertEquals(-1, operacion.procesar(9, -4));
        assertEquals(-1, operacion.procesar(-1, -10));
    }

}


