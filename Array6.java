package array;

import java.util.*;
import java.io.*;

public class Array6 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int caseNum = Integer.parseInt(br.readLine());

		String[] caseArr = new String[caseNum];
		
		for(int i = 0; i < caseArr.length; i++) {
			caseArr[i] = br.readLine();
		}
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i < caseArr.length; i++) {
			for(int j = 0; j < caseArr[i].length(); j++) {
				if(caseArr[i].charAt(j) == 'O') {
					count = count + 1;
					sum = sum + count;
				} else {
					count = 0;
				}
			}
			bw.write(Integer.toString(sum));
			bw.newLine();
			count = 0;
			sum = 0;
			bw.flush();
		}
		bw.close();
		br.close();
	}

}
