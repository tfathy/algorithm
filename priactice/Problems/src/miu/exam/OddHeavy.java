package miu.exam;

public class OddHeavy {

	public static void main(String[] args) {
		OddHeavy o = new OddHeavy();
		int[] arr ={2};
		System.out.println(o.isOddHeavy(arr));
	}

	int isOddHeavy(int[] a) {
		if (a.length == 0)
			return 0;
		
		if (a.length == 1) {
			if (isOdd(a[0])) {
				return 1;
			} else {
				return 0;
			}
		}
		
		int result = 1;
	
		for (int i = 0; i < a.length; i++) {
			for(int j=1; j<a.length ; j++) {
				if(isEven(a[i])) {				
					if(isOdd(a[j])) {
						if(a[i]>=a[j]){
							return 0;
						}
					}
				}
			}
			
		}
		
		return result;
	}

	boolean isOdd(int i) {
		
		return Math.abs(i) % 2 > 0;
		
	}

	boolean isEven(int i) {
		return Math.abs(i) % 2 == 0;
	}

}
