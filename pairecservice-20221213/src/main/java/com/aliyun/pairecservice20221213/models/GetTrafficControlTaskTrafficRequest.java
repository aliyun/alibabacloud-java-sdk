// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTrafficControlTaskTrafficRequest extends TeaModel {
    @NameInMap("Environment")
    public String environment;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetTrafficControlTaskTrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficControlTaskTrafficRequest self = new GetTrafficControlTaskTrafficRequest();
        return TeaModel.build(map, self);
    }

    public GetTrafficControlTaskTrafficRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public GetTrafficControlTaskTrafficRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
