package Ass3;

public class Poly_test {
	
	
	    public int sum(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y + z);
	    }	
	    public double sum(double x, double y) 
	    { 
	        return (x + y); 
	    } 
	    public static void main(String args[]) 
	    { 
	        Poly_test s = new Poly_test(); 
	        System.out.println(s.sum(10, 20)); 
	        System.out.println(s.sum(10, 20, 30)); 
	        System.out.println(s.sum(10.5, 20.5)); 
	    } 
	}

