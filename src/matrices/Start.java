package matrices;

public class Start {

	public static void main(String[] args) {
		
		
		MiMatriz miMatriz = new MiMatriz(5,7);
		miMatriz.rellenar();
		miMatriz.imprimir();
		System.out.println(miMatriz.mediaColumna(5));
		System.out.println(miMatriz.mediaFila(2));
		

	}

}
