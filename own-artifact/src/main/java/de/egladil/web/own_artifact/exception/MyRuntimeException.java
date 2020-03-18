// =====================================================
// Project: own-artifact
// (c) Heike Winkelvoß
// =====================================================
package de.egladil.web.own_artifact.exception;

/**
 * MyRuntimeException
 */
public class MyRuntimeException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	public MyRuntimeException() {

	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public MyRuntimeException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {

		super(message, cause, enableSuppression, writableStackTrace);

	}

	/**
	 * @param message
	 * @param cause
	 */
	public MyRuntimeException(final String message, final Throwable cause) {

		super(message, cause);

	}

	/**
	 * @param message
	 */
	public MyRuntimeException(final String message) {

		super(message);

	}

	/**
	 * @param cause
	 */
	public MyRuntimeException(final Throwable cause) {

		super(cause);

	}

}
