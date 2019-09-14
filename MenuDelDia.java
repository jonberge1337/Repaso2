import java.util.Scanner;

public class MenuDelDia {


	public static void main(String[] args) {
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		Verdura platoUnoA = new Verdura("acelgas", "acelgas a la riojana", 5, "proteica", 6, "verde");
		Verdura platoUnoB = new Verdura("espinacas", "espinacas de popeye", 5, "fibrilar", 27, "verde");
		Verdura platoUnoC = new Verdura("calabaza", "calabaza a la cordobesa", 5, "hidratos", 3, "verde");
		
		Carne platoDosA = new Carne("Chuleta", "Chuleta pequeña de kilo", true, 7, 35);
		Carne platoDosB = new Carne("Costilla", "Costillas de ovejas de Aia", true, 7, 35);
		Carne platoDosC = new Carne("Entrecula", "Entrecula del norte", true, 9, 35);
		
		Fruta platoTresA = new Fruta("Manzana", "Manzanas del camping de Zarautz", 3, null, 0, null);
		Fruta platoTresB = new Fruta("Platano", "Platano de canarias", 3, null, 8, null);
		Fruta platoTresC = new Fruta("Naranja", "Naranja de Valencia", 3, null, 23, null);
		
		Alimento[] menu1 = {platoUnoA, platoDosB, platoTresC};
		Alimento[] menu2 = {platoUnoB, platoDosC, platoTresA};
		Alimento[] menu3 = {platoUnoC, platoDosA, platoTresB};

		System.out.println("Elige que menu del dia quieres comer");
		System.out.println("1. Meditarranea\n2. Norteño\n3. Celestial");
		do {
			try {
				opcion = sc.nextInt();
			} catch (Exception e) {
				sc.nextLine();
			}
		} while (opcion < 1 && opcion > 3);
		if (opcion == 1) {
			System.out.println("vas a comer: ");
			for (Alimento alimento : menu1) {
				System.out.println(alimento.getDescripcion());
			}
		} else if (opcion == 2) {
			System.out.println("vas a comer: ");
			for (Alimento alimento : menu2) {
				System.out.println(alimento.getDescripcion());	
			}

		} else {
			System.out.println("vas a comer: ");
			for (Alimento alimento : menu3) {
				System.out.println(alimento.getDescripcion());
			}
		}
		sc.close();
	}

}
