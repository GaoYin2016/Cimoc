package com.hiroshi.cimoc.ui.view;

import com.hiroshi.cimoc.component.DialogCaller;

/**
 * Created by Hiroshi on 2016/9/21.
 */

public interface MainView extends BaseView, DialogCaller {

    void onLastLoadSuccess(int source, String cid, String title, String cover);

    void onLastLoadFail();

    void onLastChange(int source, String cid, String title, String cover);

    void onUpdateReady();

}
