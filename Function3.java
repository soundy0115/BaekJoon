package function;

import java.io.*;

public class Function3 {

	public static void main(String[] args) throws IOException{
 		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)	);
		
		int givennum = Integer.parseInt(br.readLine());
		br.close();
		
		int[] givennumarr = new int[givennum];
		
		int count = 0;
		int diff1 = 0;
		int diff2 = 0;
		int diff3 = 0;
		String num = null;
		for(int i = 0; i < givennumarr.length; i++) {
			givennumarr[i] = i + 1;
			num = Integer.toString(givennumarr[i]);
			if(givennumarr[i] < 10) {
				count = count + 1;
			} else if(givennumarr[i] < 100) {
				count = count + 1;
	
			} else if(givennumarr[i] < 1000) {
				char a = num.charAt(0);
				char b = num.charAt(1);
				char c = num.charAt(2);

				diff1 = Integer.parseInt(Character.toString(a)) - Integer.parseInt(Character.toString(b));
				diff2 = Integer.parseInt(Character.toString(b)) - Integer.parseInt(Character.toString(c));
				if(diff1 == diff2) {
					count = count + 1;
				}
			} else if(givennumarr[i] == 1000) {
				char a = num.charAt(0);
				char b = num.charAt(1);
				char c = num.charAt(2);
				char d = num.charAt(3);
				
				diff1 = Integer.parseInt(Character.toString(a)) - Integer.parseInt(Character.toString(b));
				diff2 = Integer.parseInt(Character.toString(b)) - Integer.parseInt(Character.toString(c));
				diff3 = Integer.parseInt(Character.toString(c)) - Integer.parseInt(Character.toString(d));
				if(diff1 == diff2 && diff2 == diff3) {
					count = count + 1;
				}
			}
			
		}
		System.out.println(count);
	}
 
}
