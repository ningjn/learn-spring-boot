package org.lambda.gsconsumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @author Administrator
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Value {

	private Long id;
	private String quote;

	@Override
	public String toString() {
		return "Value{" + "id=" + id + ", quote='" + quote + '\'' + '}';
	}
}
