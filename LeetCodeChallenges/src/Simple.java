public class Simple{
		
	
	public static void main(String[] args){
		System.out.println(2);
		for (int a = 3; a <= 100; a=a+2) {
			if(isPrime(a)) {
				System.out.println(a);
			}
		}
	}
	
	public static boolean isPrime(int n) {
		for (int j = 2; j <= n/2; j++) {
			if (n % j == 0) {
				return false;
			}
		}
		return true;
	}
}
	


   
	
