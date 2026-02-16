package CajaBlanca;

public class CajaBlanca {

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