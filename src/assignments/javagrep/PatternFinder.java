package assignments.javagrep;

import java.util.ArrayList;

public class PatternFinder {
	private ArrayList<String> content = new ArrayList<String>();
	private ArrayList<String> metacontent = new ArrayList<String>();
	private ArrayList<String> foundcontent = new ArrayList<String>();

	public PatternFinder(ArrayList<String> contentlist, ArrayList<String> metacontentlist) {
		super();
		this.content = contentlist;
		this.metacontent = metacontentlist;
	}

	public ArrayList<String> matchPattern(String pattern) {
		for(String line:content) {
			int i = content.indexOf(line);
			if(line.contains(pattern)) {
				foundcontent.add("\\e[31"+metacontent.get(i)+" : \\e[0m"+line);
			}
		}
		if(foundcontent.isEmpty())
			return null;
		else
			return foundcontent;
	}

}
