package micronaut.data.timestamp;

import io.micronaut.context.annotation.Property;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public abstract class LocalDateTimeTest {

	@Inject
	MyEntityRepository repository;

	@Test
	void foo() {
		LocalDateTime dstChange = LocalDateTime.of(2020, 3, 29, 2, 0);
		repository.save(new MyEntity(dstChange));
		assertEquals(dstChange, repository.findById(1L).get().getMydate());
	}
}
