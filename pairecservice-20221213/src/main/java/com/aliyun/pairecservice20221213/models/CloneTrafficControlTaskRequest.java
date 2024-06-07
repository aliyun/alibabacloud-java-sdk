// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneTrafficControlTaskRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static CloneTrafficControlTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneTrafficControlTaskRequest self = new CloneTrafficControlTaskRequest();
        return TeaModel.build(map, self);
    }

    public CloneTrafficControlTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
