package assignments.db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ReadCSV {
	String[] columnNames;
	
	public ReadCSV() {
		super();
	}

	public HashMap<Integer, ArrayList<String>> readCSV() {
		try {
			File inputFile = new File("/home/sunray/input.csv");
			FileReader fr = new FileReader(inputFile);
			BufferedReader br = new BufferedReader(fr);
			HashMap<Integer, ArrayList<String>> data = new HashMap<Integer, ArrayList<String>>();
			for (int linenum = 0; linenum < inputFile.length(); linenum++) {
				String line = br.readLine();
				if (line != null) {
					String[] row = line.split(",");
					for (Integer val = 0; val < row.length; val++) {
						if (data.get(val) == null) {
							ArrayList<String> column = new ArrayList<String>();
							column.add(row[val]);
							data.put(val, column);
						} else {
							ArrayList<String> tempColumn = data.get(val);
							tempColumn.add(row[val]);
							data.put(val, tempColumn);
						}
					}
				}
			}
			br.close();
			return data;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
