package Writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	public void write(String fileLocation) {
		fileLocation = fileLocation.substring(0, fileLocation.lastIndexOf("\\"));
		fileLocation = fileLocation+"\\temp.xlsx";
		File file = new File(fileLocation);
		if(file.exists()){
			file.delete();
		}
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("test");
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("Name");
		row = sheet.createRow(1);
		row.createCell(0).setCellValue("Keg");
		row = sheet.createRow(2);
		row.createCell(0).setCellValue("K7");
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(fileLocation);
			workbook.write(outputStream);
			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}