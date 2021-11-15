package tn.esprit.spring;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;


//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest

class TimesheetApplicationTests {

	private Money m12CHF;
	private Money m14CHF;
	private Money expected;

	@Test
	public void testSimpleAdd() {
		m12CHF = new Money(12, "CHF");
		m14CHF = new Money(14, "CHF");
		expected = new Money(26, "CHF");
		Money result = m12CHF.add(m14CHF);

		assertTrue(expected.equals(result));

	}

}
