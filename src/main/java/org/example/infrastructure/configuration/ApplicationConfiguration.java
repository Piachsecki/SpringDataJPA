package org.example.infrastructure.configuration;

import org.example.ZajavkaStoreApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackageClasses = ZajavkaStoreApplication.class)
@Import(PersistenceJPAConfiguration.class)
public class ApplicationConfiguration {
}
