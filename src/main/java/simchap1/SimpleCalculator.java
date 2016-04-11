package simchap1;

public class SimpleCalculator {
	private int result = 0;
	public void add(int x,int y){
		result =x+y;
	}
	public void sub(int x,int y){
		result =x-y;
	}

	public void multi(int x,int y){
		result =x*y;
	}

	public void div(int x,int y){

		if(y!=0) //분모가 0인 경우 
		result =x/y;	
	
	}
	public void inc(int x){

		
		result +=x;	
	
	}
	public int getResult(){
		return result;
	}
}
