package ej4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		leerArchivo();
	}

	static public void leerArchivo() {

		BufferedReader br = null;
		try {

			br = new BufferedReader(new FileReader("src/ej4/palabras.txt"));

			String linea;
			String[] palabra;

			linea = br.readLine();

			palabra = linea.split("(?=[A-Z])");
			
			Arrays.sort(palabra);

			for (String envio : palabra) {
				imprimirArchivo(envio);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				br.close();

			} catch (IOException e) {

				e.printStackTrace();

			}

		}
	} // Fin leerArchivo

	static public void imprimirArchivo(String palabra) {

		// BufferedWriter para escribir
		BufferedWriter bw = null;
		{
			try {

				// Lo inicializamos
				bw = new BufferedWriter(new FileWriter("src/ej4/palabrasOrdenadas.txt", true));

				bw.append(palabra);
				bw.newLine();

			} catch (FileNotFoundException e) {

				e.printStackTrace();

			} catch (IOException e) {

				e.printStackTrace();

			} finally {

				try {

					bw.flush();
					bw.close();

				} catch (IOException e) {

					e.printStackTrace();

				}

			}
		}
	}
}