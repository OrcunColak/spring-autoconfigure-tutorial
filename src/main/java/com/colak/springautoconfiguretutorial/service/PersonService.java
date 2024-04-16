package com.colak.springautoconfiguretutorial.service;

import com.colak.springautoconfiguretutorial.autoconfig.PersonProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class PersonService {
    private final PersonProperties properties;

    public void sayHello() {
        String message = String.format("hi，my name: %s, today, I'm %s , gender: %s",
                properties.getName(), properties.getAge(), properties.getSex());
        log.info(message);
    }
}
