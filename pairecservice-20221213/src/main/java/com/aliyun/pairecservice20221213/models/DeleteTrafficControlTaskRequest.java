// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteTrafficControlTaskRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteTrafficControlTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficControlTaskRequest self = new DeleteTrafficControlTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficControlTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
