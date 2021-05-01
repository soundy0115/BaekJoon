package array;

import java.util.*;
import java.io.*;

public class Array7 {
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] testCase = new String[Integer.parseInt(br.readLine())];
		int[] testScore;
		
		for(int i = 0; i < testCase.length; i++) {
			
			testCase[i] = br.readLine();
			
			StringTokenizer st = new StringTokenizer(testCase[i], " ");
					
			testScore = new int[Integer.parseInt(st.nextToken())];
			
			int sum = 0;
			
			for(int j = 0; j < testScore.length; j++) {
				testScore[j] = Integer.parseInt(st.nextToken());
				sum = sum + testScore[j];
			}
			
			double classAvg = sum / (double) testScore.length;
			int countStd = 0;
			for(int k = 0; k < testScore.length; k++) {
				if(testScore[k] > classAvg) {
					countStd = countStd + 1;
				}
			}

			double stdAvg = (double)countStd / testScore.length * 100;
			bw.write(String.format("%.3f", stdAvg) + "%");
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}

}
