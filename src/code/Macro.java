package code;

import java.util.List;

public class Macro {
	
	private String title, description;
	private List<SourceBox> sourceBoxes;
	private int frameCount, index;
	
	public Macro(int index, String title, String description, List<SourceBox> sourceBoxes, int frameCount) {
		this.index = index;
		this.title = title;
		this.description = description;
		this.sourceBoxes = sourceBoxes;
		this.frameCount = frameCount;
		this.index = index;
	}
	
	
	public String generate() {
		//header
		String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
				+ "<Profile majorVersion=\"1\" minorVersion=\"5\" product=\"ATEM Mini Extreme\">\r\n"
				+ "<MacroPool>\r\n"
				+ "<Macro index=\""+index+"\" name=\""+title+"\" description=\""+description+"\">";
		
		//enable boxes
		for(SourceBox box : sourceBoxes) {
			result += "\r\n<Op id=\"SuperSourceV2BoxEnable\" superSource=\"0\" boxIndex=\""+box.getIndex()+"\" enable=\""+box.isEnabled()+"\"/>";
		}
		
		//enable cropping
		for(SourceBox box : sourceBoxes) {
			result += "\r\n<Op id=\"SuperSourceV2BoxMaskEnable\" superSource=\"0\" boxIndex=\""+box.getIndex()+"\" enable=\""+box.isCropEnabled()+"\"/>";
		}
		
		//calculate frames
		for(SourceBox box : sourceBoxes) {
			box.calculateFrames(frameCount);
		}
			
		//generate frames
		for(int i = 0; i < frameCount ; i++) {
			for(SourceBox box : sourceBoxes) {
				Crop crop = box.getCrop(i);
				Position pos = box.getPosition(i);
				result += "\r\n<Op id=\"SuperSourceV2BoxXPosition\" superSource=\"0\" boxIndex=\""+box.getIndex()+"\" xPosition=\""+pos.getX()+"\"/>"
						+ "\r\n<Op id=\"SuperSourceV2BoxYPosition\" superSource=\"0\" boxIndex=\""+box.getIndex()+"\" yPosition=\""+pos.getY()+"\"/>"
						+ "\r\n<Op id=\"SuperSourceV2BoxSize\" superSource=\"0\" boxIndex=\""+box.getIndex()+"\" size=\""+box.getSize(i)+"\"/>"
						+ "\r\n<Op id=\"SuperSourceV2BoxMaskTop\" superSource=\"0\" boxIndex=\""+box.getIndex()+"\" top=\""+crop.getTop()+"\"/>"
						+ "\r\n<Op id=\"SuperSourceV2BoxMaskLeft\" superSource=\"0\" boxIndex=\""+box.getIndex()+"\" left=\""+crop.getLeft()+"\"/>"
						+ "\r\n<Op id=\"SuperSourceV2BoxMaskRight\" superSource=\"0\" boxIndex=\""+box.getIndex()+"\" right=\""+crop.getRight()+"\"/>"
						+ "\r\n<Op id=\"SuperSourceV2BoxMaskBottom\" superSource=\"0\" boxIndex=\""+box.getIndex()+"\" bottom=\""+crop.getBottom()+"\"/>"
						+ "";
			}
			
			result += "\r\n<Op id=\"MacroSleep\" frames=\"1\"/>";
		}
		
		result += "\r\n</Macro>";
		return result;
	}
	
}
