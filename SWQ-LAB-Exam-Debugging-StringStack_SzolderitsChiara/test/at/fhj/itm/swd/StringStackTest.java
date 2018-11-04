package at.fhj.itm.swd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import java.util.logging.Logger;

public class StringStackTest {
	@Rule
	public TestName testname = new TestName();
	final static Logger logger = Logger.getLogger("Testlogger");

	private StringStack s;

	@Before
	public void setup() {
		logger.info("Starting test: " + testname.getMethodName());
		s = new StringStack(5);
	}

	public void testStringStackCanAddAndRemoveElements() {

		s = new StringStack(5);

		assertTrue(areAllArrayElementsNull(s.elementData));

		logger.info(s.getElementIndex()+ "");

		s.push("aaa");
		s.push("bbb");
		s.push("ccc");
		s.push("ddd");
		s.push("eee");

		logger.info(s.getElementIndex()+ "");

		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();

		logger.info(s.getElementIndex()+ "");

		assertTrue(areAllArrayElementsNull(s.elementData));

	}

	private boolean areAllArrayElementsNull(String[] array) {
		for (String str : array) {
			if (str != null)
				logger.info("String is not empty!");
				return false;
		}
		return true;
	}

	public void testThatInitialStackIsEmpty() {
		s.push("one");
		assertFalse(s.isEmpty());
		s.pop();
		assertTrue(s.isEmpty());
	}

    public void testStackWithOneElementIsEmptyAfterPop() {
    }

	/**
	 * tests push and pop function
	 * 
	 * do following test - use push, 1 or x times - use pull, as often as you
	 * use push - use isEmpty to check that's empty again - assert every content
	 * of the stack in the correct ordering
	 * 
	 * @throws Exception
	 */
	public void testPushPop() {
		fail("not implemented yet!");
		// TODO: add implementation for this test according to the Javadoc-comment
		
		assertTrue(s.isEmpty());

		assertTrue(s.isEmpty());

		s.push("aaa");

		assertFalse(s.isEmpty());

		s.pop();


		assertTrue(s.isEmpty());

	}

	/**
	 * use pop on empty stack an exception must be "expected" (!) it's not valid
	 * to use an if else case (!)
	 */
	@Test(expected = IllegalStateException.class)
	public void testPopEmptyStack() {
		s.pop(); // !!!
	}

	/**
	 * use push more often than the size of the stack is defined e.g. stack has
	 * a size of 5 so you have to call push 6 times (!)
	 *  further more an exception must be "expected"
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testPushFullStack() {
		//fail("not implemented yet!");
		// TODO: add implementation for this test according to the Javadoc-comment

		for(int x = 0; x <= s.getElementData().length; x++)
		{
			s.push("aaa");
		}
	}
}
