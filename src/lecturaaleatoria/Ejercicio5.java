package lecturaaleatoria;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class Ejercicio5 {
	public static void main(String[] args) {

		try {
			// create a new RandomAccessFile with filename test
			RandomAccessFile rafLeer = new RandomAccessFile("src/lecturaaleatoria/leer.txt", "r");
			RandomAccessFile rafEscribir = new RandomAccessFile("src/lecturaaleatoria/escribir.txt", "rw");

			Random r = new Random();

			for (int i = 0; i < 5; i++) {
				int num=r.nextInt();
				
				rafLeer.seek(0);
				rafEscribir.write(rafLeer.read());
				
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
