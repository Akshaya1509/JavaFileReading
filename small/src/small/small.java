package small;
import java.io.*;
import java.util.*;

public class small  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");
		Date date = format.parse("2015-12-10T02:59:00.000Z");
		System.out.println("first :"+ date);
		*/
		String input = "2017-01-18T06:53:47.000Z";
        java.text.SimpleDateFormat parser = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");
        Date date1 = parser.parse(input);
        java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String formattedDate = formatter.format(date1);
        System.out.println("second :"+ formattedDate);

	}

}
