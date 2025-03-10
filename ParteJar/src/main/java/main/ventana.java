package main;
 
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
public class ventana {
 
	private JFrame frame;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana window = new ventana();
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
	public ventana() {
		initialize();
	}
 
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JButton btnNewButton = new JButton("Haz Click");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "HOLA MUNDO");
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnNewButton.setBounds(147, 104, 131, 39);
		frame.getContentPane().add(btnNewButton);
	}
}