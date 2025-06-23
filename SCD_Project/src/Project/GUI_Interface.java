package Project;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class GUI_Interface extends JFrame {
	private JPanel inputField;
	private JTextField txtTitle;
	private JTextArea textArea;

	// Book lists
	private List<String> availableBooks = new ArrayList<>();
	private List<String> borrowedBooks = new ArrayList<>();

	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				GUI_Interface frame = new GUI_Interface();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}


	public GUI_Interface() {
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 500, 360);
	    inputField = new JPanel();
	    inputField.setLayout(null);
	    inputField.setBackground(Color.PINK); 
	    setContentPane(inputField);

	    JLabel lblNewLabel = new JLabel("Enter Book Title:");
	    lblNewLabel.setBounds(30, 30, 120, 20);
	    lblNewLabel.setForeground(Color.BLACK); 
	    inputField.add(lblNewLabel);

	    txtTitle = new JTextField();
	    txtTitle.setBounds(160, 30, 290, 25);
	    txtTitle.setBackground(new Color(30, 30, 30));
	    txtTitle.setForeground(Color.WHITE);
	    txtTitle.setCaretColor(Color.WHITE);
	    inputField.add(txtTitle);

	    JButton btnAdd = new JButton("Add Book");
	    btnAdd.setBounds(30, 70, 120, 30);
	    btnAdd.setBackground(Color.BLUE); 
	    btnAdd.setForeground(Color.WHITE);
	    inputField.add(btnAdd);

	    JButton btnList = new JButton("List Books");
	    btnList.setBounds(180, 70, 150, 30);
	    btnList.setBackground(Color.GREEN);
	    btnList.setForeground(Color.WHITE);
	    inputField.add(btnList);

	    JButton btnBorrow = new JButton("Borrow Book");
	    btnBorrow.setBounds(350, 70, 120, 30);
	    btnBorrow.setBackground(Color.ORANGE); 
	    btnBorrow.setForeground(Color.WHITE);
	    inputField.add(btnBorrow);

	    JButton btnReturn = new JButton("Return Book");
	    btnReturn.setBounds(30, 111, 120, 30);
	    btnReturn.setBackground( Color.RED); 
	    btnReturn.setForeground(Color.WHITE);
	    inputField.add(btnReturn);

	    JButton btnSearch = new JButton("Search Book");
	    btnSearch.setBounds(180, 111, 150, 30);
	    btnSearch.setBackground(Color.MAGENTA); 
	    btnSearch.setForeground(Color.WHITE);
	    inputField.add(btnSearch);

	    JButton btnClear = new JButton("Clear");
	    btnClear.setBounds(350, 111, 120, 30);
	    btnClear.setBackground(Color.LIGHT_GRAY); 
	    btnClear.setForeground(Color.WHITE);
	    inputField.add(btnClear);
	    
	    JButton btnReplay = new JButton("Replay");
	    btnReplay.setBounds(180, 300, 150, 30);
	    btnReplay.setBackground(Color.YELLOW);
	    btnReplay.setForeground(Color.BLACK);
	    inputField.add(btnReplay);

	    

	    // === Text Area for Output ===
	    textArea = new JTextArea();
	    textArea.setBounds(30, 160, 440, 130);
	    textArea.setBackground( Color.BLACK);
	    textArea.setForeground(Color.CYAN);
	    textArea.setCaretColor(Color.WHITE);
	    textArea.setLineWrap(true);
	    textArea.setWrapStyleWord(true);
	    inputField.add(textArea);
	    
	    //<<<<<<<<<<<<<<<<< Buttons Logic (Main Logic) >>>>>>>>>>>>>>>>>
		
		btnReplay.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Clear both book lists
		        availableBooks.clear();
		        borrowedBooks.clear();

		        // Clear the input and output fields
		        txtTitle.setText("");
		        textArea.setText("Library has been reset. Ready to start again!");

		        // Optional: Confirm replay
		        JOptionPane.showMessageDialog(null, "Library reset completed.");
		    }
		});



	}
}
