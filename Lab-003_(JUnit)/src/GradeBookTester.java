import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook grade1;
	private GradeBook grade2;

	

	@BeforeEach
	public void setUp(){
		grade1 = new GradeBook(5);
		grade2 = new GradeBook(5);
		
		grade1.addScore(10.0);
		grade1.addScore(20.0);

		grade2.addScore(10.0);
		grade2.addScore(15.0);
		grade2.addScore(5.0);
	}

	@AfterEach
	public void tearDown(){
		grade1 = null;
		grade2 = null;	
	}
	
	@Test
	public void testAddScore() {
		assertTrue((grade1.toString()).equals("10.0 20.0 "));
	     assertTrue((grade2.toString()).equals("10.0 15.0 5.0 "));
	}

	@Test
	public void testSum() {
	 assertEquals(30.0, grade1.sum());
	 assertEquals(30.0, grade2.sum());
		
	}

	@Test
	public void testMinimum() {
		assertEquals(10, grade1.minimum());
		assertEquals(5, grade2.minimum());
		
	}

	@Test
	void testFinalScore() {
		assertEquals(2, grade1.getScoreSize());
		assertEquals(3, grade2.getScoreSize());
	}

}
