// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StartTrafficControlTargetRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static StartTrafficControlTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        StartTrafficControlTargetRequest self = new StartTrafficControlTargetRequest();
        return TeaModel.build(map, self);
    }

    public StartTrafficControlTargetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
