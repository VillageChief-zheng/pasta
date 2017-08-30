package com.stateunion.p2p.research.retrofit.view;

import android.app.Dialog;
import android.support.annotation.StyleRes;

import com.stateunion.p2p.research.view.baseactivity.BaseActivity;

/**
 * Created by admini on 2017/8/23.
 */

public interface IBaseDialogView {

    Dialog createDialog(@StyleRes int themeResId);

    void showError(String message);

    BaseActivity getBaseActivity();

    boolean isAlive();
}
