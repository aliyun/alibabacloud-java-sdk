// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteABMetricRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteABMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteABMetricRequest self = new DeleteABMetricRequest();
        return TeaModel.build(map, self);
    }

    public DeleteABMetricRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
