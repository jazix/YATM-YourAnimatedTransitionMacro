package code;

import javax.swing.JPanel;
import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class SourceBoxPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public JTextField txtStartPosX;
	public JTextField txtStartPosY;
	public JTextField txtEndPosX;
	public JTextField txtEndPosY;
	public JTextField txtStartSize;
	public JTextField txtEndSize;
	public JTextField txtStartCropTop;
	public JTextField txtStartCropLeft;
	public JTextField txtStartCropRight;
	public JTextField txtStartCropBottom;
	public JTextField txtEndCropTop;
	public JTextField txtEndCropLeft;
	public JTextField txtEndCropRight;
	public JTextField txtEndCropBottom;
	private JCheckBox chkEnableBox;
	JCheckBox chkEnableCrop;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JComboBox<String> comboInputSource;
	private int index = 0;
	private JLabel lblSource;
	private JLabel lblNewLabel_5_5;

	/**
	 * Create the panel.
	 */
	public SourceBoxPanel(int index) {
		
		this.index = index;
		setBackground(Color.DARK_GRAY);
		setBorder(new LineBorder(Color.GRAY));
		setLayout(null);
		
		chkEnableBox = new JCheckBox("enable Box "+(index+1));
		chkEnableBox.setForeground(Color.WHITE);
		chkEnableBox.setBackground(Color.DARK_GRAY);
		chkEnableBox.setBounds(7, 7, 96, 25);
		add(chkEnableBox);
		
		JLabel lblNewLabel = new JLabel("start position");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(40, 39, 93, 25);
		add(lblNewLabel);
		
		txtStartPosX = new JTextField();
		txtStartPosX.setBackground(Color.GRAY);
		txtStartPosX.setForeground(Color.WHITE);
		txtStartPosX.setBounds(40, 82, 40, 25);
		txtStartPosX.setColumns(2);
		txtStartPosX.setDocument(new JTextFieldLimitNumberOnly(6));
		txtStartPosX.addMouseListener(new TextFieldHighlightListener());
		add(txtStartPosX);
		
		txtStartPosY = new JTextField();
		txtStartPosY.setBackground(Color.GRAY);
		txtStartPosY.setForeground(Color.WHITE);
		txtStartPosY.setBounds(90, 82, 40, 25);
		txtStartPosY.setColumns(4);
		txtStartPosY.setDocument(new JTextFieldLimitNumberOnly(6));
		txtStartPosY.addMouseListener(new TextFieldHighlightListener());
		add(txtStartPosY);
		
		JLabel lblEndPosition = new JLabel("end position");
		lblEndPosition.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndPosition.setForeground(Color.LIGHT_GRAY);
		lblEndPosition.setBounds(228, 39, 90, 25);
		add(lblEndPosition);
		
		txtEndPosX = new JTextField();
		txtEndPosX.setBackground(Color.GRAY);
		txtEndPosX.setForeground(Color.WHITE);
		txtEndPosX.setBounds(228, 82, 40, 25);
		txtEndPosX.setColumns(4);
		txtEndPosX.setDocument(new JTextFieldLimitNumberOnly(6));
		txtEndPosX.addMouseListener(new TextFieldHighlightListener());
		add(txtEndPosX);
		
		txtEndPosY = new JTextField();
		txtEndPosY.setBackground(Color.GRAY);
		txtEndPosY.setForeground(Color.WHITE);
		txtEndPosY.setBounds(278, 82, 40, 25);
		txtEndPosY.setColumns(4);
		txtEndPosY.setDocument(new JTextFieldLimitNumberOnly(6));
		txtEndPosY.addMouseListener(new TextFieldHighlightListener());
		add(txtEndPosY);
		
		JLabel lblNewLabel_1_2 = new JLabel("end size");
		lblNewLabel_1_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_2.setBounds(388, 152, 58, 25);
		add(lblNewLabel_1_2);
		
		txtEndSize = new JTextField();
		txtEndSize.setBackground(Color.GRAY);
		txtEndSize.setForeground(Color.WHITE);
		txtEndSize.setBounds(445, 152, 40, 25);
		txtEndSize.setColumns(4);
		txtEndSize.setDocument(new JTextFieldLimitNumberOnly(6));
		txtEndSize.addMouseListener(new TextFieldHighlightListener());
		add(txtEndSize);
		
		JLabel lblNewLabel_1_3 = new JLabel("start crops");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_3.setBounds(17, 152, 140, 25);
		add(lblNewLabel_1_3);
		
		txtStartCropTop = new JTextField();
		txtStartCropTop.setBackground(Color.GRAY);
		txtStartCropTop.setForeground(Color.WHITE);
		txtStartCropTop.setBounds(40, 183, 40, 25);
		txtStartCropTop.setColumns(4);
		txtStartCropTop.setDocument(new JTextFieldLimitNumberOnly(6));
		txtStartCropTop.addMouseListener(new TextFieldHighlightListener());
		add(txtStartCropTop);
		
		txtStartCropLeft = new JTextField();
		txtStartCropLeft.setBackground(Color.GRAY);
		txtStartCropLeft.setForeground(Color.WHITE);
		txtStartCropLeft.setBounds(40, 214, 40, 25);
		txtStartCropLeft.setColumns(4);
		txtStartCropLeft.setDocument(new JTextFieldLimitNumberOnly(6));
		txtStartCropLeft.addMouseListener(new TextFieldHighlightListener());
		add(txtStartCropLeft);
		
		txtStartCropRight = new JTextField();
		txtStartCropRight.setBackground(Color.GRAY);
		txtStartCropRight.setForeground(Color.WHITE);
		txtStartCropRight.setBounds(90, 214, 40, 25);
		txtStartCropRight.setColumns(4);
		txtStartCropRight.setDocument(new JTextFieldLimitNumberOnly(6));
		txtStartCropRight.addMouseListener(new TextFieldHighlightListener());
		add(txtStartCropRight);
		
		txtStartCropBottom = new JTextField();
		txtStartCropBottom.setBackground(Color.GRAY);
		txtStartCropBottom.setForeground(Color.WHITE);
		txtStartCropBottom.setBounds(90, 183, 40, 25);
		txtStartCropBottom.setColumns(4);
		txtStartCropBottom.setDocument(new JTextFieldLimitNumberOnly(6));
		txtStartCropBottom.addMouseListener(new TextFieldHighlightListener());
		add(txtStartCropBottom);
		
		JLabel lblNewLabel_1_1 = new JLabel("start size");
		lblNewLabel_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_1.setBounds(388, 118, 58, 25);
		add(lblNewLabel_1_1);
		
		txtStartSize = new JTextField();
		txtStartSize.setBackground(Color.GRAY);
		txtStartSize.setForeground(Color.WHITE);
		txtStartSize.setBounds(445, 118, 40, 25);
		txtStartSize.setColumns(4);
		txtStartSize.setDocument(new JTextFieldLimitNumberOnly(6));
		txtStartSize.addMouseListener(new TextFieldHighlightListener());
		add(txtStartSize);
		
		JLabel lblNewLabel_1_4 = new JLabel("end crops");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_4.setBounds(201, 152, 148, 25);
		add(lblNewLabel_1_4);
		
		txtEndCropTop = new JTextField();
		txtEndCropTop.setBackground(Color.GRAY);
		txtEndCropTop.setForeground(Color.WHITE);
		txtEndCropTop.setBounds(228, 183, 40, 25);
		txtEndCropTop.setColumns(4);
		txtEndCropTop.setDocument(new JTextFieldLimitNumberOnly(6));
		txtEndCropTop.addMouseListener(new TextFieldHighlightListener());
		add(txtEndCropTop);
		
		txtEndCropLeft = new JTextField();
		txtEndCropLeft.setBackground(Color.GRAY);
		txtEndCropLeft.setForeground(Color.WHITE);
		txtEndCropLeft.setBounds(228, 214, 40, 25);
		txtEndCropLeft.setColumns(4);
		txtEndCropLeft.setDocument(new JTextFieldLimitNumberOnly(6));
		txtEndCropLeft.addMouseListener(new TextFieldHighlightListener());
		add(txtEndCropLeft);
		
		txtEndCropRight = new JTextField();
		txtEndCropRight.setBackground(Color.GRAY);
		txtEndCropRight.setForeground(Color.WHITE);
		txtEndCropRight.setBounds(278, 214, 40, 25);
		txtEndCropRight.setColumns(4);
		txtEndCropRight.setDocument(new JTextFieldLimitNumberOnly(6));
		txtEndCropRight.addMouseListener(new TextFieldHighlightListener());
		add(txtEndCropRight);
		
		txtEndCropBottom = new JTextField();
		txtEndCropBottom.setBackground(Color.GRAY);
		txtEndCropBottom.setForeground(Color.WHITE);
		txtEndCropBottom.setBounds(278, 183, 40, 25);
		txtEndCropBottom.setColumns(4);
		txtEndCropBottom.setDocument(new JTextFieldLimitNumberOnly(6));
		txtEndCropBottom.addMouseListener(new TextFieldHighlightListener());
		add(txtEndCropBottom);
		
		JLabel lblNewLabel_1 = new JLabel("x");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(40, 67, 40, 14);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("y");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setBounds(90, 67, 43, 14);
		add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("y");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3.setBounds(278, 67, 40, 14);
		add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("x");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_4.setBounds(228, 67, 40, 14);
		add(lblNewLabel_4);
		
		chkEnableCrop = new JCheckBox("enable cropping");
		chkEnableCrop.setForeground(Color.WHITE);
		chkEnableCrop.setBackground(Color.DARK_GRAY);
		chkEnableCrop.setBounds(7, 122, 124, 23);
		add(chkEnableCrop);

		String[] inputSources = {"none", "Camera 1", "Camera 2", "Camera 3", "Camera 4", "Camera 5", "Camera 6", "Camera 7", "Camera 8", "Color 1", "Color 2", "Media Player 1", "Media Player 2"};
		comboInputSource = new JComboBox<String>();
		comboInputSource.setBackground(Color.WHITE);
		comboInputSource.setBounds(168, 7, 100, 22);
		comboInputSource.setModel(new DefaultComboBoxModel<String>(inputSources));
		add(comboInputSource);
		
		JLabel lblNewLabel_5 = new JLabel("top");
		lblNewLabel_5.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5.setBounds(17, 188, 23, 14);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("left");
		lblNewLabel_5_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_1.setBounds(17, 219, 30, 14);
		add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("bot");
		lblNewLabel_5_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_2.setBounds(140, 188, 30, 14);
		add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("right");
		lblNewLabel_5_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_3.setBounds(140, 219, 30, 14);
		add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("left");
		lblNewLabel_5_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_1_1.setBounds(201, 219, 30, 14);
		add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_4 = new JLabel("top");
		lblNewLabel_5_4.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_4.setBounds(201, 188, 30, 14);
		add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("right");
		lblNewLabel_5_3_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_3_1.setBounds(328, 219, 30, 14);
		add(lblNewLabel_5_3_1);
		
		JButton btnSwitch = new JButton("reverse");
		btnSwitch.setBounds(415, 9, 70, 20);
		add(btnSwitch);
		
		lblSource = new JLabel("source:");
		lblSource.setForeground(Color.LIGHT_GRAY);
		lblSource.setBounds(125, 11, 46, 14);
		add(lblSource);
		
		lblNewLabel_5_5 = new JLabel("bot");
		lblNewLabel_5_5.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_5.setBounds(328, 188, 30, 14);
		add(lblNewLabel_5_5);
		
		btnSwitch.addActionListener(e -> {
			//position
			String tmp = this.txtStartPosX.getText();
			this.txtStartPosX.setText(this.txtEndPosX.getText());
			this.txtEndPosX.setText(tmp);
			tmp = this.txtStartPosY.getText();
			this.txtStartPosY.setText(this.txtEndPosY.getText());
			this.txtEndPosY.setText(tmp);
			
			//size
			tmp = this.txtStartSize.getText();
			this.txtStartSize.setText(this.txtEndSize.getText());
			this.txtEndSize.setText(tmp);
			
			//crop
			tmp = this.txtStartCropTop.getText();
			this.txtStartCropTop.setText(this.txtEndCropTop.getText());
			this.txtEndCropTop.setText(tmp);

			tmp = this.txtStartCropLeft.getText();
			this.txtStartCropLeft.setText(this.txtEndCropLeft.getText());
			this.txtEndCropLeft.setText(tmp);
			
			tmp = this.txtStartCropRight.getText();
			this.txtStartCropRight.setText(this.txtEndCropRight.getText());
			this.txtEndCropRight.setText(tmp);

			tmp = this.txtStartCropBottom.getText();
			this.txtStartCropBottom.setText(this.txtEndCropBottom.getText());
			this.txtEndCropBottom.setText(tmp);
		});

	}

	public SourceBox getSourceBox() {
		
		boolean enabled = this.chkEnableBox.isSelected();
		
		String inputSource = (String) this.comboInputSource.getSelectedItem();
		
		Position startPos = new Position(
				this.txtStartPosX.getText().equals("") ? 0.0f : Float.parseFloat(this.txtStartPosX.getText()),
				this.txtStartPosY.getText().equals("") ? 0.0f : Float.parseFloat(this.txtStartPosY.getText()));
		Position endPos = new Position(
				this.txtEndPosX.getText().equals("") ? 0.0f : Float.parseFloat(this.txtEndPosX.getText()),
				this.txtEndPosY.getText().equals("") ? 0.0f : Float.parseFloat(this.txtEndPosY.getText()));

		float startSize = this.txtStartSize.getText().equals("") ? 0.0f : Float.parseFloat(this.txtStartSize.getText());
		float endSize = this.txtEndSize.getText().equals("") ? 0.0f : Float.parseFloat(this.txtEndSize.getText());

		boolean cropEnabled = this.chkEnableCrop.isSelected();

		Crop startCrop = new Crop(
				this.txtStartCropTop.getText().equals("") ? 0.0f : Float.parseFloat(this.txtStartCropTop.getText()),
				this.txtStartCropLeft.getText().equals("") ? 0.0f : Float.parseFloat(this.txtStartCropLeft.getText()),
				this.txtStartCropRight.getText().equals("") ? 0.0f : Float.parseFloat(this.txtStartCropRight.getText()),
				this.txtStartCropBottom.getText().equals("") ? 0.0f : Float.parseFloat(this.txtStartCropBottom.getText()));
		Crop endCrop = new Crop(
				this.txtEndCropTop.getText().equals("") ? 0.0f : Float.parseFloat(this.txtEndCropTop.getText()),
				this.txtEndCropLeft.getText().equals("") ? 0.0f : Float.parseFloat(this.txtEndCropLeft.getText()),
				this.txtEndCropRight.getText().equals("") ? 0.0f : Float.parseFloat(this.txtEndCropRight.getText()),
				this.txtEndCropBottom.getText().equals("") ? 0.0f : Float.parseFloat(this.txtEndCropBottom.getText()));

		return new SourceBox(this.index, enabled, inputSource, startPos, endPos, startSize, endSize, cropEnabled, startCrop, endCrop);
	}
	
	public void loadSourceBox(SourceBox sourceBox) {
		this.chkEnableBox.setSelected(sourceBox.isEnabled());
		this.comboInputSource.setSelectedItem(getInputSourceDisplayName(sourceBox.getInputSource()));
		this.txtStartPosX.setText(sourceBox.getStartPosition().getX()+"");
		this.txtStartPosY.setText(sourceBox.getStartPosition().getY()+"");
		this.txtEndPosX.setText(sourceBox.getEndPosition().getX()+"");
		this.txtEndPosY.setText(sourceBox.getEndPosition().getY()+"");
		this.txtStartSize.setText(sourceBox.getStartSize()+"");
		this.txtEndSize.setText(sourceBox.getEndSize()+"");
		this.chkEnableCrop.setSelected(sourceBox.isCropEnabled());
		this.txtStartCropTop.setText(sourceBox.getStartCrop().getTop()+"");
		this.txtStartCropLeft.setText(sourceBox.getStartCrop().getLeft()+"");
		this.txtStartCropRight.setText(sourceBox.getStartCrop().getRight()+"");
		this.txtStartCropBottom.setText(sourceBox.getStartCrop().getBottom()+"");
		this.txtEndCropTop.setText(sourceBox.getEndCrop().getTop()+"");
		this.txtEndCropLeft.setText(sourceBox.getEndCrop().getLeft()+"");
		this.txtEndCropRight.setText(sourceBox.getEndCrop().getRight()+"");
		this.txtEndCropBottom.setText(sourceBox.getEndCrop().getBottom()+"");
	}
	
	private String getInputSourceDisplayName(String inputSource) {
		if(inputSource.equals("Camera1")) return "Camera 1";
		if(inputSource.equals("Camera2")) return "Camera 2";
		if(inputSource.equals("Camera3")) return "Camera 3";
		if(inputSource.equals("Camera4")) return "Camera 4";
		if(inputSource.equals("Camera5")) return "Camera 5";
		if(inputSource.equals("Camera6")) return "Camera 6";
		if(inputSource.equals("Camera7")) return "Camera 7";
		if(inputSource.equals("Camera8")) return "Camera 8";
		if(inputSource.equals("Color1")) return "Color 1";
		if(inputSource.equals("Color2")) return "Color 2";
		if(inputSource.equals("MediaPlayer1")) return "Media Player 1";
		if(inputSource.equals("MediaPlayer2")) return "Media Player 2";

		return "none";
	}
}
