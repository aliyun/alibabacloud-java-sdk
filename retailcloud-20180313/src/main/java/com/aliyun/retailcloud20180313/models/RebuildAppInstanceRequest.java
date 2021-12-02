// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class RebuildAppInstanceRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AppInstanceId")
    public String appInstanceId;

    @NameInMap("EnvId")
    public Long envId;

    public static RebuildAppInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RebuildAppInstanceRequest self = new RebuildAppInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RebuildAppInstanceRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public RebuildAppInstanceRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public RebuildAppInstanceRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

}
