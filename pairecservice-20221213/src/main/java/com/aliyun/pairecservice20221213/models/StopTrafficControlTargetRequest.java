// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StopTrafficControlTargetRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static StopTrafficControlTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTrafficControlTargetRequest self = new StopTrafficControlTargetRequest();
        return TeaModel.build(map, self);
    }

    public StopTrafficControlTargetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
