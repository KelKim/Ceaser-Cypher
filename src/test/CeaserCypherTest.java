import org.junit.*;
import static org.junit.Assert.*;

public class CeaserCypherTest {
	@Test

	public void isString_inputNotNull_true() {
		CeaserCypher cypher = new CeaserCypher();
		assertEquals (true, cypher.isString(""));
	}

	@Test

	public void isString_inputOnlyStrings_true() {
		CeaserCypher cypher = new CeaserCypher();
		assertEquals (true, cypher.isString(6));
	}
}