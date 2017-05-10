package com.codeboy.qianghongbao;

import android.app.Notification;

/**
 * <p>Created 16/12/16 上午1:16.</p>
 * <p><a href="mailto:841100358@qq.com">Email:841100358@qq.com</a></p>
 *
 * @author Max
 */
public interface IStatusBarNotification {

    String getPackageName();
    Notification getNotification();
}
