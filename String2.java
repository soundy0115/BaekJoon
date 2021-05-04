package string;

import java.io.*;

public class String2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		char[] chararr = new char[num];
		String numbers = br.readLine();
		int[] intarr = new int[num];
		for(int i = 0; i < chararr.length; i++ ) {
			 chararr[i] = numbers.charAt(i);
			 intarr[i] = Integer.parseInt(Character.toString(chararr[i]));
		}
		
		int sum = 0;
		for(int i = 0; i < intarr.length; i++) {
			sum = sum + intarr[i];
		}
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
		br.close();
		
	}

}
