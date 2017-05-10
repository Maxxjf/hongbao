package com.codeboy.qianghongbao.job;

import android.view.accessibility.AccessibilityEvent;

import com.codeboy.qianghongbao.IStatusBarNotification;
import com.codeboy.qianghongbao.QiangHongBaoService;
/**
 * <p>Created 16/12/16 上午1:16.</p>
 * <p><a href="mailto:841100358@qq.com">Email:841100358@qq.com</a></p>
 *
 * @author Max
 */
public interface AccessbilityJob {
    String getTargetPackageName();
    void onCreateJob(QiangHongBaoService service);
    void onReceiveJob(AccessibilityEvent event);
    void onStopJob();
    void onNotificationPosted(IStatusBarNotification service);
    boolean isEnable();
}
