import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class View {
	
	private Controller app;

	private JFrame frame;
	private JTextField txNombre;
	private JTextField txCarnet;
	private JButton btnSaludar;
	private JButton btnCancelar;
	private JLabel lblSaludo;
	private JButton btnCrear;
	private JComboBox cmbCarrera;
	private JPanel pEstudiantesTable;
	private JTable tblEstudiante;
	private DefaultTableModel modeloEstudiantes;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public View() {
		initialize();
		app = new Controller(3);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Listener oreja = new Listener();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel pEstudiante = new JPanel();
		pEstudiante.setBackground(new Color(35, 255, 0));
		frame.getContentPane().add(pEstudiante);
		pEstudiante.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblNombre = new JLabel("Nombre");
		pEstudiante.add(lblNombre);
		
		txNombre = new JTextField();
		pEstudiante.add(txNombre);
		txNombre.setColumns(10);
		
		JLabel lblCarnet = new JLabel("Carnet");
		pEstudiante.add(lblCarnet);
		
		txCarnet = new JTextField();
		pEstudiante.add(txCarnet);
		txCarnet.setColumns(10);
		
		JLabel lblCarrera = new JLabel("Carrera");
		pEstudiante.add(lblCarrera);
		
		btnSaludar = new JButton("Saludar");
		btnSaludar.addActionListener(oreja);
		
		cmbCarrera = new JComboBox();
		cmbCarrera.setModel(new DefaultComboBoxModel(new String[] {"Matemática Aplicada", "Física", "Ciencia de la Computación y Tecnologías de la Información"}));
		pEstudiante.add(cmbCarrera);
		pEstudiante.add(btnSaludar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(oreja);
		pEstudiante.add(btnCancelar);
		
		lblSaludo = new JLabel("");
		lblSaludo.setFont(new Font("Fira Code", Font.BOLD, 20));
		lblSaludo.setForeground(new Color(255, 38, 15));
		pEstudiante.add(lblSaludo);
		
		btnCrear = new JButton("Crear Estudiante");
		btnCrear.addActionListener(oreja);
		pEstudiante.add(btnCrear);
		
		pEstudiantesTable = new JPanel();
		pEstudiantesTable.setLayout(new GridLayout(1, 1));
		frame.getContentPane().add(pEstudiantesTable);
		
		modeloEstudiantes = new DefaultTableModel();
		modeloEstudiantes.addColumn("Nombre");
		modeloEstudiantes.addColumn("Carnet");
		modeloEstudiantes.addColumn("Carrera");
		
		tblEstudiante = new JTable(modeloEstudiantes);
		
		JScrollPane scrollPane = new JScrollPane(tblEstudiante);

		pEstudiantesTable.add(scrollPane);
	}
	
	private class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == btnSaludar) {
				System.out.println("BOTON SALUDAR PRESIONADO");
				
				lblSaludo.setText("Hola " + txNombre.getText());
				
			} else if (e.getSource() == btnCancelar) {
				System.out.println("BOTON CANCELAR PRESIONADO");
				
				txNombre.setText("");
				lblSaludo.setText("");
				txCarnet.setText("");
				
			} else if (e.getSource() == btnCrear) {
				System.out.println("BOTON CREAR PRESIONADO");
				
				Estudiante nuevo = app.agegarEstudiante(
					txNombre.getText(), 
					txCarnet.getText(), 
					cmbCarrera.getSelectedItem().toString()
				);
				
				if (nuevo != null) {
					lblSaludo.setText("Estudiantes: " + app.getCantidadEstudiantes());
					
					Object[] obj = {
			            nuevo.getNombre(),
			            nuevo.getCarnet(),
			            nuevo.getCarrara()
			        };
					
					modeloEstudiantes.addRow(obj);
				} else {
					lblSaludo.setText("Llegaste al maximo de estudiantes...");
					btnCrear.setEnabled(false);
				} 
			}
		}
	}
}
