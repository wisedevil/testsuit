/* testsuit: Unit test framework for Java
 *	Copyright (C) 2013  Alfredo Mungo
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package wisedevil.test;

/**
 * Thrown to indicate that a test has failed.
 */
public class TestFailedException extends RuntimeException {
	private static final long serialVersionUID = 0;
	
	/**
	 * @see java.lang.RuntimeException
	 */
	public TestFailedException() {
		super();
	}
	
	/**
	 * @param message The detail message
	 *
	 * @see java.lang.RuntimeException
	 */
	public TestFailedException(String message) {
		super(message);
	}
	
	/**
	 * @param message The detail message
	 * @param cause The cause
	 *
	 * @see java.lang.RuntimeException
	 */
	public TestFailedException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * @param message The detail message
	 * @param cause The cause
	 * @param enableSuppression Whether or not suppression is enabled
	 * @param writableStackTrace Whether or not the stack trace should be writable
	 *
	 * @see java.lang.RuntimeException
	 */
	public TestFailedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
	/**
	 * @param cause The cause
	 *
	 * @see java.lang.RuntimeException
	 */
	public TestFailedException(Throwable cause) {
		super(cause);
	}
}

