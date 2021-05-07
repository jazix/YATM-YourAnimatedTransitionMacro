package code;

import java.util.List;

public class MacroSettings {
	
	private int index, frameCount;
	private String title, description;
	private List<SourceBox> sourceBoxes;
	
	public MacroSettings(int index, String title, String description, int frameCount, List<SourceBox> sourceBoxes) {
		this.index = index;
		this.title = title;
		this.description = description;
		this.frameCount = frameCount;
		this.sourceBoxes = sourceBoxes;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public int getFrameCount() {
		return this.frameCount;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public List<SourceBox> getSourceBoxes(){
		return this.sourceBoxes;
	}
}
