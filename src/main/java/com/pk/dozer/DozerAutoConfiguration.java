package com.pk.dozer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePatternResolver;

@Configuration
public class DozerAutoConfiguration {

  @Autowired
  private ResourcePatternResolver resourcePatternResolver;

  @Bean
  public DozerBeanMapper dozerBeanMapper() throws IOException {
    Resource[] resources = resourcePatternResolver.getResources("classpath:dozer-mappings/*.xml");
    if (resources == null || resources.length == 0) {
      return new DozerBeanMapper();
    }

    List<String> mappingFiles = new ArrayList<String>();
    for (Resource resource : resources) {
      mappingFiles.add("dozer-mappings/" + resource.getFilename());
    }

    DozerBeanMapper mapper = new DozerBeanMapper(mappingFiles);
    return mapper;
  }

}
