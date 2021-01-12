package org.lambda.gsrestservice;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class GsRestServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	/**
	 * 无参数调用greeting，确认返回Hello, world!
	 * @throws Exception 异常
	 */
	@Test
	void noParamGreetingShouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/greeting"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.content").value("Hello, World!"));
	}

	/**
	 * 有参数调用greeting，确认返回Hello, {name}!
	 * @throws Exception 异常
	 */
	@Test
	void paramGreetingShouldReturnTailoredMessage() throws Exception {
		this.mockMvc.perform(get("/greeting").param("name", "Spring Community"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.content").value("Hello, Spring Community!"));
	}
}
