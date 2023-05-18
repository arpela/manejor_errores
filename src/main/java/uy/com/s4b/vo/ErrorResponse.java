/**
 * 
 */
package uy.com.s4b.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
	
	// General error message about nature of error
	private String message;

	// Specific errors in API request processing
	private List<String> details;

}