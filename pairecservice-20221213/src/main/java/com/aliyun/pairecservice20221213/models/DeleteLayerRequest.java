// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteLayerRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteLayerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLayerRequest self = new DeleteLayerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLayerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
