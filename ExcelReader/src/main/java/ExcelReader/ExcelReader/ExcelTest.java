package ExcelReader.ExcelReader;

import Reader.ExcelReader;
import Reader.LamdaSample;
import Writer.ExcelWriter;

public class ExcelTest {

	private static final String FILE_LOCATION = "C:\\Users\\KGovintharaj\\Documents\\Sample.xlsx";

	public static void main(String[] args) {
		ExcelReader excelReader = new ExcelReader();
		LamdaSample sample = (dataMap)->{
			System.out.println(dataMap);
		};
		sample.display(excelReader.read(FILE_LOCATION));
		System.out.println("END");
		
		ExcelWriter excelWriter = new ExcelWriter();
		excelWriter.write(FILE_LOCATION);
	}
}