package array;

import java.io.*;

public class Array4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int divisor = 42;
		
		int[] dividend = new int[10];
		int[] remainder = new int[10];
		
		for(int i = 0; i < dividend.length; i++) {
			dividend[i] = Integer.parseInt(br.readLine());
			remainder[i] = dividend[i] % divisor;
		}
		br.close();
		
		boolean[] count = new boolean[42];
		for(int i= 0; i < remainder.length; i++) {
			
			count[remainder[i]] = true;
			
		}
		int countTrue = 0;
		for(int i = 0; i < count.length; i++) {
			if(count[i] == true) {
				countTrue++;
			}
		}
		bw.write(Integer.toString(countTrue));
		
		bw.flush();
		bw.close();
	}

}
