package com.colak.springautoconfiguretutorial.autoconfig;

import com.colak.springautoconfiguretutorial.service.PersonService;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

// We need to register the class as an auto-configuration candidate.
// We do this by adding the name of the class in the standard file resources/META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports:
@AutoConfiguration
// Our auto-configuration needs configuration properties, create a @EnableConfigurationProperties class to bind those properties.
@EnableConfigurationProperties(PersonProperties.class)

// Conditionally Enable the Auto-Configuration
@ConditionalOnClass(PersonService.class)
@ConditionalOnProperty(prefix = "com.person", value = "enabled", matchIfMissing = true)
public class PersonServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(PersonService.class)
    public PersonService personService(PersonProperties properties){
        return new PersonService(properties);
    }
}
