// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetABMetricRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetABMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetABMetricRequest self = new GetABMetricRequest();
        return TeaModel.build(map, self);
    }

    public GetABMetricRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
