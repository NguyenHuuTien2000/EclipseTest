import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CircleRadiusTest {

	@BeforeAll
	public static void setUpBeforeClass() {

		System.out.println("Starting test");
		
	}

	@BeforeEach
	public void setUp() {
		System.out.println("Testing");
	}

	@Test
	@DisplayName("Test circle radius main with number 1 as input")
	void testMain() {
		String input="1\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args={};
		CircleRadius.main(args);
		
		String consoleOutput="Enter the radius "+System.getProperty("line.separator");
		
		consoleOutput+="For a circle with radius 1.0,"+System.getProperty("line.separator");
		consoleOutput+="The circumference is 6.283185307179586"+System.getProperty("line.separator");
		consoleOutput+="and the area is 3.141592653589793."+System.getProperty("line.separator");
		assertEquals(consoleOutput,out.toString());
	}
	
	@Test
	@DisplayName("Test circle radius main with string abc as input")
	void testMain2() {
		String input="abc\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args={};
		
		assertThrows(RuntimeException.class, ()->{
			CircleRadius.main(args);
		});
//		String consoleOutput="Enter the radius "+System.getProperty("line.separator");
//		
//		consoleOutput+="Input should be a number"+System.getProperty("line.separator");
//		assertEquals(consoleOutput,out.toString());
	}
	
	@AfterEach
	public void tearDownD() {
		System.out.println("Done");
	}
	
	@AfterAll
	public static void tearDownAfterClass() {
		System.out.println("Finishing test");
	}

}
