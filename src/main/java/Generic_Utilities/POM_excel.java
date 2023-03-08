package Generic_Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class POM_excel {


	Workbook book;
	public Map<String, String> fetchData(String sheet)
	{
		DataFormatter df=new DataFormatter();
		try {
			FileInputStream fis =new FileInputStream("src/test/resources/Excel/testdata.xlsx");
			book = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sh = book.getSheet(sheet);
		
		Map<String,String>map=new LinkedHashMap<>();

		for(int i=0;i<sh.getLastRowNum();i++)
		{
			for(int j=0; j<sh.getRow(i).getLastCellNum(); j++)
			{
                   String key=df.formatCellValue(sh.getRow(i).getCell(j));
                   String value=df.formatCellValue(sh.getRow(i+1).getCell(j));
                   map.put(key, value);
			}	break;					
		}
		
		return map;
	}
	/*public Map<String, String> fetchData1()
	{
		DataFormatter df=new DataFormatter();
		try {
			FileInputStream fis =new FileInputStream("src/main/resources/Excel/testdata.xlsx");
			book = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sh = book.getSheet("karthik");
		
		Map<String,String>map=new LinkedHashMap<>();

		for(int i=0;i<sh.getLastRowNum();i++)
		{
			for(int j=0; j<sh.getRow(i).getLastCellNum(); j++)
			{
                   String key=df.formatCellValue(sh.getRow(i).getCell(j));
                   String value=df.formatCellValue(sh.getRow(i+1).getCell(j));
                   map.put(key, value);
			}	break;					
		}
		
		return map;
	}*/
}
