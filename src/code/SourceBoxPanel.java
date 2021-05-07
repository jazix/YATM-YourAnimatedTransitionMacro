package code;

import javax.swing.JPanel;
import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
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
	private int index = 0;

	/**
	 * Create the panel.
	 */
	public SourceBoxPanel(int index) {
		
		this.index = index;
		setBackground(Color.DARK_GRAY);
		setBorder(new LineBorder(Color.GRAY));
		setLayout(null);
		
		chkEnableBox = new JCheckBox("enable Box "+index);
		chkEnableBox.setForeground(Color.WHITE);
		chkEnableBox.setBackground(Color.DARK_GRAY);
		chkEnableBox.setBounds(7, 7, 116, 25);
		add(chkEnableBox);
		
		JLabel lblNewLabel = new JLabel("start position");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(30, 35, 93, 25);
		add(lblNewLabel);
		
		txtStartPosX = new JTextField();
		txtStartPosX.setBounds(30, 78, 40, 25);
		add(txtStartPosX);
		txtStartPosX.setDocument(new JTextFieldLimitNumberOnly(6));
		txtStartPosX.setColumns(2);
		
		txtStartPosY = new JTextField();
		txtStartPosY.setBounds(80, 78, 40, 25);
		txtStartPosY.setColumns(4);
		txtStartPosY.setDocument(new JTextFieldLimitNumberOnly(6));
		add(txtStartPosY);
		
		JLabel lblEndPosition = new JLabel("end position");
		lblEndPosition.setForeground(Color.LIGHT_GRAY);
		lblEndPosition.setBounds(142, 35, 82, 25);
		add(lblEndPosition);
		
		txtEndPosX = new JTextField();
		txtEndPosX.setBounds(142, 78, 40, 25);
		txtEndPosX.setColumns(4);
		txtEndPosX.setDocument(new JTextFieldLimitNumberOnly(6));
		add(txtEndPosX);
		
		txtEndPosY = new JTextField();
		txtEndPosY.setBounds(192, 78, 40, 25);
		txtEndPosY.setColumns(4);
		txtEndPosY.setDocument(new JTextFieldLimitNumberOnly(6));
		add(txtEndPosY);
		
		JLabel lblNewLabel_1_2 = new JLabel("end size");
		lblNewLabel_1_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_2.setBounds(276, 78, 58, 25);
		add(lblNewLabel_1_2);
		
		txtEndSize = new JTextField();
		txtEndSize.setBounds(333, 78, 40, 25);
		txtEndSize.setColumns(4);
		txtEndSize.setDocument(new JTextFieldLimitNumberOnly(6));
		add(txtEndSize);
		
		JLabel lblNewLabel_1_3 = new JLabel("start crops");
		lblNewLabel_1_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_3.setBounds(40, 152, 96, 25);
		add(lblNewLabel_1_3);
		
		txtStartCropTop = new JTextField();
		txtStartCropTop.setBounds(70, 183, 40, 25);
		txtStartCropTop.setColumns(4);
		txtStartCropTop.setDocument(new JTextFieldLimitNumberOnly(6));
		add(txtStartCropTop);
		
		txtStartCropLeft = new JTextField();
		txtStartCropLeft.setBounds(70, 214, 40, 25);
		txtStartCropLeft.setColumns(4);
		txtStartCropLeft.setDocument(new JTextFieldLimitNumberOnly(6));
		add(txtStartCropLeft);
		
		txtStartCropRight = new JTextField();
		txtStartCropRight.setBounds(159, 214, 40, 25);
		txtStartCropRight.setColumns(4);
		txtStartCropRight.setDocument(new JTextFieldLimitNumberOnly(6));
		add(txtStartCropRight);
		
		txtStartCropBottom = new JTextField();
		txtStartCropBottom.setBounds(159, 183, 40, 25);
		txtStartCropBottom.setColumns(4);
		txtStartCropBottom.setDocument(new JTextFieldLimitNumberOnly(6));
		add(txtStartCropBottom);
		
		JLabel lblNewLabel_1_1 = new JLabel("start size");
		lblNewLabel_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_1.setBounds(276, 35, 58, 25);
		add(lblNewLabel_1_1);
		
		txtStartSize = new JTextField();
		txtStartSize.setBounds(333, 35, 40, 25);
		txtStartSize.setColumns(4);
		txtStartSize.setDocument(new JTextFieldLimitNumberOnly(6));
		add(txtStartSize);
		
		JLabel lblNewLabel_1_4 = new JLabel("end crops");
		lblNewLabel_1_4.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_4.setBounds(227, 152, 96, 25);
		add(lblNewLabel_1_4);
		
		txtEndCropTop = new JTextField();
		txtEndCropTop.setBounds(258, 183, 40, 25);
		txtEndCropTop.setColumns(4);
		txtEndCropTop.setDocument(new JTextFieldLimitNumberOnly(6));
		add(txtEndCropTop);
		
		txtEndCropLeft = new JTextField();
		txtEndCropLeft.setBounds(258, 214, 40, 25);
		txtEndCropLeft.setColumns(4);
		txtEndCropLeft.setDocument(new JTextFieldLimitNumberOnly(6));
		add(txtEndCropLeft);
		
		txtEndCropRight = new JTextField();
		txtEndCropRight.setBounds(347, 214, 40, 25);
		txtEndCropRight.setColumns(4);
		txtEndCropRight.setDocument(new JTextFieldLimitNumberOnly(6));
		add(txtEndCropRight);
		
		txtEndCropBottom = new JTextField();
		txtEndCropBottom.setBounds(347, 183, 40, 25);
		txtEndCropBottom.setColumns(4);
		txtEndCropBottom.setDocument(new JTextFieldLimitNumberOnly(6));
		add(txtEndCropBottom);
		
		JLabel lblNewLabel_1 = new JLabel("x");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(30, 63, 40, 14);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("y");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setBounds(80, 63, 43, 14);
		add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("y");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3.setBounds(192, 63, 40, 14);
		add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("x");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_4.setBounds(142, 63, 40, 14);
		add(lblNewLabel_4);
		
		chkEnableCrop = new JCheckBox("enable cropping");
		chkEnableCrop.setForeground(Color.WHITE);
		chkEnableCrop.setBackground(Color.DARK_GRAY);
		chkEnableCrop.setBounds(27, 122, 124, 23);
		add(chkEnableCrop);
		
		JLabel lblNewLabel_5 = new JLabel("top");
		lblNewLabel_5.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5.setBounds(50, 188, 23, 14);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("left");
		lblNewLabel_5_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_1.setBounds(50, 219, 30, 14);
		add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("bottom");
		lblNewLabel_5_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_2.setBounds(121, 188, 43, 14);
		add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("right");
		lblNewLabel_5_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_3.setBounds(121, 219, 30, 14);
		add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("left");
		lblNewLabel_5_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_1_1.setBounds(238, 219, 30, 14);
		add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_4 = new JLabel("top");
		lblNewLabel_5_4.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_4.setBounds(238, 188, 30, 14);
		add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("bottom");
		lblNewLabel_5_2_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_2_1.setBounds(309, 188, 43, 14);
		add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("right");
		lblNewLabel_5_3_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5_3_1.setBounds(309, 219, 30, 14);
		add(lblNewLabel_5_3_1);
		
		JButton btnSwitch = new JButton("switch");
		btnSwitch.setBounds(121, 8, 89, 23);
		add(btnSwitch);
		
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

		return new SourceBox(this.index, enabled, startPos, endPos, startSize, endSize, cropEnabled, startCrop, endCrop);
	}
}
