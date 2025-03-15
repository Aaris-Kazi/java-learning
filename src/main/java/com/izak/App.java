package com.izak;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        OkHttpClient okHttpClient = new OkHttpClient();

        Request request = new Request.Builder().url("https://jsonplaceholder.typicode.com/posts/1").build();

        try (Response response = okHttpClient.newCall(request).execute()){

            assert response.body() != null;
            System.out.println(response.body().string());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }
}
