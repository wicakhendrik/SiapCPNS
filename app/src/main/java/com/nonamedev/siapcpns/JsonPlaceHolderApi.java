package com.nonamedev.siapcpns;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
public interface JsonPlaceHolderApi {
    @GET("cpns")
    Call<List<DataSoal>> getPosts();
}