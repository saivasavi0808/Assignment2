package Week1day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int range=8;
		System.out.print("Fibonacci series:"+a+","+b);
		for(int i=2;i<=range;i++) {
			int c=a+b;
			if(i>=range) {
				break;
			}
			//System.out.print(","+c);
			System.out.print(","+c);
			a=b;
			b=c;
		}
	}

}
