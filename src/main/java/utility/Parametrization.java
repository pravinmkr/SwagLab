package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

	public static String getExcelData(String SheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file =new FileInputStream("D:\\workplace eclipse\\SwagLabs\\src\\test\\resources\\TestData.xlsx");
		String value =WorkbookFactory.create(file).getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}
