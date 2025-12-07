package Week1day2;

public class isPrimeNumber {

	    public static void main(String[] args) {

	        int number = 26;  
	        boolean isPrime = true;
	        if (number <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i < number; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }
	        if (isPrime) {
	            System.out.println(number + " is Prime Number");
	        } else {
	            System.out.println(number + " is not Prime Number");
	        }
	    }
	}



