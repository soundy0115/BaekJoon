package array;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Array5 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

	
		int	subjectNumbers = Integer.parseInt(br.readLine());
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] originalScoreArray = new int[subjectNumbers];
		
		for(int i = 0; i < originalScoreArray.length; i++) {
			originalScoreArray[i] = Integer.parseInt(st.nextToken());
		}
		
		
		int highestScore = 0;
		
		for(int i = 0; i < originalScoreArray.length; i++) {
			if(originalScoreArray[i] > highestScore) {
				highestScore = originalScoreArray[i];
			}
		}
	
		double[] modifiedScoreArray = new double[subjectNumbers];
		
		for(int i = 0; i< originalScoreArray.length; i++) {
			modifiedScoreArray[i] = originalScoreArray[i] / (double)highestScore * 100;
		}
		
		double modifiedSum = 0;
		
		for(int i = 0; i< originalScoreArray.length; i++) {
			modifiedSum = modifiedSum + modifiedScoreArray[i];
		}
		
		double modifiedAvg = modifiedSum / subjectNumbers;
		bw.write(String.valueOf(modifiedAvg));
		bw.flush();
		bw.close();
		br.close();
	}

}
