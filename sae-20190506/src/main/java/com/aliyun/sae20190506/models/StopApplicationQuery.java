// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class StopApplicationQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    public static StopApplicationQuery build(java.util.Map<String, ?> map) throws Exception {
        StopApplicationQuery self = new StopApplicationQuery();
        return TeaModel.build(map, self);
    }

    public StopApplicationQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
