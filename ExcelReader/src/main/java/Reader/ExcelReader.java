package Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author KGovintharaj
 *
 */
public class ExcelReader {

	@SuppressWarnings({ "resource", "deprecation" })
	public Map<Integer, List<String>> read(String fileLocation) {

		Map<Integer, List<String>> data = new HashMap<Integer, List<String>>();

		FileInputStream file = null;
		try {
			file = new FileInputStream(new File(fileLocation));
			Workbook workbook = new XSSFWorkbook(file);
			for (Sheet sheet : workbook) {
				if(sheet.getSheetName().length() == 0){
					continue;
				}
				System.out.println("Sheet Name: "+sheet.getSheetName());
				int i = 0;
				for (Row row : sheet) {
					if(row.getRowNum() == 0){
						i++;
						continue;
					}
					data.put(i, new ArrayList<String>());
					for (Cell cell : row) {
						switch (cell.getCellTypeEnum()) {
						case STRING:
							data.get(i).add(cell.getStringCellValue());
							break;
						case NUMERIC: 
							System.out.println(cell.getStringCellValue());
							data.get(new Integer(i)).add(cell.getStringCellValue());
							break;
						case BOOLEAN: 
							System.out.println(cell.getStringCellValue());
							data.get(new Integer(i)).add(cell.getStringCellValue());
							break;
						case FORMULA: 
							break;
						default: data.get(new Integer(i)).add(" ");
						}
					}
					i++;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
}
