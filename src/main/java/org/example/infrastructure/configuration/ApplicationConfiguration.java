package org.example.infrastructure.configuration;

import org.example.EmployeeRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackageClasses = EmployeeRunner.class)
@Import(PersistenceJPAConfiguration.class)
public class ApplicationConfiguration {
}
