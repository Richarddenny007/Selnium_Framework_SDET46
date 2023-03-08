package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class is used to fetch the value from excel
 * @author Lenovo
 *
 */
public class ExcelUtility {

	Sheet sh;
	public ExcelUtility(String path,String sheet)
	{
		FileInputStream fis = null;
		Workbook book = null;
		
		try {
			fis=new FileInputStream(path);
			book = WorkbookFactory.create(fis);
		} catch (FileNotFoundException |EncryptedDocumentException e) {

			e.printStackTrace();
		}
		 catch (  IOException e) {

				e.printStackTrace();
			}
	    sh = book.getSheet(""+sheet+"");
	}
	
	   DataFormatter df;
		public void getData(String expsname,String exkey)
		{
			 df=new DataFormatter();
			
			String exptsname = ""+expsname+"";
			String expkey = ""+exkey+"";
			int rocount = sh.getLastRowNum();
			String value="";
			for(int i=1;i<=rocount;i++)
			{
				String tsname = df.formatCellValue(sh.getRow(i).getCell(0));
				if(exptsname.equalsIgnoreCase(tsname))
				{
					for(int j=0;j<sh.getRow(i).getLastCellNum();j++)
					{
						String key = df.formatCellValue(sh.getRow(i).getCell(j));
						if(expkey.equalsIgnoreCase(key))
						{
							 value = df.formatCellValue(sh.getRow(i+1).getCell(j));
						}
						
						
					}
					System.out.println(value);
					
					break;
				}
				
			}
			
			
			
			
			
			

		}
	
	}


