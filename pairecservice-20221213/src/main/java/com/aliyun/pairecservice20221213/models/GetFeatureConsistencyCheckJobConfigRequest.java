// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetFeatureConsistencyCheckJobConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetFeatureConsistencyCheckJobConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureConsistencyCheckJobConfigRequest self = new GetFeatureConsistencyCheckJobConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetFeatureConsistencyCheckJobConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
