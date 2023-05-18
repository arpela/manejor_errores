/**
 * 
 */
package uy.com.s4b.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 8598159279598329821L;

	public RecordNotFoundException(String exception) {
		super(exception);
	}
	
	
}