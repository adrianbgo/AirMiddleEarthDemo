import java.util.Random;

/**
 * 
 * @author adrian.go
 *
 */
abstract class RandomGen {
	public static String randIDGen() {
		Random rand = new Random();
		String randID = Integer.toString(rand.nextInt(1000000));
		
		while (Integer.parseInt(randID) < 100000) {
			randID = Integer.toString(rand.nextInt(1000000));
		}
		return randID;
	}
}
