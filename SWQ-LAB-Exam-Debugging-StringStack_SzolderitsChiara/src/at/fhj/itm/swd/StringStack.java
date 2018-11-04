package at.fhj.itm.swd;

import java.util.logging.Logger;

/**
 * Stack Implementation of <code>Stack</code> Interface. supports Strings and
 * must be initialized with max. number of of items.
 * 
 * @see Stack
 */
public class StringStack implements Stack {

	// hint: change visibility!
	public String[] elementData;

	private int elementIndexOfTopItem;

	/**
	 * Initializes the stack with the given capacity.
	 *
	 * @throws IllegalArgumentException If capacity is lower than 0
	 */

	final static Logger logger = Logger.getLogger("Applogger");

	public StringStack(int capacity) {
		if (capacity <= 0) {
			logger.warning("Capacity IllegalArgumentException: " + capacity);
			throw new IllegalArgumentException("size must be <= 0");
		}

		elementData = new String[capacity];
		elementIndexOfTopItem = 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO: implement
		if(elementIndexOfTopItem == 0)
		{
			logger.info("Stack is empty");
			return true;
		}
		logger.info("Stack ist not empty");
		return false;
	}

	@Override
	public void push(String item) {
		if (elementIndexOfTopItem == elementData.length)
			throw new ArrayIndexOutOfBoundsException("pop first, reached the end of the stack");

		elementIndexOfTopItem++;

		elementData[elementIndexOfTopItem -1] = item;
	}

	@Override
	public String pop() {
		if (elementIndexOfTopItem == 0) {
			logger.warning("Capacity IllegalArgumentException:" + elementIndexOfTopItem + " elementIndex");
			throw new IllegalStateException("push first, you haven't any data at your stack");
		}

		elementIndexOfTopItem--;
		String element = elementData[elementIndexOfTopItem];

		// returns the element and decrement the counter
		// hint: change below
		elementData[elementIndexOfTopItem] = null;
		return element;
	}


	public String[] getElementData() {
		return elementData;
	}

	public int getElementIndex() {
		return elementIndexOfTopItem;
	}


}
