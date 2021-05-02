package function;

public class Function2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nonselfArr = new int[10000];
		
		for(int i = 0; i < 10000; i++) {
			int dn = 0;
			if(i < 10) {
				dn = i + i;
			} else if(i < 100) {
				dn = i + (i / 10) + (i % 10);
			} else if(i < 1000) {
				dn = i + (i / 100) + (i % 100 / 10) + (i % 10);
			} else if(i < 10000) {
				dn = i + (i / 1000) + (i % 1000 / 100) + (i % 100 / 10) + (i % 10);
			}
			nonselfArr[i] = dn;
		}
				
		int[] selfArr = new int[10000];
				
		for(int i = 0; i < 10000; i++) {
			selfArr[i] = i;
			for(int j = 0; j < 10000; j++) {
				if(selfArr[i] == nonselfArr[j]) {
					selfArr[i] = 0;
				}
			}
		}
		
		for(int i = 0; i < 10000; i++) {
			if(selfArr[i] != 0) {
				System.out.println(selfArr[i]);
			}
		}
		
	}

}
