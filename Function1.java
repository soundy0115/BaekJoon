package function;

public class Function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function1 f1 = new Function1();
		int[] hi = {1, 2, 3};
		System.out.println(f1.sum(hi));
	}
	
	long sum(int[] a) {
		long sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		
		return sum;
		
	}

}
