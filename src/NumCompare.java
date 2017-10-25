
public class NumCompare {
	public static boolean compareNum(int targetNum, double guess){
		double targetDouble = targetNum;
		if(targetDouble == guess) {
			System.out.println("You got it right");
			return true;
		} else if(targetDouble > guess) {
			if(10<=(targetDouble - guess)) {
				System.out.println("Too high!");
			} else {
				System.out.println("Way too high!");
			}
			return false;
		} else {
			if(10<=(guess - targetDouble)) {
				System.out.println("Too low!");
			} else {
				System.out.println("Way too low!");
			}
			return false;
		}
	}
}
