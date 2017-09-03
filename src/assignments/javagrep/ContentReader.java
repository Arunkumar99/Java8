package assignments.javagrep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ContentReader {
	private ArrayList<String> content = new ArrayList<String>();
	private ArrayList<String> metacontent = new ArrayList<String>();
	private String inputarg = new String();

	public ContentReader(String inarg){
		super();
		this.inputarg = inarg;
	}

	private ArrayList<String> readFile(File file) {
		Integer lineNumber = new Integer(0);
		try {
			String filePath = file.getCanonicalPath();
			BufferedReader fr = new BufferedReader(new FileReader(filePath));
			ArrayList<String> lines = new ArrayList<String>();
			String line = new String();
			while ((line=fr.readLine()) != null) { 
				lines.add(line);
				metacontent.add(file.getName()+" ["+(++lineNumber)+"] "+" ("+file.length()+" bytes)");
			}
			fr.close();
			return lines;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private File[] listDirectory(File file) {
		return file.listFiles();
	}

	private ArrayList<String> readDirectory(File file) {
		for(File f:listDirectory(file)) {
			content.addAll(readFile(f));
		}
		return content;
	}

	public ArrayList<String> readContent() {
		File file = new File(inputarg);
		if(file.isDirectory()) {
			 return readDirectory(file);
		}
		else {
			return readFile(file);
		}
	}
	
	public ArrayList<String> readMetaContent(){
		return metacontent;
		
	}
	
}
