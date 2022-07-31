import java.util.Random;

/**
 * 
 * @author adrian.go
 *
 */
abstract class RandomGen {
	public String randIDGen() {
		Random rand = new Random();
		String randID = Integer.toString(rand.nextInt(1000000));
		
		while (Integer.parseInt(randID) < 10000) {
			randID = Integer.toString(rand.nextInt(1000000));
		}
		return randID;
	}
}
