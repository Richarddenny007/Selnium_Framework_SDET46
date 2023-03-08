package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_Utility {
	
	private Properties prop;
	/**
	 This constructor will initialize th property file
	 */
	
	public Property_Utility(String path) 
	{
     	try {
			FileInputStream fis = new FileInputStream(path);
			
			prop=new Properties();
			prop.load(fis);
			
			fis.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		}
	/**
	 This method is used to fetch the data from property file based on key
	 * @param key
	 * @return
	 */
		public String getPropData(EnumKey key)
		{   
			//name() is used to covert it into string
	         return prop.getProperty(key.name().toLowerCase(),"please give proper key"+key).trim();
	     
		}
	

}
