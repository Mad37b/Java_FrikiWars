import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

/**
 * @author Profesor
 * @version 1.0
 * @Descripcion:
 * 
 */

public class VentanaWars extends JFrame {

	// Atributos de la clase VentanaWars

	int contador = 0;
	int numeroPartidas = 0; // contador de partidas

	private static final long serialVersionUID = 1L;
	private JPanel contentPanel;

	// Creacion de los atributos de la clase
	final static String Ruta = "C:\\Users\\Profesor\\Desktop\\FP Grado Superior\\01 Programación\\02 Ejercicios Java\\FrikiWars\\src\\ImgFrikiWars\\";
	ImageIcon Fondo = new ImageIcon(Ruta + "FondoPantalla" + ".jpg");
	ImageIcon ImgCromo = new ImageIcon(Ruta + "traseraCromo" + ".jpg");

	ImageIcon FigurasPuestas = new ImageIcon();
	ImageIcon FigurasAcertadas = new ImageIcon();
	ImageIcon FiguraErronea = new ImageIcon();
	ImageIcon FigurasOcultas = new ImageIcon();

	ImageIcon[] imagenFiguraAleatoria;

	ImageIcon[] imagenFiguraOculta;

	// ImageIcon imagenFigurasA = new ImageIcon();

	// ------------------------------------------------------------------------------------------------

	// Logica del programa

	// 1º Sacar el cromo a buscar (entre 1..10)
	// 2º Cargar posibles soluciones
	// 3º Comparar opcion elegida con cromo a buscar

	// -------------------------------------------------------------------------------------------------

	// Creacion de los Jlabels de las imagenes

	JLabel labelFondo = new JLabel();

	JLabel labelCromos01 = new JLabel();
	JLabel labelCromos02 = new JLabel();
	JLabel labelCromos03 = new JLabel();

	JLabel labelFigurasPuestas = new JLabel();

	JLabel labelFigurasIzquierda = new JLabel();
	JLabel labelFigurasCentro = new JLabel();
	JLabel labelFigurasDerecha = new JLabel();

	JFrame Cuadro = new JFrame();
	JPanel panel = (JPanel) Cuadro.getContentPane();

	// clases para Crear los Cromos

	public class CromosOcultos {

		// clase para crear los 3 Cromos Ocultos Encontrados y Erroneos

		// static CromosOcultos cromosOcultos1 = new CromosOcultos();
		// static CromosOcultos cromosOcultos2 = new CromosOcultos();
		// static CromosOcultos cromosOcultos3 = new CromosOcultos();

		JLabel labelCromosOcultos1 = new JLabel();
		JLabel labelCromosOcultos2 = new JLabel();
		JLabel labelCromosOcultos3 = new JLabel();

		// metodo 1

		// metodo 2

	}

	/**
	 * @wbp.nonvisual location=-10,19
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaWars frame = new VentanaWars();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		/**
		 * 
		 * @param_1
		 * 
		 * 
		 */

	}

	/**
	 * Create the frame.
	 */

	/**
	 * @Dimensiones: W 810, H 635 .
	 * 
	 */

	// Metodo publico y principal de la clase Ventana
	public VentanaWars() {

		/**
		 * @JFrame
		 **/
		setTitle("FrikiWars_By_Mad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// X Y W H
		setBounds(0, 0, 810, 635);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPanel);

		/**
		 * @param_Control: Absoluto
		 */
		contentPanel.setLayout(null);

		/** Boton de la izquierda **/
		JButton boton01 = new JButton("Aqui");
		/** ORANGE **/
		boton01.setBackground(new Color(192, 192, 192));
		boton01.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		boton01.setBounds(31, 529, 225, 35);
		boton01.addActionListener(new ActionListener() {

			/** @param_Logica_de_la_Partida; **/
			@Override
			public void actionPerformed(ActionEvent e) {

				if (contador < 10) {
					PosiblesOpciones();
					
					contador++;
				}
				// TODO Auto-generated method stub

			}

		});
		contentPanel.add(boton01);
		/** Boton de la izquierda **/
		JButton boton02 = new JButton("Aqui");
		boton02.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		boton02.setBounds(287, 529, 225, 35);
		boton02.setBackground(new Color(192, 192, 192));
		boton02.addActionListener(new ActionListener() {

			/** @param_Logica_de_la_Partida; **/
			@Override
			public void actionPerformed(ActionEvent e) {

				if (contador < 10) {
					PosiblesOpciones();
					
					contador++;
				}
				// TODO Auto-generated method stub

			}

		});
		contentPanel.add(boton02);
		/** Boton de la izquierda **/
		JButton boton03 = new JButton("o Aqui");
		boton03.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		boton03.setBounds(544, 529, 225, 31);
		boton03.setBackground(new Color(192, 192, 192));
		boton03.addActionListener(new ActionListener() {

			/** @param_Logica_de_la_Partida; **/
			@Override
			public void actionPerformed(ActionEvent e) {

				if (contador < 10) {
					PosiblesOpciones();
					
					contador++;
				}
				// TODO Auto-generated method stub

			}

		});
		contentPanel.add(boton03);

		JButton botonReinciar = new JButton("Volver a Lanzar");
		botonReinciar.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		botonReinciar.addActionListener(new ActionListener() {

			// Reinicio de la partida
			public void actionPerformed(ActionEvent botonReinciar) {

				if (contador < 10) {
					contador++;
					reiniciarJuego();
					Cromos();
					contentPanel.setComponentZOrder(labelCromos01, 0);
					contentPanel.setComponentZOrder(labelCromos02, 0);
					contentPanel.setComponentZOrder(labelCromos03, 0);
					contentPanel.setComponentZOrder(labelFigurasPuestas, 0);

				} else {
					verMensaje("Ey mm  mm hemos llegado al fin pues !");
				}

			}
		});
		botonReinciar.setBounds(31, 563, 738, 30);
		contentPanel.add(botonReinciar);

		// Llamar a los metodos
		reiniciarJuego();

		// Muestro la original y las 3 cartas ocultas

		Cromos();

		inicializarFiguraPuesta();

		crearFichero();

		fondodePantalla();

	}

// borre el mouseaction

	public void fondodePantalla() {
		labelFondo.setIcon(Fondo);
		labelFondo.setBounds(0, 0, 810, 635);
		contentPanel.add(labelFondo);
		// labelFondo.getComponentZOrder(0);

	}

	public void Cromos() {
		labelCromos01.setIcon(ImgCromo);
		labelCromos01.setBounds(31, 295, 255, 255);
		// labelCromos01.getComponentZOrder(0);
		contentPanel.add(labelCromos01);

		labelCromos02.setIcon(ImgCromo);
		labelCromos02.setBounds(287, 295, 255, 255);
		contentPanel.add(labelCromos02);

		labelCromos03.setIcon(ImgCromo);
		labelCromos03.setBounds(544, 295, 255, 255);
		contentPanel.add(labelCromos03);

	}

	public void inicializarFiguraPuesta() {

		// variables del metodo

		int i = 1;
		int figuraAleatoria = (int) (Math.random() * 10);
		imagenFiguraAleatoria = new ImageIcon[10];
		imagenFiguraOculta = new ImageIcon[3];

		// Rutas

		String rutaFigurasPuestas = "FiguraPuesta\\" + "0" + figuraAleatoria + ".jpg";
		String rutaFigurasAcertadas = "FiguraAcertadas\\" + "0" + figuraAleatoria +"ok.jpg";
		String rutaFigurasErroneas = "FiguraErroneas\\" + "0" + figuraAleatoria + "bad.jpg";

		// asignar rutas a las ImageIcon

		FigurasPuestas = new ImageIcon(Ruta + rutaFigurasPuestas);
		FigurasOcultas = new ImageIcon(Ruta + rutaFigurasAcertadas);

		labelFigurasPuestas.setIcon(FigurasPuestas);
		labelFigurasPuestas.setBounds(288, 14, 225, 255);
		contentPanel.add(labelFigurasPuestas);

		// ----------------------------------------------------------------------------------------------------

		// Llenar Array  imagenesPuestas
		for (i = 1; i < 10; i++) {

			String imagenAleatorio = ("FiguraPuesta\\" + i + "jpg");
			imagenFiguraAleatoria[i] = new ImageIcon(Ruta + imagenAleatorio);
		}

		// Llenar Array ImagenFiguraOculta para las 3 cartas

		for (i = 1; i < 3; i++) {
			String imagenAleatoriaOculta = ("FiguraAcertada\\" + i + "jpg");
			imagenFiguraOculta[i] = new ImageIcon(Ruta + imagenAleatoriaOculta);

		}

		// Imagenes ocultas colocadas //

				labelFigurasIzquierda.setIcon(FigurasOcultas);
				labelFigurasIzquierda.setBounds(31, 295, 225, 255);
				contentPanel.add(labelFigurasPuestas);

				labelFigurasCentro.setIcon(FigurasOcultas);
				labelFigurasCentro.setBounds(287, 295, 225, 255);
				contentPanel.add(labelFigurasPuestas);

				labelFigurasDerecha.setIcon(FigurasOcultas);
				labelFigurasDerecha.setBounds(544, 295, 225, 255);
				contentPanel.add(labelFigurasPuestas);

		//------------------------------------------------------------------//

	}

	public void PosiblesOpciones() {
		int numPartidas = 0;
		Ramdon NumeroA = new Ramdon;
		int numeroAleatorio = (int) (Math.random() * 10) + 1;
		while (numPartidas < 10) {
			if (FiguraPuestas ==  numeroAleatorio&&figuraOculta) {
				FiguraPuestas ==FiguraOculta;
				numPartidas++;
				- figuraPuesta sera igual a la figura acertada
			}if else ( figuraPuesta < numeroAleatorio&&figuraOculta){
				FiguraPuesta ==Figura
				numPartidas++;
				
			}if else {figuraPuesta > numeroAleatorio&&figuraOculta){
				numPartidas++;
			}
		
			
		}

		
		}
		
	}

	// -------------------------------------------------------------------------------------------------------------------------------------------------------
	// Ver mensaje y Reiniciar son metodos de la clase VentanaWars

	private void verMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	private void reiniciarJuego() {
		/**
		 * Restablecer las imágenes y configuraciones iniciales directamente sobre los
		 * componentes existentes
		 **/

		inicializarFiguraPuesta();

		// Refrescar el contenido del panel
		contentPanel.repaint();
	}

	// Crear fichero - - Metodo de la clase Ventana wars

	public void crearFichero() {
		FileWriter fichero;
		String salidaFichero;
		boolean resultado = false;

		salidaFichero = "\n" + "Cromos Acertadas" + FigurasAcertadas + "-" + "Cromos Erroneas" + "-" + "Cromo" + "-"
				+ "Resultado" + resultado + "\n";

		try {
			fichero = new FileWriter("datosFrikisWars.VDA", true);

			fichero.write(salidaFichero);

			System.out.println(" Se ha escrito el fichero de datos Frikis Wars . VDA");
			fichero.close();
		} catch (Exception ex) {

			System.out.println("Mensaje de la excepción: " + ex.getMessage());
			System.out.println(" No se ha podido grabar el fichero");
		}
		System.out.println(salidaFichero);
	}

}
