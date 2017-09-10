package org.huluo.moduletest;

import jdk.incubator.http.HttpRequest;

import java.net.URISyntaxException;
import java.sql.Date;

public class NewHttpClientTest {
    public static void main(String[] args) throws URISyntaxException {
        System.out.println(HttpRequest.class);

        Date  date = new Date(1L);

        System.out.println(date);
    }
}
