package com.reliab.yandexdriver;

import com.yandex.disk.rest.Credentials;
import com.yandex.disk.rest.RestClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class Configurations {

    private final ExternalProperties externalProperties;

    @Bean
    public RestClient restClient(){
        Credentials credentials = new Credentials(null, externalProperties.getOauth());
        RestClient restClient = new RestClient(credentials);

        return restClient;
    }
}
