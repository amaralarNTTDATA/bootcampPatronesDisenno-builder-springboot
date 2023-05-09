package com.nttdata.bootcamp.retopatronbuilderspringboot.config;

import com.nttdata.bootcamp.retopatronbuilderspringboot.model.Person;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Configurable
public class MiConfig {

    @Bean("patronPrototype")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Person patronPrototype() {

        return Person.builder()
                .name("Maria")
                .age(56)
                .build();

    }

    @Bean("patronSingleton")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Person patronSingleton() {

        return Person.builder()
                .name("Paco")
                .age(33)
                .build();

    }

}
