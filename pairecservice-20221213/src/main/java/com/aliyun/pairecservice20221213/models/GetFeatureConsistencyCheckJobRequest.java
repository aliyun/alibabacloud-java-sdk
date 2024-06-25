// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetFeatureConsistencyCheckJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pairec-cn-********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetFeatureConsistencyCheckJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureConsistencyCheckJobRequest self = new GetFeatureConsistencyCheckJobRequest();
        return TeaModel.build(map, self);
    }

    public GetFeatureConsistencyCheckJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
