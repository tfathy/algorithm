package miu;

public class NextPerfectSquare {

	public static void main(String[] args) {
		NextPerfectSquare n = new NextPerfectSquare();
		double x = n.nextPerfectSquare(10);
		System.out.println(x);

	}

	int nextPerfectSquare(int n) {
		if (n < 0)
			return 0;
		
		Double result ;
		Integer next = n + 1;
		while (next > n) {
			result = Math.sqrt(next.doubleValue());			
			if(result % 1 ==0) {
				return  result.intValue()*result.intValue();
			}
			next++;
		}
		return 0;

	}

}
