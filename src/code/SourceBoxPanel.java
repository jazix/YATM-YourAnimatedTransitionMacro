package code;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JTextField;

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

	/**
	 * Create the panel.
	 */
	public SourceBoxPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblNewLabel = new JLabel("start position");
		add(lblNewLabel);
		
		txtStartPosX = new JTextField();
		add(txtStartPosX);
		txtStartPosX.setColumns(4);
		
		txtStartPosY = new JTextField();
		txtStartPosY.setColumns(4);
		add(txtStartPosY);
		
		JLabel lblEndPosition = new JLabel("end position");
		add(lblEndPosition);
		
		txtEndPosX = new JTextField();
		txtEndPosX.setColumns(4);
		add(txtEndPosX);
		
		txtEndPosY = new JTextField();
		txtEndPosY.setColumns(4);
		add(txtEndPosY);
		
		JLabel lblNewLabel_1_1 = new JLabel("start size");
		add(lblNewLabel_1_1);
		
		txtStartSize = new JTextField();
		txtStartSize.setColumns(4);
		add(txtStartSize);
		
		JLabel lblNewLabel_1_2 = new JLabel("end size");
		add(lblNewLabel_1_2);
		
		txtEndSize = new JTextField();
		txtEndSize.setColumns(4);
		add(txtEndSize);
		
		JLabel lblNewLabel_1_3 = new JLabel("start crop");
		add(lblNewLabel_1_3);
		
		txtStartCropTop = new JTextField();
		txtStartCropTop.setColumns(4);
		add(txtStartCropTop);
		
		txtStartCropLeft = new JTextField();
		txtStartCropLeft.setColumns(4);
		add(txtStartCropLeft);
		
		txtStartCropRight = new JTextField();
		txtStartCropRight.setColumns(4);
		add(txtStartCropRight);
		
		txtStartCropBottom = new JTextField();
		txtStartCropBottom.setColumns(4);
		add(txtStartCropBottom);
		
		JLabel lblNewLabel_1_4 = new JLabel("end crop");
		add(lblNewLabel_1_4);
		
		txtEndCropTop = new JTextField();
		txtEndCropTop.setColumns(4);
		add(txtEndCropTop);
		
		txtEndCropLeft = new JTextField();
		txtEndCropLeft.setColumns(4);
		add(txtEndCropLeft);
		
		txtEndCropRight = new JTextField();
		txtEndCropRight.setColumns(4);
		add(txtEndCropRight);
		
		txtEndCropBottom = new JTextField();
		txtEndCropBottom.setColumns(4);
		add(txtEndCropBottom);

	}

	@Override
	public String toString() {
		return "test";
	}

	@Override
	public Dimension getMaximumSize() {
		return new Dimension(1400,30);
	}
	
	public static Component getHeader() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(new JLabel("Startpos x y"));
		panel.add(new JLabel("Endpos x y"));
		panel.add(new JLabel("Startsize"));
		panel.add(new JLabel("Endsize"));
		panel.add(new JLabel("Startcrop t l r b"));
		panel.add(new JLabel("Endcrop t l r b"));
		return panel;
	}
}
