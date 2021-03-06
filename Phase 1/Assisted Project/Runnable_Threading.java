package Ass3;

public class Runnable_Threading implements Runnable{
	 
    public static int myCount = 0;
    public Runnable_Threading(){
         
    }
    public void run() {
        while(Runnable_Threading.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++Runnable_Threading.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        Runnable_Threading mrt = new Runnable_Threading();
        Thread t = new Thread(mrt);
        t.start();
        while(Runnable_Threading.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++Runnable_Threading.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
