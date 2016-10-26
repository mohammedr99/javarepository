package Week1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class aplusb 
{
	public static void main(String[] args)
	{
		try {
			//System.out.println(System.getProperty("user.dir"));
			//BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\src\\Week1\\Input\\aplusb.in"));
			BufferedReader br = new BufferedReader(new FileReader("aplusb.in"));
			String[] inp = br.readLine().split("\\s+");
			Integer out = (int) (Integer.parseInt(inp[0]) + Math.pow(Double.parseDouble(inp[0]), 2));
			PrintWriter writer = new PrintWriter("aplusb.out", "UTF-8");
			writer.print(out);
			writer.close();
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
