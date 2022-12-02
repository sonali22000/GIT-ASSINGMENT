public class Monitor {
//Main 
	public static void main(String[] args) {
		
		Monitor monitor1=new Monitor();
		monitor1.start();
		
		Monitor monitor2=new Monitor();
		
		if(monitor1.isOn) {
		System.out.println("Monitor is on");}
		
		if(monitor2.isOn) {
			System.out.println("Monitor is on");
		}
		else {
			System.out.println("Monitor is off");	
		}

	}
// End of main
	
    
			    
	}

