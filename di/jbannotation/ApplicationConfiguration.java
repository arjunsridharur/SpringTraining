package com.yaazli.springtraining.di.jbannotation;

import org.springframework.context.annotation.Bean;

public class ApplicationConfiguration {
	@Bean(name="Service")
    public Manager helloWorld() {
        return new ManagerImplimentation();
    }
}
