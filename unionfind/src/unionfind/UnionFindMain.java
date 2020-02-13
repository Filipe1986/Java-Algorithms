package unionfind;

import java.util.Scanner;

public class UnionFindMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);  // replace as required!
		System.out.println("Type the number of nodes!");
	    int n = in.nextInt();
	    System.out.println("Number "+ n);
	    UF uf = new UF(n);
	}
	


}
