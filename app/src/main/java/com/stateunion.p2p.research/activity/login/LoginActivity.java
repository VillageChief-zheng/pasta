package com.stateunion.p2p.research.activity.login;


import android.os.Bundle;
import android.os.CancellationSignal;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.stateunion.p2p.research.retrofit.RequestCommand;
import com.stateunion.p2p.research.retrofit.callback.DialogCallback;
import com.stateunion.p2p.research.retrofit.entiity.UserInfoBean;
import com.stateunion.p2p.research.util.ClickUtil;
import com.stateunion.p2p.research.util.OnSafetyClickListener;
import com.stateunion.p2p.research.view.baseactivity.BaseActivity;
import com.stateunion.p2p.research.widget.IImageCodeView;

import butterknife.BindView;
import butterknife.ButterKnife;
import research.p2p.stateunion.com.research.R;
import retrofit2.Call;

/**
 * Created by zhangguozheng on 2017/8/28.
 */
  public class LoginActivity extends BaseActivity implements IImageCodeView {
       @BindView(R.id.ed_name)
      EditText name;
    @BindView(R.id.ed_psw)
    EditText psw;
    @BindView(R.id.bt_login)
    Button logIn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        addClick();
    }
    private View.OnClickListener listener=new OnSafetyClickListener() {
        @Override
        public void onSafetyClick(View v) {
            switch (v.getId()) {
                case R.id.bt_login:
                    Toast.makeText(LoginActivity.this,"kk",Toast.LENGTH_SHORT).show();
                    confirm();
                    return;
            }
        }
    };
    private void addClick() {
        ClickUtil.setClickListener(listener, logIn);
    }
    private void confirm(){
        String nameVal=name.getText().toString();
        String pswVal=psw.getText().toString();
        RequestCommand.passWordLogin(new LoginCallBack(this),nameVal,pswVal,"a","123445");
    }
    private  static  class  LoginCallBack extends DialogCallback<UserInfoBean,LoginActivity> {

        public LoginCallBack(LoginActivity requestView) {
            super(requestView);
        }

        @Override
        protected void onResponseSuccess(UserInfoBean userInfoBean, Call<UserInfoBean> call) {
            super.onResponseSuccess(userInfoBean, call);
            Log.e("tag",userInfoBean.getCode());
            getAttachTarget().clearText();
         }
    }

    /**
     * 清除文本输入框内容
     */
    private void clearText() {
        name.setText("");
        psw.setText("");
    }
}
