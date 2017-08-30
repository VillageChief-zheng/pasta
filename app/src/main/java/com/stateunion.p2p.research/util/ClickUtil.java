package com.stateunion.p2p.research.util;

import android.view.View;

/**
 * Created by zhangguozheng on 2017/8/28.
 */

public class ClickUtil {

    public static void setClickListener(View.OnClickListener l, Object... obj) {
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof View) {
                ((View) obj[i]).setOnClickListener(l);
            }

        }
    }
}
