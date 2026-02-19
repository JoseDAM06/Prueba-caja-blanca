package CajaBlanca;

/**
 * La clase se encarga de comprobar que la matricula esta bien
 * @author DAM106
 * @version 1.0
 */

public class CajaBlanca {
	/**
	 * 
	 * @param numero esta variable contiene el numero de la matricula
	 * @param letra1 contiene la primera letra de la matricula
	 * @param letra2 contiene la segunda letra de la matricula
	 * @param letra3 contiene la tercera letra de la matricula
	 * @return comprueba que los valores de la matricula son verdaderos
	 */
	public boolean compruebaMatricula(int numero, char letra1, char letra2, char letra3) {
		boolean matriculaValida;
		if ((numero > 0) && (numero <= 9999))
			if (Character.isLetter(letra1) && Character.isLetter(letra2) && Character.isLetter(letra3)) {
				matriculaValida = true;
			} else {
				matriculaValida = false;
			}
		else {
			matriculaValida = false;
		}
		return matriculaValida;
	}
}
