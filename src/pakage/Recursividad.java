package pakage;

public class Recursividad {

	public static void main(String[] args) {

		int n1 = 16;
		int n2 = 5;
		
		
		System.out.println("El resultado de la división es: " + division(n1, n2));
	}
	
	public static int division(int n, int n2) {
		int r;
		if (n < n2) {
			r = 0;
		} else {
			r = 1 + division (n - n2, n2);
		}
		return r;
	}
}