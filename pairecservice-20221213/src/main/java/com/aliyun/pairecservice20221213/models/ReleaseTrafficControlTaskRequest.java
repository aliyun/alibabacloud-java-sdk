// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ReleaseTrafficControlTaskRequest extends TeaModel {
    @NameInMap("Environment")
    public String environment;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ReleaseTrafficControlTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseTrafficControlTaskRequest self = new ReleaseTrafficControlTaskRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseTrafficControlTaskRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ReleaseTrafficControlTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
