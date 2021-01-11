package ru.idcore;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHeaders;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static final ObjectMapper MAPPER = new ObjectMapper();
    public static final String REMOTE_SERVICE_URI = "https://cat-fact.herokuapp.com/facts";

    public static void main(String[] args) throws IOException {


        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setUserAgent("JavaCoreHTTP")
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)
                        .setSocketTimeout(3000)
                        .setRedirectsEnabled(false).build())
                .build();

        HttpGet request = new HttpGet(REMOTE_SERVICE_URI);
        request.setHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.getMimeType());

        CloseableHttpResponse response = httpClient.execute(request);

        List<Fact> factList = MAPPER.readValue(response.getEntity().getContent(), new TypeReference<>() {
        });

        factList.forEach(System.out::println);

        System.out.println("\nОтфильтрованные факты ");
        factList.stream()
                .filter(fact -> fact.getCreatedAt().startsWith("2018-03"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
