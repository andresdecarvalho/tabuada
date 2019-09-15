package Tabuada;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class Tabuada extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;
	private JButton btnLimpar;
	private JLabel lblResultado0;
	private JLabel lblResultado1;
	private JLabel lblResultado2;
	private JLabel lblResultado3;
	private JLabel lblResultado4;
	private JLabel lblResultado5;
	private JLabel lblResultado6;
	private JLabel lblResultado7;
	private JLabel lblResultado8;
	private JLabel lblResultado9;
	private JLabel lblResultado10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabuada frame = new Tabuada();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tabuada() {
		setTitle("Tabuada");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTabuada = new JButton("Tabuada");
		btnTabuada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		
		lblResultado10 = new JLabel("");
		lblResultado10.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado10.setBounds(105, 358, 124, 14);
		contentPane.add(lblResultado10);
		
		lblResultado9 = new JLabel("");
		lblResultado9.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado9.setBounds(105, 333, 124, 14);
		contentPane.add(lblResultado9);
		
		lblResultado8 = new JLabel("");
		lblResultado8.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado8.setBounds(105, 308, 124, 14);
		contentPane.add(lblResultado8);
		
		lblResultado7 = new JLabel("");
		lblResultado7.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado7.setBounds(105, 283, 124, 14);
		contentPane.add(lblResultado7);
		
		lblResultado6 = new JLabel("");
		lblResultado6.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado6.setBounds(105, 258, 124, 14);
		contentPane.add(lblResultado6);
		
		lblResultado5 = new JLabel("");
		lblResultado5.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado5.setBounds(105, 231, 124, 14);
		contentPane.add(lblResultado5);
		
		lblResultado4 = new JLabel("");
		lblResultado4.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado4.setBounds(105, 206, 124, 14);
		contentPane.add(lblResultado4);
		
		lblResultado3 = new JLabel("");
		lblResultado3.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado3.setBounds(105, 181, 124, 14);
		contentPane.add(lblResultado3);
		
		lblResultado2 = new JLabel("");
		lblResultado2.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado2.setBounds(105, 156, 124, 14);
		contentPane.add(lblResultado2);
		
		lblResultado1 = new JLabel("");
		lblResultado1.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado1.setBounds(105, 131, 124, 14);
		contentPane.add(lblResultado1);
		
		lblResultado0 = new JLabel("");
		lblResultado0.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado0.setBounds(105, 110, 124, 14);
		contentPane.add(lblResultado0);
		btnTabuada.setToolTipText("Tabuada");
		btnTabuada.setBounds(64, 59, 89, 23);
		contentPane.add(btnTabuada);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(122, 25, 97, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		
		JTable table = new JTable();
		table.setBounds(81, 100, 183, 277);
		contentPane.add(table);
		btnLimpar.setBounds(179, 59, 89, 23);
		contentPane.add(btnLimpar);
	        }
		public void calcular(){
			int valor,resultado;
			valor = (int) Double.parseDouble(txtNumero.getText());		
			for (int ii = 0; ii <=10; ii++){
				System.out.println(ii);
				resultado = ii*valor;

				if (ii==0) {
					lblResultado0.setText(valor + " x 0 = " + resultado);
				    }
				
				if (ii==1) {
					lblResultado1.setText(valor + " x 1 = " + resultado);
				    }
				
				if (ii==2) {
					lblResultado2.setText(valor + " x 2 = " + resultado);
					}
				if (ii==3) {
					lblResultado3.setText(valor + " x 3 = " + resultado);
					}
				if (ii==4) {
					lblResultado4.setText(valor + " x 4 = " + resultado);
					}
				if (ii==5) {
					lblResultado5.setText(valor + " x 5 = " + resultado);
					}
				if (ii==6) {
					lblResultado6.setText(valor + " x 6 = " + resultado);
					}
				if (ii==7) {
					lblResultado7.setText(valor + " x 7 = " + resultado);
					}
				if (ii==8) {
					lblResultado8.setText(valor + " x 8 = " + resultado);
					}
				if (ii==9) {
					lblResultado9.setText(valor + " x 9 = " + resultado);
					}
				if (ii==10) {
					lblResultado10.setText(valor + " x 10 = " + resultado);
					}
					
}
}
		private void limpar() {
			lblResultado0.setText(null);
			lblResultado1.setText(null);
			lblResultado2.setText(null);
			lblResultado3.setText(null);
			lblResultado4.setText(null);
			lblResultado5.setText(null);
			lblResultado6.setText(null);
			lblResultado7.setText(null);
			lblResultado8.setText(null);
			lblResultado9.setText(null);
			lblResultado10.setText(null);
			txtNumero.setText(null);
			
	}
}
		