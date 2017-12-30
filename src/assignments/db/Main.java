package assignments.db;

public class Main {

	public static void main(String[] args) {
		ReadCSV rcsv = new ReadCSV();
		System.out.println(rcsv.readCSV().toString());
	}

}
