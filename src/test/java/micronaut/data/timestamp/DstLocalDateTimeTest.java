package micronaut.data.timestamp;

import java.util.TimeZone;

public class DstLocalDateTimeTest extends LocalDateTimeTest {
	static {
		TimeZone.setDefault(TimeZone.getTimeZone("Europe/Berlin"));
	}
}
