package code;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Image;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;

import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import javax.swing.SwingConstants;

/*
 * TODO
 * Append funktion / mehrere transitions hinzufügen
 */

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTitle;

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
	private JLabel lblNewLabel_3, lblFrameInfo;
	private JTextField txtIndex;
	private SourceBoxPanel sourceBoxPanel1;
	private SourceBoxPanel sourceBoxPanel2;
	private SourceBoxPanel sourceBoxPanel3;
	private SourceBoxPanel sourceBoxPanel4;
	private JTextArea txtDescription;
	public Window() {
		setTitle("YATM - Your Animated Transition Macro");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 676);
		Image icon = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB_PRE);
		setIconImage(icon);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Title:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 54, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Description:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(212, 11, 106, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_3 = new JLabel("Index:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(10, 25, 59, 14);
		contentPane.add(lblNewLabel_3);
		
		sourceBoxPanel1 = new SourceBoxPanel(0);
		sourceBoxPanel1.setBounds(10, 96, 500, 248);
		contentPane.add(sourceBoxPanel1);
				
		sourceBoxPanel2 = new SourceBoxPanel(1);
		sourceBoxPanel2.setBounds(520, 96, 500, 248);
		contentPane.add(sourceBoxPanel2);
		
		sourceBoxPanel3 = new SourceBoxPanel(2);
		sourceBoxPanel3.setBounds(10, 355, 500, 248);
		contentPane.add(sourceBoxPanel3);
		
		sourceBoxPanel4 = new SourceBoxPanel(3);
		sourceBoxPanel4.setBounds(520, 355, 500, 248);
		contentPane.add(sourceBoxPanel4);
		
		JLabel lblNewLabel_2 = new JLabel("number of frames:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(520, 57, 95, 14);
		contentPane.add(lblNewLabel_2);
		
		txtFrameCount = new JTextField();
		txtFrameCount.setBackground(Color.GRAY);
		txtFrameCount.setForeground(Color.WHITE);
		txtFrameCount.setBounds(615, 54, 27, 20);
		txtFrameCount.setColumns(10);
		txtFrameCount.setDocument(new JTextFieldLimitNumberOnly(3));
		txtFrameCount.addMouseListener(new TextFieldHighlightListener());
		contentPane.add(txtFrameCount);
		
		JButton btnSave = new JButton("save to file");
		btnSave.setIcon(null);
		btnSave.setBackground(Color.WHITE);
		btnSave.setForeground(Color.DARK_GRAY);
		btnSave.setBounds(914, 50, 106, 23);
		contentPane.add(btnSave);
		
		txtTitle = new JTextField();
		txtTitle.setBackground(Color.GRAY);
		txtTitle.setForeground(Color.WHITE);
		txtTitle.setBounds(59, 51, 143, 20);
		txtTitle.setColumns(10);
		txtTitle.setDocument(new JTextFieldLimit(20));
		txtTitle.addMouseListener(new TextFieldHighlightListener());
		contentPane.add(txtTitle);
		
		txtIndex = new JTextField();
		txtIndex.setBackground(Color.GRAY);
		txtIndex.setForeground(Color.WHITE);
		txtIndex.setBounds(59, 22, 22, 20);
		txtIndex.setColumns(10);
		txtIndex.setDocument(new JTextFieldLimitNumberOnly(2));
		txtIndex.addMouseListener(new TextFieldHighlightListener());
		contentPane.add(txtIndex);
		
		JLabel linkCoffee = new JLabel("buy us a coffee :)");
		linkCoffee.setHorizontalAlignment(SwingConstants.CENTER);
		linkCoffee.setBackground(Color.DARK_GRAY);
		linkCoffee.setForeground(Color.WHITE);
		linkCoffee.setBounds(442, 614, 143, 13);
		linkCoffee.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		linkCoffee.addMouseListener(new LinkMouseListener());
		contentPane.add(linkCoffee);
		
		txtDescription = new JTextArea();
		txtDescription.setBackground(Color.GRAY);
		txtDescription.setForeground(Color.WHITE);
		txtDescription.setBounds(212, 25, 298, 46);
		txtDescription.setColumns(1);
		txtDescription.setLineWrap(true);
		txtDescription.setRows(2);
		txtDescription.setDocument(new JTextFieldLimit(125));
		txtDescription.addMouseListener(new TextFieldHighlightListener());
		contentPane.add(txtDescription);
		
		btnSave.addActionListener(e -> {
			
			//select target file
			File fileToSave;
			JFileChooser fileChooser = new JFileChooser();
			FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter("xml files (*.xml)", "xml");
			fileChooser.setDialogTitle("Specify a file to save");   
			fileChooser.setFileFilter(xmlfilter);
			
			int userSelection = fileChooser.showSaveDialog(this);
			 
			if (userSelection == JFileChooser.APPROVE_OPTION) {
			    fileToSave = fileChooser.getSelectedFile();
			    System.out.println("Save as file: " + fileToSave.getAbsolutePath());
			} else {
				return;
			}			
			
			if(!fileToSave.getName().matches(".*\\.[x|X][m|M][l|L]$")) {
				fileToSave = new File(fileToSave.getAbsolutePath()+".xml");
			}
			
			//collect Box parameters
			List<SourceBox> boxes = new LinkedList<>();
			boxes.add(this.sourceBoxPanel1.getSourceBox());
			boxes.add(this.sourceBoxPanel2.getSourceBox());
			boxes.add(this.sourceBoxPanel3.getSourceBox());
			boxes.add(this.sourceBoxPanel4.getSourceBox());
        	
			//generate macro
			Macro macro = new Macro(
				new MacroSettings(
					txtIndex.getText().equals("") ? 1 : Integer.parseInt(txtIndex.getText()),
					txtTitle.getText(),
					txtDescription.getText(),
					txtFrameCount.getText().equals("") ? 1 : Integer.parseInt(txtFrameCount.getText()),
					boxes
				)
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
	        	this.txtDescription.setText(ex.toString());
	        }
		});

		
		JButton btnRead = new JButton("import macro");
		btnRead.setIcon(null);
		btnRead.setBackground(Color.WHITE);
		btnRead.setForeground(Color.DARK_GRAY);
		btnRead.setBounds(914, 21, 106, 23);
		contentPane.add(btnRead);
		
		btnRead.addActionListener(e -> {
			//select target file
			File fileToRead;
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("Specify a file to read");   
			 
			int userSelection = fileChooser.showOpenDialog(this);
			 
			if (userSelection == JFileChooser.APPROVE_OPTION) {
				fileToRead = fileChooser.getSelectedFile();

			    System.out.println("Read file: " + fileToRead.getAbsolutePath());
			} else {
				return;
			}	
			
			MacroReader reader = new MacroReader();
			
			loadSettings(reader.read(fileToRead));
			
		});
		
		lblFrameInfo = new JLabel("i");
		lblFrameInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrameInfo.setBackground(Color.DARK_GRAY);
		lblFrameInfo.setForeground(Color.WHITE);
    	lblFrameInfo.setBorder(new LineBorder(Color.WHITE));
		lblFrameInfo.setBounds(647, 50, 14, 14);
		lblFrameInfo.setVisible(false);
		contentPane.add(lblFrameInfo);
		
		txtFrameCount.getDocument().addDocumentListener(new DocumentListener() {
		  	
			public void changedUpdate(DocumentEvent e) {
				checkFrameCount();
			}
			
			public void removeUpdate(DocumentEvent e) {
				checkFrameCount();
			}
			
			public void insertUpdate(DocumentEvent e) {
				checkFrameCount();
			}

			public void checkFrameCount() {
				if(!txtFrameCount.getText().isBlank()) {
					int frameCount = Integer.parseInt(txtFrameCount.getText());
					
				    if(frameCount > 30) {
				    	lblFrameInfo.setForeground(Color.ORANGE);
				    	lblFrameInfo.setBorder(new LineBorder(Color.ORANGE));
						lblFrameInfo.setText("!");
				    	lblFrameInfo.setToolTipText("Macro might get too big to load in another switcher.");
				    	lblFrameInfo.setVisible(true);
				    	return;
				    } else if (frameCount < 10) {
				    	lblFrameInfo.setForeground(Color.WHITE);
				    	lblFrameInfo.setBorder(new LineBorder(Color.WHITE));
						lblFrameInfo.setText("i");
				    	lblFrameInfo.setToolTipText("For smooth transitions we recommend at least 10 frames.");
				    	lblFrameInfo.setVisible(true);
				    	return;
				    }
				}
		    	lblFrameInfo.setToolTipText(null);
		    	lblFrameInfo.setVisible(false);
			}
		});
	}
	
	public static class FrameInfoListener extends MouseAdapter{

		public static String text = "";
		
	    @Override
	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	((JComponent)evt.getSource()).setToolTipText("test");
	    }

	    @Override
	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	((JComponent)evt.getSource()).setBackground(Color.GRAY);
	    }
	}
	
	public void loadSettings(MacroSettings settings) {
		this.txtIndex.setText(settings.getIndex()+"");
		this.txtTitle.setText(settings.getTitle());
		this.txtDescription.setText(settings.getDescription());
		this.txtFrameCount.setText(settings.getFrameCount()+"");
		this.sourceBoxPanel1.loadSourceBox(settings.getSourceBoxes().get(0));
		this.sourceBoxPanel2.loadSourceBox(settings.getSourceBoxes().get(1));
		this.sourceBoxPanel3.loadSourceBox(settings.getSourceBoxes().get(2));
		this.sourceBoxPanel4.loadSourceBox(settings.getSourceBoxes().get(3));
	}
	
	/*
	 * https://stackoverflow.com/questions/527719/how-to-add-hyperlink-in-jlabel
	 */
	private static class LinkMouseListener extends MouseAdapter {

	    @Override
	    public void mouseClicked(java.awt.event.MouseEvent evt) {
	    	openUri("https://www.buymeacoffee.com/jazix");
	    }
	}
	
	private static void openUri(String uri) {
		openUri(URI.create(uri));
	}
	
	/*
	 * https://stackoverflow.com/questions/527719/how-to-add-hyperlink-in-jlabel
	 */
	private static void openUri(URI uri) {
	    if (Desktop.isDesktopSupported()) {
	      try {
	        Desktop.getDesktop().browse(uri);
	      } catch (IOException e) {}
	    } else {}
	  }
}
