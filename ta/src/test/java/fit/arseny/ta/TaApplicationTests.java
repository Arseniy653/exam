package fit.arseny.ta;

import fit.arseny.ta.models.Exam;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaApplicationTests {


	@Test
	void checkFunc() {
		
		Exam test_tmp = new Exam(Float.parseFloat("5"));
		test_tmp.func();
		float tmp = test_tmp.getAnswer();

		assertEquals(String.format("%.3f",tmp), "0,070");
	}

}
