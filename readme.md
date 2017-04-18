# spring-boot dozer 

This is a simple Spring boot utility that will help you integrate & load dozer with your mapping files easily.

## integration

- Add following dependency in your `pom.xml`

```
<dependency>
	<groupId>com.pk.dozer</groupId>
	<artifactId>spring-boot-starter-dozer</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```

- Create a directory `dozer-mappings` in `/src/main/resources/`.
- Put all your dozer mapping **xml** files under it.
- Now you can Autowire `DozerBeanMapper` in your code.

## Contribution

- Feel free to provide any suggestions & feature requests.