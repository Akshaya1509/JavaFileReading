package small;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class csv {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		final String ccmap = "/home/akshaya/eclipse/2015_Q4_2_letter_country_codes.csv";
		String cc,field1,field2,map_market_id = null;
		BufferedReader br1 = null;
		FileReader fr1 = null;
		
		fr1 = new FileReader(ccmap);
		br1 = new BufferedReader(fr1);
		
		while ((cc = br1.readLine()) != null){
			String[] f = cc.split(",");
			field1 = f[0];
			field2 = f[1];
			if (field2.equals("AG")){
				map_market_id = field1;
				break;
			}
			
		} //while 
		 br1.close();
		 fr1.close();
		 System.out.println("market id is :" + map_market_id);
	}
	  

}
