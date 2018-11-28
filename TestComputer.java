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
		System.out.println("Com1 ram is " + com1.ram +" GB");
		System.out.println("Com2 ram is " + com2.ram +" GB");
		Computer.quantity++;
		System.out.println("2. No of computer is " + Computer.quantity);
		MyComputer mycom1 = new MyComputer("hp","Windows10",6,4);
		MyComputer mycom2 = new MyComputer("dell","Ubuntu",3);
		System.out.println("myCom1 ram is " + mycom1.ram +" GB");
		System.out.println("myCom2 ram is " + mycom2.ram +" GB");
		System.out.println("myCom1 no of drive is " + mycom1.getNoDrive());
		System.out.println("myCom2 no of drive is  " + mycom2.getNoDrive());
		mycom2.setNoDrive(2);
		System.out.println("myCom2 new no of drive is  " + mycom2.getNoDrive());
		System.out.println("Computer price for less than 6 GB RAM is " + Computer.getPrice(5)+ " USD");
		
			
				
		

	}

}
