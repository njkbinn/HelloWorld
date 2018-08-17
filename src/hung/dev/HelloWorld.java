package hung.dev;

public class HelloWorld {
	public static void main(String[] args) {
	    int a = 10;
	    int b = 2;
	    int c = 1;
	    double delta;
	    double x1, x2;
	    delta = (b*b) - (4*a*c);
	    if (delta < 0) {
	    	System.out.println("Phuong trinh vo nghiem");
	    }
	    
	    if(delta > 0) {
	    	x1 = (-b+Math.sqrt(delta))/(2*a);
	    	x2 = (-b-Math.sqrt(delta))/(2*a);
	    	System.out.println("x1 = " + x1);
	    	System.out.println("x2 = " + x2);
	    }
	    if(delta == 0) {
	    	x1 = -b / (2*a);
	    	System.out.println("Phuong trinh co nghiem kep x = " + x1);
	    }
	}
}