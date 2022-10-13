// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SuspendJobRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Suspend")
    public Boolean suspend;

    public static SuspendJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendJobRequest self = new SuspendJobRequest();
        return TeaModel.build(map, self);
    }

    public SuspendJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SuspendJobRequest setSuspend(Boolean suspend) {
        this.suspend = suspend;
        return this;
    }
    public Boolean getSuspend() {
        return this.suspend;
    }

}
