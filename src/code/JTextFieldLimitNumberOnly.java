package code;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

/*
 * https://stackoverflow.com/questions/8737227/how-to-allow-only-floats-in-a-jtextfield-in-java
 */
public class JTextFieldLimitNumberOnly extends JTextFieldLimit {

	private static final long serialVersionUID = 1L;
	
	public JTextFieldLimitNumberOnly(int limit) {
		super(limit);
	}
	
	public boolean isValidNumberString(String str) {
		return str.matches("\\d+|\\.|\\+|-");
	}

   public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
      if (str == null)
         return;
      if (isValidNumberString(str)) {
         super.insertString(offset, str, attr);
      }
   }
}
