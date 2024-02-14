package matrices;

public class Start {

	public static void main(String[] args) {
		
		
		MiMatriz miMatriz = new MiMatriz(5,7);
		miMatriz.rellenar();
		miMatriz.rellenarColumnaNumero(6, 9009);
		miMatriz.imprimir();
		System.out.println("es cuadrada? "+miMatriz.isCuadrada());

	}

}
