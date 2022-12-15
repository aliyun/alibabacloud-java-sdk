// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class StartSDKInstanceProductionRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static StartSDKInstanceProductionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSDKInstanceProductionRequest self = new StartSDKInstanceProductionRequest();
        return TeaModel.build(map, self);
    }

    public StartSDKInstanceProductionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
