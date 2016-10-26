package Week1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Prepare {
	public static void main(String args[]) {
		FileReader fr = null;
		try {
			//fr = new FileReader(System.getProperty("user.dir")+"\\src\\Week1\\Input\\prepare.in");
			fr = new FileReader("prepare.in");
		} catch (FileNotFoundException e) {
			System.out.println("Input file not found!!");
		}
		
		try(BufferedReader br = new BufferedReader(fr)) {
			//BufferedReader br = new BufferedReader(new FileReader("prepare.in"));
			Integer n = Integer.parseInt(br.readLine());
			String[] ti = br.readLine().split("\\s+");
			String[] pi = br.readLine().split("\\s+");
			
			Integer maxskill = 0, diff = 0;
			Integer mindiff = 1001; // index = 1001;
			Integer ti_val = 0, pi_val = 0;
			boolean ti_visited = false, pi_visited = false;
			
			for(int i=0; i<n; i++) {
				ti_val = Integer.parseInt(ti[i]);
				pi_val = Integer.parseInt(pi[i]);
				//System.out.println("ti: "+ti_val+" pi: "+pi_val);
				
				if(Math.max(ti_val, pi_val) == ti_val) ti_visited = true;
				else pi_visited = true;
				
				maxskill += Math.max(ti_val, pi_val);
				
				diff = Math.abs(ti_val - pi_val);
				if(diff < mindiff) {
					mindiff = diff;
					//index = i;
				}
				
			}
			
			//System.out.println(maxskill);
			// if both ti and pi not included
			if(!(ti_visited && pi_visited))
				maxskill -= mindiff;
				
			//Long out = Long.parseLong(inp[0]) + Long.parseLong(inp[1])*Long.parseLong(inp[1]);
			PrintWriter writer = new PrintWriter("prepare.out", "UTF-8");
			writer.print(maxskill);
			writer.close();
				
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
