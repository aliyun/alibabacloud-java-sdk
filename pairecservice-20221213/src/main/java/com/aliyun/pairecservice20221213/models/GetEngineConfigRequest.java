// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetEngineConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pairec-cn-***test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetEngineConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEngineConfigRequest self = new GetEngineConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetEngineConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
