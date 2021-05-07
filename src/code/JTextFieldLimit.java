package code;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/*
 * https://www.tutorialspoint.com/how-can-we-limit-the-number-of-characters-inside-a-jtextfield-in-java
 */
public class JTextFieldLimit extends PlainDocument{

	private static final long serialVersionUID = 1L;
	private int limit;
	   JTextFieldLimit(int limit) {
	      super();
	      this.limit = limit;
	   }
	   JTextFieldLimit(int limit, boolean upper) {
	      super();
	      this.limit = limit;
	   }
	   public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
	      if (str == null)
	         return;
	      if ((getLength() + str.length()) <= limit) {
	         super.insertString(offset, str, attr);
	      }
	   }
}
