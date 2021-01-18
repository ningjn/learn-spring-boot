package org.lambda.gsrestservice;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@Api(tags = "用户管理")
@RestController
public class GreetingController {

	public static final String TEMPLATE = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@ApiOperation("问候")
	@GetMapping("/greeting")
	public Greeting greeting(
		@ApiParam("名称") @RequestParam(
			value = "name",
			defaultValue = "World"
		) String name
	) {
		return new Greeting(
			counter.incrementAndGet(),
			String.format(TEMPLATE, name)
		);
	}
}
