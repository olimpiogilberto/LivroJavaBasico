package CAP05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C05EX7 {

	public static void main(String[] args) {
		
		int A, B, C, X;
		
	    System.out.println();
	    
		System.out.print("Entre o valor <A>: ");
		try {
			BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
			A = Integer.parseInt(br.readLine()); }  
			catch (Exception e) {
				A = 0;
			}
		
		System.out.print("Entre o valor <B>: ");
		try {
			BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
			B = Integer.parseInt(br.readLine()); }  
			catch (Exception e) {
				B = 0;
			}
		
		System.out.print("Entre o valor <C>: ");
		try {
			BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
			C = Integer.parseInt(br.readLine()); }  
			catch (Exception e) {
				C = 0;
			}
		
		   //esse s�mbolo ^ inverte o resultado l�gico
		if( !(C>5))
		X = (A + B) * C;
		else
	    X = (A - B) * C;
		
		System.out.print("O resultado de X equivale a: " + X);
		
		System.out.println();
	}
}
