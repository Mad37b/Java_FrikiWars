import java.util.*;

import java.awt.*;
import java.io.*;
import javax.swing.*;

public class Fichero {

	// Atributos de la clase
	// File ficheroVDA = new File("C:\\Users\\Profesor\\Desktop\\FP Grado
	// Superior\\01 Programación\\02 Ejercicios Java\\Clientes
	// Bingo\\src\\ClientesVDA");
	// FileWriter NuevoFicheroVDA = new FileWriter("C:\\Users\\Profesor\\Desktop\\FP
	// Grado Superior\\01 Programación\\02 Ejercicios Java\\Clientes
	// Bingo\\src\\ClientesVDA");
	String salidaFichero;

	// Crear fichero

	public void crearFichero(String cliente) {
		FileWriter fichero;

		try {
			fichero = new FileWriter("clientes.VDA", true);

			fichero.write(cliente);
			fichero.close();
		} catch (Exception ex) {

			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}

}
