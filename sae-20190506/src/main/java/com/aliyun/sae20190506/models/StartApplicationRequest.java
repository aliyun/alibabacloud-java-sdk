// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class StartApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static StartApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartApplicationRequest self = new StartApplicationRequest();
        return TeaModel.build(map, self);
    }

    public StartApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
