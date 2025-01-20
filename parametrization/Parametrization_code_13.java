package parametrization;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization_code_13 
{
    //read many records
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	   FileInputStream file=new FileInputStream("C:\\Selenium Programs\\Selenium_project\\TestData\\Excel_data1.xlsx");
	   Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
       //for loop 
	   /*for(int row=0;row<=5;row++)//rows are 6
	   {
		   for(int col=0;col<=1;col++)//cols are 2
		   {
			   String value = excel.getRow(row).getCell(col).getStringCellValue();
		       System.out.print(value+" ");
		   }
		   System.out.println();
	   }*/
	   for(int row=0;row<=excel.getLastRowNum();row++)
	   {
		   for(int col=0;col<excel.getRow(row).getLastCellNum();col++)
		   {
			   String values = excel.getRow(row).getCell(col).getStringCellValue();
		       System.out.print(values+" ");
		   }
		   System.out.println();
	   }
	}

}
