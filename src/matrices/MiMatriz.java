package matrices;

import java.util.Arrays;

public class MiMatriz {

	private int datos[][];
	private int filas;
	private int columnas;
	
	
	
	public MiMatriz(int filas,int columnas) {
		
		datos = new int[filas][columnas];
		this.filas = filas;
		this.columnas = columnas;
	}



	public void rellenar() {
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				
				// rellena con un número entre 0 y 14
				datos[i][j] = (int) Math.random()*15;
			}
		}
	}



	public void imprimir() {

		System.out.println(Arrays.toString(datos[0]));
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				
				System.out.print(datos[i][j]+" ");
			}
			System.out.println();
		}		
	}
	
}
