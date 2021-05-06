package code;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

public class SourceBoxPanel extends JPanel {

	/**
	 * 
	 */
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

	/**
	 * Create the panel.
	 */
	public SourceBoxPanel() {
		setBackground(Color.DARK_GRAY);
		setBorder(new LineBorder(Color.GRAY));
		setLayout(null);
		
		chkEnableBox = new JCheckBox("enable Box");
		chkEnableBox.setForeground(Color.WHITE);
		chkEnableBox.setBackground(Color.DARK_GRAY);
		chkEnableBox.setBounds(7, 7, 116, 25);
		add(chkEnableBox);
		
		JLabel lblNewLabel = new JLabel("start position");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(30, 35, 93, 25);
		add(lblNewLabel);
		
		txtStartPosX = new JTextField();
		txtStartPosX.setBounds(40, 78, 30, 25);
		add(txtStartPosX);
		txtStartPosX.setColumns(2);
		
		txtStartPosY = new JTextField();
		txtStartPosY.setBounds(80, 78, 30, 25);
		txtStartPosY.setColumns(4);
		add(txtStartPosY);
		
		JLabel lblEndPosition = new JLabel("end position");
		lblEndPosition.setForeground(Color.LIGHT_GRAY);
		lblEndPosition.setBounds(142, 35, 82, 25);
		add(lblEndPosition);
		
		txtEndPosX = new JTextField();
		txtEndPosX.setBounds(152, 78, 30, 25);
		txtEndPosX.setColumns(4);
		add(txtEndPosX);
		
		txtEndPosY = new JTextField();
		txtEndPosY.setBounds(192, 78, 30, 25);
		txtEndPosY.setColumns(4);
		add(txtEndPosY);
		
		JLabel lblNewLabel_1_2 = new JLabel("end size");
		lblNewLabel_1_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_2.setBounds(276, 78, 58, 25);
		add(lblNewLabel_1_2);
		
		txtEndSize = new JTextField();
		txtEndSize.setBounds(344, 78, 30, 25);
		txtEndSize.setColumns(4);
		add(txtEndSize);
		
		JLabel lblNewLabel_1_3 = new JLabel("start crops");
		lblNewLabel_1_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_3.setBounds(40, 152, 96, 25);
		add(lblNewLabel_1_3);
		
		txtStartCropTop = new JTextField();
		txtStartCropTop.setBounds(80, 183, 30, 25);
		txtStartCropTop.setColumns(4);
		add(txtStartCropTop);
		
		txtStartCropLeft = new JTextField();
		txtStartCropLeft.setBounds(80, 214, 30, 25);
		txtStartCropLeft.setColumns(4);
		add(txtStartCropLeft);
		
		txtStartCropRight = new JTextField();
		txtStartCropRight.setBounds(170, 214, 30, 25);
		txtStartCropRight.setColumns(4);
		add(txtStartCropRight);
		
		txtStartCropBottom = new JTextField();
		txtStartCropBottom.setBounds(170, 183, 30, 25);
		txtStartCropBottom.setColumns(4);
		add(txtStartCropBottom);
		
		JLabel lblNewLabel_1_1 = new JLabel("start size");
		lblNewLabel_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_1.setBounds(276, 35, 58, 25);
		add(lblNewLabel_1_1);
		
		txtStartSize = new JTextField();
		txtStartSize.setBounds(344, 35, 30, 25);
		txtStartSize.setColumns(4);
		add(txtStartSize);
		
		JLabel lblNewLabel_1_4 = new JLabel("end crops");
		lblNewLabel_1_4.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_4.setBounds(227, 152, 96, 25);
		add(lblNewLabel_1_4);
		
		txtEndCropTop = new JTextField();
		txtEndCropTop.setBounds(269, 183, 30, 25);
		txtEndCropTop.setColumns(4);
		add(txtEndCropTop);
		
		txtEndCropLeft = new JTextField();
		txtEndCropLeft.setBounds(269, 214, 30, 25);
		txtEndCropLeft.setColumns(4);
		add(txtEndCropLeft);
		
		txtEndCropRight = new JTextField();
		txtEndCropRight.setBounds(357, 214, 30, 25);
		txtEndCropRight.setColumns(4);
		add(txtEndCropRight);
		
		txtEndCropBottom = new JTextField();
		txtEndCropBottom.setBounds(357, 183, 30, 25);
		txtEndCropBottom.setColumns(4);
		add(txtEndCropBottom);
		
		JLabel lblNewLabel_1 = new JLabel("x");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(40, 63, 30, 14);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("y");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setBounds(80, 63, 30, 14);
		add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("y");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3.setBounds(192, 63, 30, 14);
		add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("x");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_4.setBounds(152, 63, 30, 14);
		add(lblNewLabel_4);
		
		chkEnableCrop = new JCheckBox("enable cropping");
		chkEnableCrop.setForeground(Color.WHITE);
		chkEnableCrop.setBackground(Color.DARK_GRAY);
		chkEnableCrop.setBounds(27, 122, 124, 23);
		add(chkEnableCrop);
		
		JLabel lblNewLabel_5 = new JLabel("top");
		lblNewLabel_5.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_5.setBounds(50, 188, 30, 14);
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

	}

	@Override
	public String toString() {
		return "test";
	}

	public SourceBox getSourceBox(int index) {
		return new SourceBox(
				index,
				this.chkEnableBox.isSelected(),
				new Position(Float.parseFloat(this.txtStartPosX.getText()),Float.parseFloat(this.txtStartPosY.getText())),
				new Position(Float.parseFloat(this.txtEndPosX.getText()),Float.parseFloat(this.txtEndPosY.getText())),
				Float.parseFloat(this.txtStartSize.getText()),
				Float.parseFloat(this.txtEndSize.getText()),
				this.chkEnableCrop.isSelected(),
				new Crop(Float.parseFloat(this.txtStartCropTop.getText()),Float.parseFloat(this.txtStartCropLeft.getText()),Float.parseFloat(this.txtStartCropRight.getText()),Float.parseFloat(this.txtStartCropBottom.getText())),
				new Crop(Float.parseFloat(this.txtEndCropTop.getText()),Float.parseFloat(this.txtEndCropLeft.getText()),Float.parseFloat(this.txtEndCropRight.getText()),Float.parseFloat(this.txtEndCropBottom.getText()))
			);
	}
}
