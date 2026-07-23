// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ApplyEngineConfigRequest extends TeaModel {
    /**
     * <p>The instance ID. You can obtain this by calling the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> API.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-***test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ApplyEngineConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyEngineConfigRequest self = new ApplyEngineConfigRequest();
        return TeaModel.build(map, self);
    }

    public ApplyEngineConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
