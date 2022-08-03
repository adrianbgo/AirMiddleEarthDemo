import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestRandomGen{
	public static class rand extends RandomGen {};
	static String id1;
	static String id2;

	@BeforeAll
	static void setUpBeforeClass() {
		id1 = rand.randIDGen();
		id2 = rand.randIDGen();
	}

	@Test
	void testRandIDGen() {
		assertAll("Random ID Generation",
				() -> assertNotEquals(id1, id2, "Generates only one ID"),
				() -> assertEquals(id1.length(), id2.length(), "Generates IDs of different lengths"),
				() -> assertAll("Generates IDs of length 7",
						() -> assertEquals(id1.length(), 6, "Length Not 7"),
						() -> assertEquals(id2.length(), 6, "Length Not 7")
				)

		);

	}

}
