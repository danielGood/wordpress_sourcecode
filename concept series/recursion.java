public class Recursion {

	public static void main(String[] args) {
		
    recur(10);
    System.out.println(fib(8));
    
	}
	
	
	
	public static void recur (int x){
		
		System.out.println(x);
		
		if(x>0)
		  recur(x-1);
		
		System.out.println(x);
		
	}
	
	
	
	public static int fib(int n){
		
		
		if(n==1 || n== 0)
			return n;
		
		
		return fib(n-1)+fib(n-2);
	}
	
	
	
	

}
