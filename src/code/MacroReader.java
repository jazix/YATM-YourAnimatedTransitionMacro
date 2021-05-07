package code;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

public class MacroReader {
	
	public MacroReader() {
		
	}
	
	/*
	 * https://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm
	 */
	public MacroSettings read(File fileToRead) {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		Document doc;
		try {
	        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	        doc = dBuilder.parse(fileToRead);	
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
        
        doc.getDocumentElement().normalize();
		
        NodeList nList = doc.getElementsByTagName("Macro");
        if(nList.getLength() < 1) return null;
        
        Node nNode = nList.item(0);        
        
        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) nNode;
            String index = element.getAttribute("index");
        }
		//TODO
		//read header
			//index
			//title
			//desc
			//enabled cams
			//enabled crops
			//inputSources
		//count frames
		//read first frame
		//read last frame
		
		return new MacroSettings(1, "", "", 1, new ArrayList<SourceBox>());
	}
}
