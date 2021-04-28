package array;

import java.io.*;
import java.util.*;

public class Array1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int[] numArray = new int[num];

		String numbers = br.readLine();
		StringTokenizer st = new StringTokenizer(numbers);

		for(int i = 0; i < num; i++) {
			numArray[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = numArray[0];
		int max = numArray[0];
		
		for(int i = 0; i < num; i++) {

			if(numArray[i] < min) {
				min = numArray[i];
			}
			if(numArray[i] > max) {
				max = numArray[i];
			}
		}

		bw.write(Integer.toString(min) + " " + Integer.toString(max));
		bw.flush();
		br.close();
		bw.close();
		
	}

}
