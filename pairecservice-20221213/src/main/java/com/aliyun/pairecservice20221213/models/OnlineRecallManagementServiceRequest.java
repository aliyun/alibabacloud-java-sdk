// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OnlineRecallManagementServiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pairec-cn-test123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static OnlineRecallManagementServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineRecallManagementServiceRequest self = new OnlineRecallManagementServiceRequest();
        return TeaModel.build(map, self);
    }

    public OnlineRecallManagementServiceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
