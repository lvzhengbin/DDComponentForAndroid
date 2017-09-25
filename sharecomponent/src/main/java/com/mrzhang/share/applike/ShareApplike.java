package com.mrzhang.share.applike;

import com.mrzhang.component.componentlib.applicationlike.IApplicationLike;
import com.mrzhang.component.componentlib.router.ui.IComponentRouter;
import com.mrzhang.component.componentlib.router.ui.UIRouter;
import com.mrzhang.share.compouirouter.DemoUiRouter;
import com.mrzhang.share.compouirouter.ShareUIRouter;

/**
 * Created by mrzhang on 2017/6/15.
 */

public class ShareApplike implements IApplicationLike {

    UIRouter uiRouter = UIRouter.getInstance();
//    ShareUIRouter shareUIRouter = ShareUIRouter.getInstance();
    IComponentRouter demoUiRouter = UIRouter.fetch(DemoUiRouter.class);

    @Override
    public void onCreate() {
        uiRouter.registerUI(demoUiRouter);
    }

    @Override
    public void onStop() {
        uiRouter.unregisterUI(demoUiRouter);
    }
}
