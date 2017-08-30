package com.stateunion.p2p.research.retrofit;

        import android.util.Log;

        import com.stateunion.p2p.research.retrofit.callback.RequestCallback;

        import retrofit2.Call;

/**
 * Created by zhanguozheng on 2017/8/25.
 */

public class RequestCommand {
    private static void send(Call call, RequestCallback callback) {
        callback.onPreRequest(call);
        call.enqueue(callback);
    }
    public static void call(RequestCallback callback, Call call) {
        send(call, callback);
    }

    private static ServiceApi getApi() {
        return RetrofitBuilder.getServiceApiInstance();
    }

    //密码登录
    public static void passWordLogin(RequestCallback callback, String useLoginName,
                                     String useLoginPswd, String identify, String uuid) {
        Call call = getApi().passwordLogin(useLoginName, useLoginPswd, identify, uuid);
        send(call, callback);
    }
}
