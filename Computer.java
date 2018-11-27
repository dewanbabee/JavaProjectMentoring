/**
 * 
 */
package computer;

/**
 * @author HALIMA
 *
 */
public class Computer {
	String comName;
	String osName; 
     int ram;
     static int quantity;
	
	private Computer()
	{
		ram = 8;
		
	}
	public Computer(String comName, String osName)
	{
		this(); // calling its private default constructor
		this.comName = comName;
		this.osName = osName;
		
	}
	
	public Computer(String comName, String osName, int ram)
	{
		this.comName = comName;
		this.osName = osName;
		this.ram = ram;
	}
	
	
	
	

}
