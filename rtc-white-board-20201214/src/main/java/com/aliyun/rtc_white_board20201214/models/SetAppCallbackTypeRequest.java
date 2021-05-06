// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class SetAppCallbackTypeRequest extends TeaModel {
    // 白板应用唯一标识符
    @NameInMap("AppID")
    public String appID;

    // 白板应用回调类型
    @NameInMap("AppCallbackType")
    public String appCallbackType;

    public static SetAppCallbackTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAppCallbackTypeRequest self = new SetAppCallbackTypeRequest();
        return TeaModel.build(map, self);
    }

    public SetAppCallbackTypeRequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

    public SetAppCallbackTypeRequest setAppCallbackType(String appCallbackType) {
        this.appCallbackType = appCallbackType;
        return this;
    }
    public String getAppCallbackType() {
        return this.appCallbackType;
    }

}
