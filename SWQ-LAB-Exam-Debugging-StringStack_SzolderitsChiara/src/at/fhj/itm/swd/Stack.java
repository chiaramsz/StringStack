package at.fhj.itm.swd;

public interface Stack {

	public abstract boolean isEmpty();

	/**
	 * Pushes an item onto the top of this stack.
	 * 
	 * if Stack is full return an error message
	 */
	public abstract void push(String item);

	/**
	 * Removes the object at the top of this stack and returns that object
	 * 
	 * if Stack is empty return an error message
	 */
	public abstract String pop();

}