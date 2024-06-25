// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class TerminateFeatureConsistencyCheckJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static TerminateFeatureConsistencyCheckJobRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateFeatureConsistencyCheckJobRequest self = new TerminateFeatureConsistencyCheckJobRequest();
        return TeaModel.build(map, self);
    }

    public TerminateFeatureConsistencyCheckJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
