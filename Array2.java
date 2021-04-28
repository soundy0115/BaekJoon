package array;

import java.io.*;

public class Array2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int loop = 9;
		
		int[] numbers = new int[loop];
		
		for(int i = 0; i < loop; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}

		int max = 0;
		int maxIndex = 0;
		
		for(int i = 0; i < loop; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
				maxIndex = i+1;
			}
		}
		
		bw.write(Integer.toString(max) + "\n");
		bw.write(Integer.toString(maxIndex));
		bw.flush();
		bw.close();
		br.close();
	}

}
