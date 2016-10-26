package Week1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class aplusbb 
{
	public static void main(String[] args)
	{
		try {
			//System.out.println(System.getProperty("user.dir"));
			//BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\src\\Week1\\Input\\aplusbb.in"));
			BufferedReader br = new BufferedReader(new FileReader("aplusbb.in"));
			String[] inp = br.readLine().split("\\s+");
			Long out = Long.parseLong(inp[0]) + Long.parseLong(inp[1])*Long.parseLong(inp[1]);
			PrintWriter writer = new PrintWriter("aplusbb.out", "UTF-8");
			writer.print(out);
			writer.close();
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
