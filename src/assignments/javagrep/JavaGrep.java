package assignments.javagrep;

import assignments.javagrep.ContentReader;
import assignments.javagrep.PatternFinder;

public class JavaGrep{

	public static void main(String[] args){
		ContentReader cr = new ContentReader(args[1]);
		PatternFinder pf = new PatternFinder(cr.readContent(),cr.readMetaContent());
		for(String result:pf.matchPattern(args[0]))
			System.out.println(result);
	}

}
