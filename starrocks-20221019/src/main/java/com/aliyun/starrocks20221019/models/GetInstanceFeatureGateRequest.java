// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class GetInstanceFeatureGateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetInstanceFeatureGateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceFeatureGateRequest self = new GetInstanceFeatureGateRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceFeatureGateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
