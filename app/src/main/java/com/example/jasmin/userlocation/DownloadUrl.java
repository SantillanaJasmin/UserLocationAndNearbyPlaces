package com.example.jasmin.userlocation;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Jasmin on 4/18/2017.
 */
public class DownloadUrl {

    private String data;

    public String readUrl(String url) throws IOException {
        //Instantiate client
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response;
        try {
            //the request will be executed and the response - a JSON Object -  will be stored to String 'sResult'
            response = client.newCall(request).execute();
            data = response.body().string();

            return data;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
