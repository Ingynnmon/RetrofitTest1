package com.app.retrofittest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String Base_URL="http://10.0.2.2/contactapp";
    public static Retrofit retrofit=null;

    public static Retrofit geApiClient(){
        if(retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(Base_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();

        }
        return  retrofit;
    }
}
