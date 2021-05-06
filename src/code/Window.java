package code;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;


/*
 * TODO:
 * box an/aus schalten
 * 
 * crops an/aus schalten per box
 * <Op id="SuperSourceV2BoxMaskEnable" superSource="0" boxIndex="1" enable="True"/>
 * <Op id="SuperSourceV2BoxMaskEnable" superSource="0" boxIndex="1" enable="False"/>
 * 
 * 
 * umbauen auf genau 4 boxes
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
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public List<SourceBoxPanel> sourceBoxes = new LinkedList<SourceBoxPanel>();
	public Box scrollBox = Box.createVerticalBox();
	private JTextField txtFrameCount;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_3;
	private JTextField txtIndex;
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("title:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		txtTitle = new JTextField();
		GridBagConstraints gbc_txtTitle = new GridBagConstraints();
		gbc_txtTitle.insets = new Insets(0, 0, 5, 5);
		gbc_txtTitle.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTitle.gridx = 4;
		gbc_txtTitle.gridy = 1;
		contentPane.add(txtTitle, gbc_txtTitle);
		txtTitle.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("description:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtDescription = new JTextField();
		GridBagConstraints gbc_txtDescription = new GridBagConstraints();
		gbc_txtDescription.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescription.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDescription.gridx = 4;
		gbc_txtDescription.gridy = 2;
		contentPane.add(txtDescription, gbc_txtDescription);
		txtDescription.setColumns(10);
		
		lblNewLabel_3 = new JLabel("index:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 3;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		txtIndex = new JTextField();
		GridBagConstraints gbc_txtIndex = new GridBagConstraints();
		gbc_txtIndex.insets = new Insets(0, 0, 5, 5);
		gbc_txtIndex.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIndex.gridx = 4;
		gbc_txtIndex.gridy = 3;
		contentPane.add(txtIndex, gbc_txtIndex);
		txtIndex.setColumns(10);
		
		JButton btnAdd = new JButton("add");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.gridwidth = 2;
		gbc_btnAdd.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdd.gridx = 13;
		gbc_btnAdd.gridy = 4;
		contentPane.add(btnAdd, gbc_btnAdd);
		
		scrollPane = new JScrollPane(scrollBox);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 7;
		gbc_scrollPane.gridwidth = 13;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 5;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		JLabel lblNewLabel_2 = new JLabel("number of frames:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 13;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtFrameCount = new JTextField();
		GridBagConstraints gbc_txtFrameCount = new GridBagConstraints();
		gbc_txtFrameCount.insets = new Insets(0, 0, 5, 5);
		gbc_txtFrameCount.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFrameCount.gridx = 4;
		gbc_txtFrameCount.gridy = 13;
		contentPane.add(txtFrameCount, gbc_txtFrameCount);
		txtFrameCount.setColumns(10);
		
		JButton btnSave = new JButton("Speichern");
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.insets = new Insets(0, 0, 5, 5);
		gbc_btnSave.gridwidth = 2;
		gbc_btnSave.gridx = 13;
		gbc_btnSave.gridy = 14;
		contentPane.add(btnSave, gbc_btnSave);
		
		btnAdd.addActionListener(e -> {
			SourceBoxPanel sourceBoxPanel = new SourceBoxPanel();
			scrollBox.add(sourceBoxPanel,Box.createVerticalGlue());
			scrollBox.add(Box.createVerticalStrut(10));
			sourceBoxes.add(sourceBoxPanel);
			validate();
			repaint();
		});
		
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
			
			for(int i = 0; i < sourceBoxes.size(); i++) {
				SourceBoxPanel that = (SourceBoxPanel)sourceBoxes.get(i);
				boxes.add(
						new SourceBox(
							i,
							new Position(Float.parseFloat(that.txtStartPosX.getText()),Float.parseFloat(that.txtStartPosY.getText())),
							new Position(Float.parseFloat(that.txtEndPosX.getText()),Float.parseFloat(that.txtEndPosY.getText())),
							Float.parseFloat(that.txtStartSize.getText()),
							Float.parseFloat(that.txtEndSize.getText()),
							new Crop(Float.parseFloat(that.txtStartCropTop.getText()),Float.parseFloat(that.txtStartCropLeft.getText()),Float.parseFloat(that.txtStartCropRight.getText()),Float.parseFloat(that.txtStartCropBottom.getText())),
							new Crop(Float.parseFloat(that.txtEndCropTop.getText()),Float.parseFloat(that.txtEndCropLeft.getText()),Float.parseFloat(that.txtEndCropRight.getText()),Float.parseFloat(that.txtEndCropBottom.getText()))
						)		
				);
			}	
			
			//generate macro
			Macro macro = new Macro(Integer.parseInt(txtIndex.getText()),txtTitle.getText(),txtDescription.getText(),boxes,Integer.parseInt(txtFrameCount.getText()));
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
