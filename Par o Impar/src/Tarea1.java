import java.util.*;
public class Tarea1 {

	public static void main(String[] args) {
		
		int num=0;
		Scanner ed=new Scanner(System.in);
		System.out.println("Menu:");
		System.out.println("Ingrese un numero");
		int e=ed.nextInt();
		if (e>0)
			if (e%2==0)
				System.out.println(e+" es par");
			else
				System.out.println(e+" es impar");
				
			}
		
}
