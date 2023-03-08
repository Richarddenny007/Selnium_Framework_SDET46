package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
		FileInputStream fis =new FileInputStream("src/test/resources/Excel/testdata-BB1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Home");

		Map<String,String>map=new LinkedHashMap<>();

		for(int i=0;i<sh.getLastRowNum();i++)
		{
			String tsn = df.formatCellValue(sh.getRow(i).getCell(0));
			if(tsn.equalsIgnoreCase("Profile Updation"))
			{
				for(int j=0;j<sh.getRow(i).getLastCellNum();j++)
				{
					String key = df.formatCellValue(sh.getRow(i).getCell(j+1)); 
					String value = df.formatCellValue(sh.getRow(i+1).getCell(j+1));           
                    map.put(key, value);
                    
				}
				System.out.println(map);
			}



		}
	}

}
