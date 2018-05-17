package Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import IntToEng.IntToEng;

public class IntToEngTest {

	@Test
	public void 一ならoneとでる() {
		IntToEng  ite = new IntToEng();
		String expected = "one";
		String actual = ite.translateEng(1);
		assertThat(actual,is(expected));
	}
	

}
