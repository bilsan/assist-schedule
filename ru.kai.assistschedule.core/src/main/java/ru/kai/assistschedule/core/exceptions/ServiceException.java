package ru.kai.assistschedule.core.exceptions;

/**
 * @date 30.06.11
 */
public class ServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3516919991319456463L;

	public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }
}