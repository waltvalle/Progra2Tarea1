import static org.junit.Assert.*;

import org.junit.Test;


public class Evaluar {
	
	int arr[]={1,2,3};
	int arr2[]={50,2,7,11,6};
	MiClase mi_clase = new MiClase(10);
	MiClase mi_clase2 = new MiClase(200);

	@Test
	public void esPar() {
		assertEquals("5 no es par.", false, Ejercicios.esPar(5));
		assertEquals("10 es par.", true, Ejercicios.esPar(10));
		assertEquals("17 no es par.", false, Ejercicios.esPar(17));
	}
		
	@Test
	public void churches() {		
		assertEquals("churches(10) deberia devolver paquetillo", "paquetillo", Ejercicios.churches(10));
		assertEquals("churches(70) deberia devolver paquetito", "paquetin", Ejercicios.churches(70));
		assertEquals("churches(150) deberia devolver paquetote", "paquetote", Ejercicios.churches(150));
		assertEquals("churches(400) deberia devolver paqueton", "paqueton", Ejercicios.churches(400));
	}
	
	@Test
	public void factorial() {	
		assertEquals("El factorial de 5 es 120", 120, Ejercicios.factorial(5));
		assertEquals("El factorial de 7 es 5040", 5040, Ejercicios.factorial(7));
		assertEquals("El factorial de 3 es 6", 6, Ejercicios.factorial(3));
	}
	
	@Test
	public void getElemento1() {
		assertEquals("El elemnto 1 de {1,2,3} es 2", 2, Ejercicios.getElemento(arr,1));
		assertEquals("El elemnto 3 de {50,2,7,11,6} es 11", 11, Ejercicios.getElemento(arr2,3));
	}
	
	@Test
	public void getElemento2() {
		int arrb[][]={{1,2,3},{4,5,6}};
		assertEquals("El elemnto [1][0] de {{1,2,3},{4,5,6}} es 4", 4, Ejercicios.getElemento(arrb,1,0));
		int arrb2[][]={{1,2,3},{4,5,6},{4,5,6}};
		assertEquals("El elemnto [0][2] de {{1,2,3},{4,5,6},{4,5,6}} es 3", 3, Ejercicios.getElemento(arrb2,0,2));
	}
	
	@Test
	public void getX() {
		assertEquals("getX(mi_clase) no esta devolviendo x correctamente", 10, Ejercicios.getX(mi_clase));
		assertEquals("getX(mi_clase) no esta devolviendo x correctamente", 200, Ejercicios.getX(mi_clase2));
	}
	
	@Test
	public void implementarGetXPor2() {
		assertEquals("implementarGetXPor2() incorrecta", 20, Ejercicios.implementarGetXPor2(mi_clase));
		assertEquals("implementarGetXPor2() incorrecta", 400, Ejercicios.implementarGetXPor2(mi_clase2));
	}
	
	@Test
	public void implementarGetXMasY() {
		assertEquals("implementarGetXMasY() incorrecta", 15, Ejercicios.implementarGetXMasY(mi_clase,5));
		assertEquals("implementarGetXMasY() incorrecta", 210, Ejercicios.implementarGetXMasY(mi_clase2,10));
	}
	
	@Test
	public void fibonacci() {
		assertEquals("El fibonacci de 4 es 3", 3, Ejercicios.fibonacci(4));
		assertEquals("El fibonacci de 6 es 8", 8, Ejercicios.fibonacci(6));
	}
	
	@Test
	public void funcionRecursiva() {
		assertEquals("El funcionRecursiva de 0 es 2", 0, Ejercicios.funcionRecursiva(0));
		assertEquals("El funcionRecursiva de 2 es 5", 5, Ejercicios.funcionRecursiva(2));
		assertEquals("El funcionRecursiva de 3 es 11", 11, Ejercicios.funcionRecursiva(3));
	}
}
