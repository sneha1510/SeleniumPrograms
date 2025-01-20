package parametrization;


import java.io.*;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization_code_12 
{
    //read data row by row and col by col
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Selenium Programs\\Selenium_project\\TestData\\Excel_data1.xlsx");
        Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
	    String value00 = excel.getRow(0).getCell(0).getStringCellValue();
	    String value01=excel.getRow(0).getCell(1).getStringCellValue();
	    System.out.println("Value of 0th row 0th col: "+value00);
	    System.out.println("Value of 0th row 1st col: "+value01);
	}

}
