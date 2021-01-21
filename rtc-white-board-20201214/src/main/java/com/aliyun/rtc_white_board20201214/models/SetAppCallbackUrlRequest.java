// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class SetAppCallbackUrlRequest extends TeaModel {
    @NameInMap("AppID")
    public String appID;

    @NameInMap("AppCallbackUrl")
    public String appCallbackUrl;

    @NameInMap("AppCallbackAuthKey")
    public String appCallbackAuthKey;

    public static SetAppCallbackUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAppCallbackUrlRequest self = new SetAppCallbackUrlRequest();
        return TeaModel.build(map, self);
    }

    public SetAppCallbackUrlRequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

    public SetAppCallbackUrlRequest setAppCallbackUrl(String appCallbackUrl) {
        this.appCallbackUrl = appCallbackUrl;
        return this;
    }
    public String getAppCallbackUrl() {
        return this.appCallbackUrl;
    }

    public SetAppCallbackUrlRequest setAppCallbackAuthKey(String appCallbackAuthKey) {
        this.appCallbackAuthKey = appCallbackAuthKey;
        return this;
    }
    public String getAppCallbackAuthKey() {
        return this.appCallbackAuthKey;
    }

}
