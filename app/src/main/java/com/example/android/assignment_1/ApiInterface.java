package com.example.android.assignment_1;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("posts")
    Call<User> getUsers();

}
