package Ass3;


class methodExecution {

		public int multipynumbers(int a,int b) {
			int z=a*b;
			return z;
		}
		int val=150;

		int operation(int val) {
			val =val*10/100;
			return(val);
		}
		public void area(int b,int h)
		  {
			System.out.println("@methode overloading");
		       System.out.println("Area of Triangle : "+(0.5*b*h));
		  }
		  public void area(int r) 
		  {
		       System.out.println("Area of Circle : "+(3.14*r*r));
		  }


		public static void main(String[] args) {
			methodExecution ob=new methodExecution();
		     ob.area(10,12);
		     ob.area(5); 
		     
			methodExecution b=new methodExecution();
			int ans= b.multipynumbers(10,3);
			System.out.println("@Method Call");
			System.out.println("Multipilcation is :"+ans);
			System.out.println("@callValue");
			System.out.println("Before operation value of data is "+ob.val);
			ob.operation(100);
			System.out.println("After operation value of data is "+ob.val);


		}
	}
