// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetLayerRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetLayerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLayerRequest self = new GetLayerRequest();
        return TeaModel.build(map, self);
    }

    public GetLayerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
