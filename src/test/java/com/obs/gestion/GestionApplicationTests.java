package com.obs.gestion;

import org.junit.jupiter.api.Test;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GestionApplicationTests {

	@Test
	public void whenPropertiesConfig_thenInsertSucceeds() {
	    SpringApplicationBuilder app = new SpringApplicationBuilder(GestionApplication.class);
	    app.run();

	}
}
