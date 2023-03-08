package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataExcelUtilty
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
{
		
	
	
	
		FileInputStream fis=new FileInputStream("src/test/resources/Excel/testdata-BB1.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sh = book.getSheet("Sheet2");
		DataFormatter df=new DataFormatter();
		  
		
		int rowcount = sh.getLastRowNum();
		
		ArrayList<String> als=new ArrayList<>();
		
        als.add("rakshith007");
		als.add("karthik");
		als.add("kiran");
		als.add("suresh");
		als.add("rahklfds");
		als.add("some");
		als.add("jkl");
		als.add("suresh");
		
		
			for(int i=0;i<=rowcount;i++)

			{
				for(int j=0;j<=sh.getRow(i).getLastCellNum();j++)
				{
					String cell =df.formatCellValue(sh.getRow(0).getCell(j));
					
					
					if(cell.equals("password"))
					{
						
						for(int k=0;k<als.size();k++)
						{
							String pwd = als.get(k);
							

							sh.createRow(i+1).createCell(j).setCellValue(pwd);
							FileOutputStream file=new FileOutputStream("src/test/resources/Excel/testdata-BB1.xlsx");
							book.write(file);
							i++;
							
							
						}
								
						
					}
					
					
					
					
				}
				
			   
				
				
				
				
				
				
			}
		
		
		
		
}
	
	}

