// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneFeatureConsistencyCheckJobConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CloneFeatureConsistencyCheckJobConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneFeatureConsistencyCheckJobConfigRequest self = new CloneFeatureConsistencyCheckJobConfigRequest();
        return TeaModel.build(map, self);
    }

    public CloneFeatureConsistencyCheckJobConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
