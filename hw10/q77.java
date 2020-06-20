package hw10;

public class q77 {
	String obj_name;
	public q77(String obj_name) {
		this.obj_name=obj_name;
	}
	static void create() {
		q77 itemtoshow=new q77("itemname");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] balls = new String[1];
		int[] scores = new int[1];
		
		create();
		
		balls=null;
		scores=null;
		Runtime.getRuntime().gc();
		//answer is 0
	}
	 @Override
	    // finalize method is called on object once  
	    // before garbage collecting it 
	 protected void finalize() throws Throwable  
	    { 
	        // will print name of object 
	        System.out.println(this.obj_name + " successfully garbage collected"); 
	    } 
}
