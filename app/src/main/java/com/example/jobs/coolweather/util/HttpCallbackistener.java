package com.example.jobs.coolweather.util;

/**
 * Created by jobs on 2016/9/25.
 */

public interface HttpCallbackistener {
    void onFinish(String response);

    void onError(Exception e);
}
