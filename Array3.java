package array;

import java.io.*;

public class Array3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int multiple = a * b * c;
		String strMultiple = Integer.toString(multiple);
		
		char[] arrayMultiple = new char[strMultiple.length()];
		
		for(int i = 0; i < strMultiple.length(); i++) {
			arrayMultiple[i] = strMultiple.charAt(i);
		}

		int[] numbers = new int[10];
		
		for(int i = 0; i < strMultiple.length(); i++) {
			for(int j = 0; j < 10; j++) {
				if(Integer.parseInt(String.valueOf(arrayMultiple[i])) == j) {
					numbers[j] = numbers[j] + 1;
				}
			}
		}
		
		for(int i = 0; i < 10; i++) {
			bw.write(Integer.toString(numbers[i]));
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}

}
