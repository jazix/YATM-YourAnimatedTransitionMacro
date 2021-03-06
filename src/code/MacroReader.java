package code;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MacroReader {
	
	public MacroReader() {
		
	}
	
	/*
	 * https://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm
	 */
	public MacroSettings read(File fileToRead) {
		//setup
		int index = 0;
		String title = null, description = "";
		List<SourceBox> sourceBoxes = new ArrayList<SourceBox>(4);
		for(int i = 0; i<4; i++) {
			sourceBoxes.add(0, new SourceBox(i, false, "none", new Position(0,0), new Position(0,0), 0, 0, false, new Crop(0,0,0,0), new Crop(0,0,0,0)));
		}
		
		//read File
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get(fileToRead.getAbsolutePath()));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
		//parse File
		String line = "";
		int countSleepTags = 0;
		int countSleepFrames = 0;
		for(int i = 0; i < lines.size() ; i++) {
			line = lines.get(i);

			//find Header
			if(line.matches("<Macro\\s.*>")) {
				index = Integer.parseInt(getAttributeValue("index",line));
				title = getAttributeValue("name",line);
				description = getAttributeValue("description",line);
				continue;
			}

			//find sleep frames
			if(line.matches(".*MacroSleep.*")) {
				countSleepFrames += Integer.parseInt(getAttributeValue("frames",line));
				countSleepTags++;
				continue;
			}
			
			//find enable box
			if(line.matches(".*SuperSourceV2BoxEnable.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				boolean enabled = getAttributeValue("enable",line).equalsIgnoreCase("true");
				sourceBoxes.get(boxIndex).setEnabled(enabled);
				continue;
			}
			
			//find enable crops
			if(line.matches(".*SuperSourceV2BoxMaskEnable.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				boolean enabled = getAttributeValue("enable",line).equalsIgnoreCase("true");
				sourceBoxes.get(boxIndex).setEnableCrop(enabled);
				continue;
			}
			
			//find inputSources
			if(line.matches(".*SuperSourceV2BoxInput.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				String input = getAttributeValue("input",line);
				sourceBoxes.get(boxIndex).setInputSource(input);
				continue;
			}
		}
				
		readTransition(lines, sourceBoxes);
		
		return new MacroSettings(index, title, description, countSleepTags, sourceBoxes);
	}
	
	public void readTransition(List<String> lines, List<SourceBox> sourceBoxes) {
		String line = "";
		//save first occurencies for start values
		for(int i = lines.size()-1; i > 0 ; i--) {
			line = lines.get(i);

			//Position X
			if(line.matches(".*SuperSourceV2BoxXPosition.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				float posX = Float.parseFloat(getAttributeValue("xPosition",line));
				sourceBoxes.get(boxIndex).getStartPosition().setX(posX);
				continue;
			}
			
			//Position Y
			if(line.matches(".*SuperSourceV2BoxYPosition.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				float posY = Float.parseFloat(getAttributeValue("yPosition",line));
				sourceBoxes.get(boxIndex).getStartPosition().setY(posY);
				continue;
			}
			
			//Size
			if(line.matches(".*SuperSourceV2BoxSize.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				float size = Float.parseFloat(getAttributeValue("size",line));
				sourceBoxes.get(boxIndex).setStartSize(size);
				continue;
			}
			
			//CropTop
			if(line.matches(".*SuperSourceV2BoxMaskTop.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				float top = Float.parseFloat(getAttributeValue("top",line));
				sourceBoxes.get(boxIndex).getStartCrop().setTop(top);
				continue;
			}
			
			//CropLeft
			if(line.matches(".*SuperSourceV2BoxMaskLeft.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				float left = Float.parseFloat(getAttributeValue("left",line));
				sourceBoxes.get(boxIndex).getStartCrop().setLeft(left);
				continue;
			}
			
			//CropRight
			if(line.matches(".*SuperSourceV2BoxMaskRight.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				float right = Float.parseFloat(getAttributeValue("right",line));
				sourceBoxes.get(boxIndex).getStartCrop().setRight(right);
				continue;
			}
			
			//CropBottom
			if(line.matches(".*SuperSourceV2BoxMaskBottom.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				float bottom = Float.parseFloat(getAttributeValue("bottom",line));
				sourceBoxes.get(boxIndex).getStartCrop().setBottom(bottom);
				continue;
			}
		}
		
			
		//save last occurencies for end values
		for(int i = 0; i < lines.size() ; i++) {
			line = lines.get(i);
			
			//Position X
			if(line.matches(".*SuperSourceV2BoxXPosition.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				float posX = Float.parseFloat(getAttributeValue("xPosition",line));
				sourceBoxes.get(boxIndex).getEndPosition().setX(posX);
				continue;
			}
			
			//Position Y
			if(line.matches(".*SuperSourceV2BoxYPosition.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				float posY = Float.parseFloat(getAttributeValue("yPosition",line));
				sourceBoxes.get(boxIndex).getEndPosition().setY(posY);
				continue;
			}
			
			//Size
			if(line.matches(".*SuperSourceV2BoxSize.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				float size = Float.parseFloat(getAttributeValue("size",line));
				sourceBoxes.get(boxIndex).setEndSize(size);
				continue;
			}
			
			//CropTop
			if(line.matches(".*SuperSourceV2BoxMaskTop.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				float top = Float.parseFloat(getAttributeValue("top",line));
				sourceBoxes.get(boxIndex).getEndCrop().setTop(top);
				continue;
			}
			
			//CropLeft
			if(line.matches(".*SuperSourceV2BoxMaskLeft.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				float left = Float.parseFloat(getAttributeValue("left",line));
				sourceBoxes.get(boxIndex).getEndCrop().setLeft(left);
				continue;
			}
			
			//CropRight
			if(line.matches(".*SuperSourceV2BoxMaskRight.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				float right = Float.parseFloat(getAttributeValue("right",line));
				sourceBoxes.get(boxIndex).getEndCrop().setRight(right);
				continue;
			}
			
			//CropBottom
			if(line.matches(".*SuperSourceV2BoxMaskBottom.*")) {
				int boxIndex = Integer.parseInt(getAttributeValue("boxIndex",line));
				float bottom = Float.parseFloat(getAttributeValue("bottom",line));
				sourceBoxes.get(boxIndex).getEndCrop().setBottom(bottom);
				continue;
			}
		}
	}
	
	public String getAttributeValue(String attribute, String line) {
		
		String searchString = attribute+"=\"(.*?)\"";
		Pattern pattern = Pattern.compile(searchString);
		Matcher matcher = pattern.matcher(line);
		
		if(matcher.find()) {
			return matcher.group(1);
		}
		return "";
	}
	
}
