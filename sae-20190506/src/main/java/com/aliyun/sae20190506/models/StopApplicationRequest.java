// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class StopApplicationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static StopApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        StopApplicationRequest self = new StopApplicationRequest();
        return TeaModel.build(map, self);
    }

    public StopApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
