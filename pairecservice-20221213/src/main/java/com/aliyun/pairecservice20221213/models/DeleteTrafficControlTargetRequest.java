// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteTrafficControlTargetRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteTrafficControlTargetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficControlTargetRequest self = new DeleteTrafficControlTargetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficControlTargetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
