package com.android.mario.itmovie.listener;

/**
 * Created by Administrator on 2015/7/9.
 */
public interface CallbackListener<T> {

    /**
     * 请求响应结果成功时调用
     * @param data 返回的数据
     */
    public void onSuccess(T data);

    /**
     * 请求响应结果失败时调用
     * @param errorEvent 错误码
     * @param message 错误信息
     */
    public void onFailure(String errorEvent, String message);
}
