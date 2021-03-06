package com.coder.zzq.smartshow.snackbar;

import android.graphics.drawable.GradientDrawable;
import android.support.design.widget.Snackbar;

/**
 * Created by 朱志强 on 2017/11/12.
 */

public interface SnackbarCallback {

    void onSnackbarShown(Snackbar sb);

    void onSnackbarDismissed(Snackbar sb, int event);

}
