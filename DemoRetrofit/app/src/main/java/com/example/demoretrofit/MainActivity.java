package com.example.demoretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private APIService mAPIService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAPIService = ApiUtils.getAPIService();
//        mAPIService.getBooks().observeOn(AndroidSchedulers.mainThread())
//                .subscribeOn(Schedulers.io())
//                .subscribe(item -> Log.d("test", String.valueOf(item.size())), err -> Log.d("test", err.getMessage()));

//        mAPIService.saveBook(6, "Conan", "goso").enqueue(new Callback<Book>() {
//            @Override
//            public void onResponse(Call<Book> call, Response<Book> response) {
//                Log.d("test", "OK");
//            }
//
//            @Override
//            public void onFailure(Call<Book> call, Throwable t) {
//                Log.d("test", t.getMessage());
//            }
//        });
    }
}
