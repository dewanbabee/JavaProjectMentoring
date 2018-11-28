/**
 * 
 */
package computer;

/**
 * @author HALIMA
 *
 */
public class MyComputer extends Computer{
	private int noDrive;

	public MyComputer(String comName, String osName, int ram,int noDrive) {
		super(comName, osName, ram);
		this.noDrive = noDrive;
	}
	public MyComputer(String comName, String osName,int noDrive) {
		super(comName, osName);
		this.noDrive = noDrive;
	}
	
	public int getNoDrive()
	{
		return this.noDrive;
	}
	public void setNoDrive(int noDrive)
	{
		this.noDrive = noDrive;
	}

	

}
