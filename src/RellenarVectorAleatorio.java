import java.util.Arrays;

public class RellenarVectorAleatorio {
	static final int NELEM = 10;
	static final int MINIMO = 0;
	static final int MAXIMO = 10;

	static int[] nAleatorios = new int[NELEM];

	public static void main(String[] args) {

		int numeroAlAzar = MINIMO + (int) (Math.random() * (MAXIMO - MINIMO)) + 1;
		int i = 0;
		while (i < NELEM) {
			if (!existeEnNAleatorios(numeroAlAzar, nAleatorios, i)) {
				nAleatorios[i] = numeroAlAzar;
				i++;
			} else
				numeroAlAzar = MINIMO + (int) (Math.random() * (MAXIMO - MINIMO)) + 1;
		}

		System.out.println("Numeros sacados");

		for (i = 0; i < NELEM; i++) {
			if (i < (NELEM - 1))
				System.out.print(nAleatorios[i]+"-");
			else
				System.out.print(nAleatorios[i]);
		}

	}

	private static boolean existeEnNAleatorios(int numero, int[] v, int limite) {
		boolean existe = false;
		for (int j = 0; j < limite; j++) {
			if (v[j] == numero) {
				existe = true;
			}
		}
		return existe;
	}

}