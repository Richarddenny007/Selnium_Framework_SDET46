package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xpath {

	public Map<String, String> data() throws EncryptedDocumentException, IOException

	{



		DataFormatter df=new DataFormatter();
		FileInputStream fis =new FileInputStream("src/main/resources/Excel/testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);


		Sheet sh = book.getSheet("xpath");
		int rowcount = sh.getLastRowNum();

		Map<String,String>map=new LinkedHashMap<>();

		for(int i=0;i<=rowcount;i++)
		{
			for(int j=0;j<=sh.getRow(i).getLastCellNum();j++)
			{
				String key = df.formatCellValue(sh.getRow(i).getCell(j));

				String value = df.formatCellValue(sh.getRow(i+1).getCell(j));
				map.put(key, value);
			}
			
      return map;
     
		}
		return map;
		
		
	}

}
