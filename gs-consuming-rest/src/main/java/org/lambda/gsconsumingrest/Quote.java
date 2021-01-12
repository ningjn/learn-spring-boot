package org.lambda.gsconsumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @author Administrator
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Quote {

	private String type;
	private Value value;

	@Override
	public String toString() {
		return "Quote{" + "type='" + type + '\'' + ", value=" + value + '}';
	}
}
