# Read Me

The original idea is from  
https://jxausea.medium.com/how-to-make-your-custom-spring-boot-starter-component-b6b88bc47415

# spring.factories file

See  
https://stackoverflow.com/questions/75313425/unable-to-create-custom-spring-boot-starter-autoconfiguration/75314073#75314073

spring-boot-3 no longer uses spring.factories to register autoconfiguration classes.

Create a file named **org.springframework.boot.autoconfigure.AutoConfiguration.imports** in folder **META-INF/spring** where you
can put (all) your Configuration classes.



