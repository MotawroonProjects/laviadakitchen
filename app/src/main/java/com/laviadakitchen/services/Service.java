package com.laviadakitchen.services;



import com.laviadakitchen.models.OrderDataModel;
import com.laviadakitchen.models.StatusResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

    @GET("api/getOrderByType")
    Call<OrderDataModel> getOrders(
            @Query("type") String type
    );
    @GET("api/endMake")
    Call<StatusResponse> endOrder(
            @Query("sale_id") String sale_id
    );
}