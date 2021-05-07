package code;

import java.awt.Color;
import java.awt.event.MouseAdapter;

import javax.swing.JComponent;

public class TextFieldHighlightListener extends MouseAdapter{

    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {
    	((JComponent)evt.getSource()).setBackground(new Color(160,160,160));
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
    	((JComponent)evt.getSource()).setBackground(Color.GRAY);
    }
}
