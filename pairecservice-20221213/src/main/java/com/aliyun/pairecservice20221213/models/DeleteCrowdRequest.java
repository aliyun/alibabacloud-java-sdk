// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteCrowdRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteCrowdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCrowdRequest self = new DeleteCrowdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCrowdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
