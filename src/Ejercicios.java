public class Ejercicios
{
	//deveulve true si "numero" es par y false de lo contrario

	//Devuelve verdadero si el residuo del numero da igual 0
	//Si no devolvera Falso
	static boolean esPar(int numero)
	{
		 if(numero%2==0)
	           return true;
	        else
	            return false;
	}

	//devuelve "paquetillo" si lempiras es menor que 50
	//devuelve "paquetin" si lempiras es menor que 100
	//devuelve "paquetote" si lempiras es menor que 200
	//de lo contrario devuelve paqueton
	//nota: solo aceptan minusculas
	
	//En esta funcion lo que hacemos es comparar la variable Lempiras y si es menor al numero, 
	//se designan los strings para cada numero y si no entran en el rango devuelve paqueton   
	static String churches(int lempiras)
	{
		 if (lempiras<50) 
			 return "paquetillo";
	         if (lempiras<100) 
	            return "paquetin";
	            if (lempiras<200) 
	                return "paquetote";

	           return "paqueton";


	}

	//devuelve el factorial de "num"

	//Si el numero es menor que 2 entonces devolvera 1
	//si no se realizara la funcion que es multiplicar numero por la factorial y luego restarle 1
	// se devuelve el resultado
	static int factorial(int num)
	{
		int resultado;
		if (num<2) 
		{
			resultado = 1;
		}
		else
		{
			resultado = num*factorial(num-1);
		}
		return resultado;
	}

	//devuelve el elemento de "arr" en la posicion "pos"
	
	//solo se devuelve arr con la posicion pos
	static int getElemento(int arr[],int pos)
	{
		return arr[pos];
	}

	//devuelve el elemento de "arr" en la posicion ["col"] ["fila"]

	//Este arreglo bidemensional devuelve col y fila.
	static int getElemento(int arr[][],int col,int fila)
	{
		return arr[col] [fila];
	}

	//devuelve el atributo "x" de "MiClase"

	//Se devuelve la variable declarada en "mi_clase"

	static int getX(MiClase mi_clase)
	{
		return mi_clase.x;
	}

	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion

	//se realizo el proceso en mi clase donde se multiplica la varaible por 2
	static int implementarGetXPor2(MiClase mi_clase)
	{
		return mi_clase.getXPor2();
	}

	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion

	//Se realizo el proceso de sumar una variable con la otra x+y
	static int implementarGetXMasY(MiClase mi_clase, int y)
	{
		return mi_clase.getXMasY(y);
	}

	//devuelve la funcion fibonacci de "num"
	//nota: puedes consultar la funcion en http://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci

	// El link me ayudo a hacerlo
	//Si devuelve 0 si el numero es 0 y si es igual a 1 devuelve 1
	static int fibonacci(int num)
	{
		if(num==0) return 0;
        else
             if(num==1)
                return 1;
             else
        // Si no se cumplen se devuelve la funcion fibonacci con el valor de num menos 1 mas la funcion con el valor num menos 2
                  return fibonacci(num-1) + fibonacci(num-2);
	}

	//realizar la siguiente funcion recursiva:
	//funcionRecursiva(n) = funcionRecursiva(n-1)*2+1
	//donde: funcionRecursiva(0) = 0 y funcionRecursiva(1) = 2
	
	// lo hice con la ayuda de los ejercicios realizados en programacion 1
	//Si el numero igual 0 devolvera 0
	//Si es igual 1 devolvera 2
	static int funcionRecursiva(int num)
	{

		if (num == 0)
			return 0;

		if (num == 1)
				return 2;
	// Si no se cumplen estas condiciones se realiza la funcion recursiva con el valor de num menos 1 por 2 mas 1.
		return funcionRecursiva(num -1)*2+1;
}


	public static void main(String[] args)
	{

	}

}
