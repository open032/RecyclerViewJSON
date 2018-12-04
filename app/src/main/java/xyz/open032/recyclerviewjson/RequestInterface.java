package xyz.open032.recyclerviewjson;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    //@GET("android/jsonandroid")
    @GET("api/v3/bash/quotes?sort=time")
    Call<JSONResponse> getJSON();
}
