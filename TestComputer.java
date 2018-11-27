/**
 * 
 */
package computer;

/**
 * @author HALIMA
 *
 */
public class TestComputer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer com1 = new Computer("hp","Windows10");
		Computer com2 = new Computer("dell","Ubuntu",12);
		Computer.quantity++;
		System.out.println("1. No of computer is " + Computer.quantity);
		System.out.println("Com1 ram is " + com1.ram +"GB");
		System.out.println("Com2 ram is " + com2.ram +"GB");
		Computer.quantity++;
		System.out.println("2. No of computer is " + Computer.quantity);
			
				
		

	}

}
