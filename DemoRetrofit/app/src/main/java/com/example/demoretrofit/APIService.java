package com.example.demoretrofit;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface APIService {
    @POST("/books")
    @FormUrlEncoded
    Call<Book> saveBook(@Field("id") Integer id,
                        @Field("title") String title,
                        @Field("author") String author);

    @POST("/books")
    Call<Book> savebook2(@Body Book book);


    @GET("/books")
    Observable<List<Book>> getBooks();

    @GET("/books/{id}")
    Observable<List<Book>> getBooksById(@Path("id") Integer id);

    @GET("/books")
    Observable<List<Book>> getBooksOption(@QueryMap Map<String, String> options);
}
