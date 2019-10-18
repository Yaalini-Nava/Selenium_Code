package first_package;

public class functionsInJava {

	public static void main(String[] args) {
		functionsInJava obj = new functionsInJava();
	
		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		int p = obj.division(100,50);
		System.out.println(p);
	}

public void test() {
	 System.out.println("test method");
}
public int pqr() {
	System.out.println("PQR Method");
	int a =10;
	int b =20;
	int c = a+b;
	return c;
	
}

public String S() {
	System.out.println("String method");
	String qa = "Selenium";
	
	return qa;	
	
}

public int division(int x, int y) {
	System.out.println("Division method");
	int d = x/y;
	return d;
}
			
}











