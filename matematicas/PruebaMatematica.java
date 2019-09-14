package matematicas;

public class PruebaMatematica {

	public static void main(String[] args) {
		Matematicas n1 = new Matematicas();
		int[] numeros = new int[20];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = n1.random(1, 100);
			System.out.println(numeros[i]);
		}

		System.out.println("El maximo es: " + n1.max(numeros));
		System.out.println("El minimo es: " + n1.min(numeros));
		System.out.println("La suma es: " + n1.sum(numeros));
		
	}

}
