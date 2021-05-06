package code;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Color;


/*
 * TODO:
 * max chars:
 * 	title: 20
 *  desc: 125
 */

public class Window extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTitle;
	private JTextField txtDescription;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JTextField txtFrameCount;
	private JLabel lblNewLabel_3;
	private JTextField txtIndex;
	private SourceBoxPanel sourceBoxPanel1;
	private SourceBoxPanel sourceBoxPanel2;
	private SourceBoxPanel sourceBoxPanel3;
	private SourceBoxPanel sourceBoxPanel4;
	public Window() {
		setTitle("YTM - Your Transition Macro");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 846, 655);
		Image icon = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB_PRE);
		setIconImage(icon);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("title:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(27, 43, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("description:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(27, 71, 106, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_3 = new JLabel("index:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(27, 14, 59, 14);
		contentPane.add(lblNewLabel_3);
		
		sourceBoxPanel1 = new SourceBoxPanel();
		sourceBoxPanel1.setBounds(10, 96, 398, 248);
		contentPane.add(sourceBoxPanel1);
		
		sourceBoxPanel2 = new SourceBoxPanel();
		sourceBoxPanel2.setBounds(10, 355, 398, 248);
		contentPane.add(sourceBoxPanel2);
		
		sourceBoxPanel3 = new SourceBoxPanel();
		sourceBoxPanel3.setBounds(418, 96, 398, 248);
		contentPane.add(sourceBoxPanel3);
		
		sourceBoxPanel4 = new SourceBoxPanel();
		sourceBoxPanel4.setBounds(418, 355, 398, 248);
		contentPane.add(sourceBoxPanel4);
		
		JLabel lblNewLabel_2 = new JLabel("number of frames:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(418, 71, 130, 14);
		contentPane.add(lblNewLabel_2);
		
		txtFrameCount = new JTextField();
		txtFrameCount.setBounds(544, 68, 22, 20);
		contentPane.add(txtFrameCount);
		txtFrameCount.setColumns(10);
		
		JButton btnSave = new JButton("save to file");
		btnSave.setIcon(null);
		btnSave.setBackground(Color.WHITE);
		btnSave.setForeground(Color.DARK_GRAY);
		btnSave.setBounds(710, 67, 106, 23);
		contentPane.add(btnSave);
		
		txtDescription = new JTextField();
		txtDescription.setBounds(115, 68, 265, 20);
		contentPane.add(txtDescription);
		txtDescription.setColumns(10);
		
		txtTitle = new JTextField();
		txtTitle.setBounds(115, 40, 187, 20);
		contentPane.add(txtTitle);
		txtTitle.setColumns(10);
		
		txtIndex = new JTextField();
		txtIndex.setBounds(115, 11, 22, 20);
		contentPane.add(txtIndex);
		txtIndex.setColumns(10);
		
		btnSave.addActionListener(e -> {
			
			//select target file
			File fileToSave;
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("Specify a file to save");   
			 
			int userSelection = fileChooser.showSaveDialog(this);
			 
			if (userSelection == JFileChooser.APPROVE_OPTION) {
			    fileToSave = fileChooser.getSelectedFile();
			    System.out.println("Save as file: " + fileToSave.getAbsolutePath());
			} else {
				return;
			}			
			
			//collect Box parameters
			List<SourceBox> boxes = new LinkedList<>();
			boxes.add(this.sourceBoxPanel1.getSourceBox(1));
			boxes.add(this.sourceBoxPanel2.getSourceBox(2));
			boxes.add(this.sourceBoxPanel3.getSourceBox(3));
			boxes.add(this.sourceBoxPanel4.getSourceBox(4));
						
			//generate macro
			Macro macro = new Macro(
				Integer.parseInt(txtIndex.getText().isBlank() ? "1" : txtIndex.getText()),
				txtTitle.getText().isBlank() ? "new_macro" : txtTitle.getText(),
				txtDescription.getText(),
				boxes,
				Integer.parseInt(txtFrameCount.getText().isBlank() ? "1" : txtFrameCount.getText())
			);
			String tmp = macro.generate();
			
			//write macro to file
			try {
				FileWriter myWriter = new FileWriter(fileToSave);
	         	myWriter.write(tmp);
	         	myWriter.close();
	         	System.out.println("Successfully wrote to the file.");
	        } catch (IOException ex) {
	        	System.out.println("An error occurred.");
	        	ex.printStackTrace();
	        }
		});
	}

}
