package micronaut.data.timestamp;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import java.time.LocalDateTime;
import java.util.Objects;

@MappedEntity
public class MyEntity {

	@Id
	@GeneratedValue
	private long lid;

	private final LocalDateTime mydate;

	public MyEntity(long lid, LocalDateTime mydate) {
		this.lid = lid;
		this.mydate = mydate;
	}

	public MyEntity(LocalDateTime mydate) {
		this.mydate = mydate;
	}

	public long getLid() {
		return lid;
	}

	public void setLid(long lid) {
		this.lid = lid;
	}

	public LocalDateTime getMydate() {
		return mydate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MyEntity myEntity = (MyEntity) o;
		return lid == myEntity.lid &&
				mydate.equals(myEntity.mydate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lid, mydate);
	}

	@Override
	public String toString() {
		return "TimeTest{" +
				"lid=" + lid +
				", mydate=" + mydate +
				'}';
	}
}
