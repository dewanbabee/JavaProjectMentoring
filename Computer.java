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
	
	
	public static int getPrice(int ram)
	{
		int price;
		if (ram < 6)
			return price = 500;
		else 
			return price = 800;
	}
	

}
