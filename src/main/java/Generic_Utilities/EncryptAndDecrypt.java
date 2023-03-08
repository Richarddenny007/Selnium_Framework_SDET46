package Generic_Utilities;

import java.util.Base64;

public class EncryptAndDecrypt 

{

	public String encrypt(String value)
	{
		
		//String kiran=""+value+"";
		return new String(Base64.getEncoder().encode(value.getBytes()));

		
    }
	
	public String decrypt(String value)
	{
		
		
		return new String(Base64.getDecoder().decode(value.getBytes()));
		
		
	}
	
	
}







//String s=""+value+"";
		//byte[] a = value.getBytes();
		//byte[] b = Base64.getDecoder().decode(a);