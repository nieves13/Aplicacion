package com.aplicacion;


public class Aplicacion {
	/**
	 * El metodo sirve para comprobar los valores introducidos y darnos un veredicto con respecto a la calificación que esperabamos conseguir y la que hemos conseguido al final.
	 * @param valor1 donde indicas la calificación deseada.
	 * @param valor2 donde indicas la calificación real del módulo.
	 * @return nos devuelve el veredicto después de comparar las notas.
	 */
	private static String veredicto (String valor1, String valor2) {
		if (valor1.equals(valor2)) {
		    return "Perfecto. Has tenido buen criterio.";
		}
		if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
		    return "Has mejorado, o te ha llegado el éxito inesperado.";
		}
		return "Te has confiado. Falta realismo.";
	}

	public static void main(String[]args) {
		System.out.println("La calificación de " + args [0] + ":");
		String veredicto = veredicto(args[1] , args[2]);
		System.out.println(veredicto);
	}
	
}
