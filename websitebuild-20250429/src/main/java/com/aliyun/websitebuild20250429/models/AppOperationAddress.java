// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AppOperationAddress extends TeaModel {
    @NameInMap("Actions")
    public java.util.List<AppOperateAction> actions;

    public static AppOperationAddress build(java.util.Map<String, ?> map) throws Exception {
        AppOperationAddress self = new AppOperationAddress();
        return TeaModel.build(map, self);
    }

    public AppOperationAddress setActions(java.util.List<AppOperateAction> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<AppOperateAction> getActions() {
        return this.actions;
    }

}
