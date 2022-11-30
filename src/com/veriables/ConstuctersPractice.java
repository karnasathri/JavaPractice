 package com.veriables;
//package com.veriables;

public class ConstuctersPractice {
    public int i;  
	
	public static void main(String[] args) {
		
		new ConstuctersPractice();
	ConstuctersPractice cp = new ConstuctersPractice();
        //System.out.println(cp.i);

	}
	public ConstuctersPractice() {
		i = 10;
		System.out.println(i);
         
	}
	

	public ConstuctersPractice(int a) {
		i=a;

	}
	
	public ConstuctersPractice(double a) {

	}
	


}
