// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteEngineConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pairec-cn-***test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteEngineConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEngineConfigRequest self = new DeleteEngineConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEngineConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
