import java.util.Random;

public class GenNum {

	public static void main(String[] args) {

		int numGen = 0;

		Random rndm = new Random();

		numGen = rndm.nextInt(100) + 1;

		System.out.println(numGen);
		
		return;
	}
	

}