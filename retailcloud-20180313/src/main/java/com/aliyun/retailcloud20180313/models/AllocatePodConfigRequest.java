// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class AllocatePodConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("RequestId")
    public String requestId;

    public static AllocatePodConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocatePodConfigRequest self = new AllocatePodConfigRequest();
        return TeaModel.build(map, self);
    }

    public AllocatePodConfigRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public AllocatePodConfigRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public AllocatePodConfigRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
