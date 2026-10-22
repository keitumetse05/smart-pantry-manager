package com.example.smartpantrymanager.api;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class RetrofitClient {
    private static ApiService api;

    public static ApiService getApi() {
        if (api == null) {
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(chain -> chain.proceed(
                            chain.request().newBuilder()
                                    .addHeader("apikey", SupabaseConfig.ANON_KEY)
                                    .addHeader("Authorization", "Bearer " + SupabaseConfig.ANON_KEY)
                                    .addHeader("Prefer", "return=representation")
                                    .build()))
                    .build();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(SupabaseConfig.URL + "/rest/v1/")
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            api = retrofit.create(ApiService.class);
        }
        return api;
    }
}

