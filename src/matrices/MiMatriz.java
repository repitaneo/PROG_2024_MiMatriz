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
				
				// rellena con un número entre 0 y 9
				datos[i][j] = (int) (Math.random()*10);
			}
		}
	}



	public void imprimir() {

		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				
				System.out.print(datos[i][j]+" ");
			}
			System.out.println();
		}		
	}
	
	
	
	public boolean isCuadrada() {
		
		if(filas==columnas) {
			return true;
		}
		else return false;
	}
	
	
	
	

	public void rellenarPorFilas() {
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				
				datos[i][j] = i+1;
			}
		}
	}	
	
	
	
	public void rellenarFilaNumero(int fila,int numero) {
		
		// miro si la fila es legal
		if(fila>=1 && fila<=filas) {

			// si lo es, recorro las columnas
			for(int j=0;j<columnas;j++) {
				
				// cuelo el número es la fila-1 de mi matriz
				datos[fila-1][j] = numero;
			}
		}
	}
	
	
	
	public void rellenarColumnaNumero(int columna,int numero) {
		
		// miro si la columna es legal
		if(columna>=1 && columna<=columnas) {

			// si lo es, recorro las fila
			for(int i=0;i<filas;i++) {
				
				// cuelo el número es la fila-1 de mi matriz
				datos[i][columna-1] = numero;
			}
		}
	}
	
	
	
	
	
	
	
}
