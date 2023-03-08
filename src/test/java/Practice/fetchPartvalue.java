package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchPartvalue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	

		FileInputStream fis=new FileInputStream("src/main/resources/Excel/testdata-BB1.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sh = book.getSheet("Sheet1");
		DataFormatter df=new DataFormatter();
		  
		
		int rowcount = sh.getLastRowNum();
		
		for(int i=0;i<rowcount;i++)
		{
			
			for(int j=0;j<sh.getRow(i).getLastCellNum();j++)
			{
				
				System.out.println(df.formatCellValue(sh.getRow(i).getCell(j)));
				
				
			}
			
		}
		
	}

}
