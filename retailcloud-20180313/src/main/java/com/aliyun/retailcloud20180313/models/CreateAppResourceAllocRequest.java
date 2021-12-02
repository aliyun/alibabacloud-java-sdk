// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class CreateAppResourceAllocRequest extends TeaModel {
    @NameInMap("AppEnvId")
    public Long appEnvId;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("ClusterId")
    public String clusterId;

    public static CreateAppResourceAllocRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppResourceAllocRequest self = new CreateAppResourceAllocRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppResourceAllocRequest setAppEnvId(Long appEnvId) {
        this.appEnvId = appEnvId;
        return this;
    }
    public Long getAppEnvId() {
        return this.appEnvId;
    }

    public CreateAppResourceAllocRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public CreateAppResourceAllocRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
