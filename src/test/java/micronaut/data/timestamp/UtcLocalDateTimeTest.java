package micronaut.data.timestamp;

import java.util.TimeZone;

public class UtcLocalDateTimeTest extends LocalDateTimeTest {
	static {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}
}
