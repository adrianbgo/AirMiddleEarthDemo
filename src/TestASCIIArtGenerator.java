import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestASCIIArtGenerator {
	private static ASCIIArtGenerator artGen;
	
	@BeforeAll
	static void setUpBeforeClass() {
		artGen = new ASCIIArtGenerator();
	}
	
	@Disabled("Ignored")
	@Test
	void testPrintTextArt() {
		// TODO Test TextArt Printing
	}
	
	@Disabled("Ignored")
	@Test
	void testFindImageWidth() {
		// TODO Test Image Width
	}
	
	@Disabled("Ignored")
	@Test
	void testGetBaselinePosition() {
		// TODO Test Baseline Position
	}

}
