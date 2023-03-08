package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMuldataFromExcelMap {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		DataFormatter df=new DataFormatter();
		FileInputStream fis =new FileInputStream("src/main/resources/Excel/testdata-BB1.xlsx");
		Workbook book = WorkbookFactory.create(fis);

		String exptestscriptname = "Profile Updation";
		

		Sheet sh = book.getSheet("Home");
		int rowcount = sh.getLastRowNum();
		
		Map<String,String>map=new HashMap<>();

		for(int i=0;i<=rowcount;i++)
		{
			String testscript = df.formatCellValue(sh.getRow(i).getCell(0));
			
			if(testscript.equalsIgnoreCase(exptestscriptname))
			{
				for(int j=0;j<=sh.getRow(i).getLastCellNum();j++)
				{
					  String key = df.formatCellValue(sh.getRow(i).getCell(j));
					  
				      String value = df.formatCellValue(sh.getRow(i+1).getCell(j));
				      map.put(key, value);
				}
				System.out.println(map.get("Firstname")+ " "+("Lastname"));
			}
			
		}
	}

}
